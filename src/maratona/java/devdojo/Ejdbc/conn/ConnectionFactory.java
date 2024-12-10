package maratona.java.devdojo.Ejdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

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

	public static JdbcRowSet getJdbcRowSet() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/anime_store";
		String username = "root";
		String password = "root";

		JdbcRowSet jdbcRowSet = RowSetProvider.newFactory()
				.createJdbcRowSet();

		jdbcRowSet.setUrl(url);
		jdbcRowSet.setUsername(username);
		jdbcRowSet.setPassword(password);

		return jdbcRowSet;
	}
}
