package maratona.java.devdojo.Fcrud.conn;

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
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/anime_store";
		String username = "root";
		String password = "root";

		return DriverManager.getConnection(url, username, password);
	}
}
