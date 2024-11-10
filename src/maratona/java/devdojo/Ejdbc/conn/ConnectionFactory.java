package maratona.java.devdojo.Ejdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * - O JDBC (Java Database Connectivity) é uma API (Application Programming
 * Interface) do Java que permite a conexão e interação com bancos de dados
 * relacionais.
 * <p>
 * - java.sql = Connection, Statement, ResultSet e DriverManager
 */
public class ConnectionFactory {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/anime_store";
		String username = "root";
		String password = "root";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
