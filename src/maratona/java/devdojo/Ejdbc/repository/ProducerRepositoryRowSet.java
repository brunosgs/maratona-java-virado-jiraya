package maratona.java.devdojo.Ejdbc.repository;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.conn.ConnectionFactory;
import maratona.java.devdojo.Ejdbc.dominio.Producer;

@Log4j2
public class ProducerRepositoryRowSet {
	public static List<Producer> findByNameJdbcRowSet(String paramsName) {
		String sql = "select * from producer where name like ?;";
		List<Producer> producers = new ArrayList<>();

		try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
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
