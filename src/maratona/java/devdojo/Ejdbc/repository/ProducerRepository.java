package maratona.java.devdojo.Ejdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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

			conn.close();
			stmt.close();
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

			conn.close();
			stmt.close();
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

			conn.close();
			stmt.close();
		} catch (SQLException e) {
			log.error("Error while trying to update producer id: '{}'", producer.getId(), e);
		}
	}
}