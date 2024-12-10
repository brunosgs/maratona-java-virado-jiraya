package maratona.java.devdojo.Ejdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.conn.ConnectionFactory;
import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.listener.CustomRowSetListener;

@Log4j2
public class ProducerRepositoryRowSet {
	public static List<Producer> findByNameJdbcRowSet(String paramsName) {
		String sql = "select * from producer where name like ?;";
		List<Producer> producers = new ArrayList<>();

		try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
			jrs.addRowSetListener(new CustomRowSetListener());
			jrs.setCommand(sql);
			jrs.setString(1, String.format("%%%s%%", paramsName));
			jrs.execute();

			while (jrs.next()) {
				producers.add(builderProducer(jrs));
			}
		} catch (SQLException e) {
			log.error("Error while trying to find by name producers with jdbc row set", e);
		}

		return producers;
	}

	public static void updateJdbcRowSet(Producer producer) {
		String sql = "select * from producer where id = ?;";

		try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
			jrs.addRowSetListener(new CustomRowSetListener());
			jrs.setCommand(sql);
			jrs.setLong(1, producer.getId());
			jrs.execute();

			if (!jrs.next()) {
				return;
			}

			jrs.updateString("name", producer.getName());
			jrs.updateRow();
		} catch (SQLException e) {
			log.error("Error while trying to find by name producers with jdbc row set", e);
		}
	}

	public static void updateCachedRowSet(Producer producer) {
		String sql = "select * from producer where id = ?;";

		/*
		 * Todas alterações executadas via CachedRowSet, teram que ser reenviadas ao
		 * banco de dados.
		 */
		try (CachedRowSet crs = ConnectionFactory.getCachedRowSet(); Connection conn = ConnectionFactory.getConnection()) {
			conn.setAutoCommit(false); // Banco de dados não fica mais responsável por atualizar
			crs.setCommand(sql);
			crs.setLong(1, producer.getId());
			crs.execute(conn);

			if (!crs.next()) {
				return;
			}

			crs.updateString("name", producer.getName());
			crs.updateRow();

			TimeUnit.SECONDS.sleep(10);

			/*
			 * 'acceptChanges()' força a atualização, sendo que o proprio driver do mysql
			 * cuida dessa atualização (autocomit=true).
			 */
			crs.acceptChanges();
		} catch (SQLException | InterruptedException e) {
			log.error("Error while trying to find by name producers with jdbc row set", e);
		}
	}

	private static Producer builderProducer(JdbcRowSet jrs) throws SQLException {
		Long id = jrs.getLong("id");
		String name = jrs.getString("name");
		Timestamp timestamp = jrs.getTimestamp("date_to");

		return Producer.builder()
				.id(id)
				.name(name)
				.dateTo(timestamp.toLocalDateTime())
				.build();
	}
}
