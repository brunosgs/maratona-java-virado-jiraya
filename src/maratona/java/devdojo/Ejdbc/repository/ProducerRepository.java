package maratona.java.devdojo.Ejdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import maratona.java.devdojo.Ejdbc.conn.ConnectionFactory;
import maratona.java.devdojo.Ejdbc.dominio.Producer;

public class ProducerRepository {
	public static void save(Producer producer) {
		String sql = "insert into producer (name) values ('%s');".formatted(producer.getName());

		try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
			int rowsAffected = stmt.executeUpdate(sql);

			System.out.println(rowsAffected);

			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}