package maratona.java.devdojo.Ejdbc.test;

import java.sql.SQLException;

import maratona.java.devdojo.Ejdbc.conn.ConnectionFactory;

public class Aula256ConnectionJDBC {

	public static void main(String[] args) {
		try {
			ConnectionFactory.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
