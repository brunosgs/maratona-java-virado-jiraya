package maratona.java.devdojo.Ejdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.conn.ConnectionFactory;
import maratona.java.devdojo.Ejdbc.dominio.Producer;

@Log4j2
public class ProducerRepository {
	public static void save(Producer producer) {
		String sql = "insert into producer (name, date_to) values ('%s', '%s');".formatted(producer.getName(), producer.getDateTo());

		try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
			int rowsAffected = stmt.executeUpdate(sql);

			log.info("Inserted producer in the database, rows affected {}", rowsAffected);

			conn.close();
			stmt.close();

		} catch (SQLException e) {
			log.error("Error connect: ", e);
		}
	}
}