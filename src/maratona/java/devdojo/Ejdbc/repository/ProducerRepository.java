package maratona.java.devdojo.Ejdbc.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.conn.ConnectionFactory;
import maratona.java.devdojo.Ejdbc.dominio.Producer;

/**
 * - Criado essa camada como repository para deixar as regras de negocio.
 */

@Log4j2
public class ProducerRepository {
	public static void save(Producer producer) {
		String sql = "insert into producer (name, date_to) values ('%s', '%s');".formatted(producer.getName(), producer.getDateTo());

		try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
			int rowsAffected = stmt.executeUpdate(sql);

			log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
		} catch (SQLException e) {
			log.error("Error while trying to insert producer '{}'", producer.getName(), e);
		}
	}

	public static void delete(Long id) {
		String sql = "delete from producer where id = %d;".formatted(id);

		try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected <= 0) {
				log.info("Producer not found to delete, rows affected '{}'", rowsAffected);
			} else {
				log.info("Deleted producer id '{}' from the database, rows affected '{}'", id, rowsAffected);
			}
		} catch (SQLException e) {
			log.error("Error while trying to delete producer id: '{}'", id, e);
		}
	}

	public static void update(Producer producer) {
		String sql = "update producer set name = '%s' where id = %d;".formatted(producer.getName(), producer.getId());

		try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected <= 0) {
				log.info("Producer not found to update, rows affected '{}'", rowsAffected);
			} else {
				log.info("Updated producer id '{}', rows affected '{}'", producer.getId(), rowsAffected);
			}
		} catch (SQLException e) {
			log.error("Error while trying to update producer id: '{}'", producer.getId(), e);
		}
	}

	/**
	 * - Para busca informações e depois converter para o objeto, deve se usar o
	 * ResultSet e seus métodos para extrair as informações que representa cada
	 * campo do objeto.
	 */
	public static List<Producer> findAll() {
		log.info("Finding all Producers");

		List<Producer> producers = new ArrayList<>();
		String sql = "select id, name from producer;";

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			producers.addAll(resultFind(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}

		return producers;
	}

	public static List<Producer> findByName(String paramsName) {
		log.info("Finding by name Producers");
		List<Producer> producers = new ArrayList<>();
		String sql = "select id, name from producer where name like '%%%s%%';".formatted(paramsName);

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			producers.addAll(resultFind(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}

		return producers;
	}

	public static void showProducerMetadata() {
		log.info("Showing Producer Metadata");

		String sql = "select * from producer";

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			ResultSetMetaData metaData = rs.getMetaData();

			rs.next();

			int columnCount = metaData.getColumnCount();

			for (int i = 1; i <= columnCount; i++) {
				log.info("Table name '{}'", metaData.getTableName(i));
				log.info("Column name '{}'", metaData.getColumnName(i));
				log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
				log.info("Column type '{}'", metaData.getColumnTypeName(i));
			}

			log.info("Columns count '{}'", columnCount);
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}
	}

	private static List<Producer> resultFind(ResultSet rs) throws SQLException {
		List<Producer> producers = new ArrayList<>();

		while (rs.next()) {
			Long id = rs.getLong("id");
			String name = rs.getString("name");

			Producer producer = Producer.builder()
					.id(id)
					.name(name)
					.build();

			producers.add(producer);
		}

		return producers;
	}
}