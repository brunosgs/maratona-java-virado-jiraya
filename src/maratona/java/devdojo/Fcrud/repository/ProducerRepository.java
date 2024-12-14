package maratona.java.devdojo.Fcrud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Fcrud.conn.ConnectionFactory;
import maratona.java.devdojo.Fcrud.dominio.Producer;

@Log4j2
public class ProducerRepository {
	public static List<Producer> findByName(String paramsName) {
		log.info("Finding Producer by name '{}'", paramsName);

		List<Producer> producers = new ArrayList<>();

		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = createPreparedStatementFindByName(conn, paramsName);
				ResultSet rs = pstmt.executeQuery()) {
			producers.addAll(resultFind(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}

		return producers;
	}

	public static void delete(Long id) {
		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pstmt = createPreparedStatementDelete(conn, id)) {
			pstmt.execute();
			log.info("Deleted producer '{}' from the database", id);
		} catch (SQLException e) {
			log.error("Error while trying to delete producer: '{}'", id, e);
		}
	}

	public static void save(Producer producer) {
		log.info("Saving producer by name '{}'", producer.getName());

		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = createPreparedStatementSave(conn, producer)) {
			pstmt.execute();
		} catch (SQLException e) {
			log.error("Error while trying to saiving producer: '{}'", producer, e);
		}
	}

	/**
	 * - O 'PreparedStatement' serve para pre compilar o SQL e evitar também o SQL
	 * injection;
	 */
	private static PreparedStatement createPreparedStatementFindByName(Connection conn, String paramsName) throws SQLException {
		// Wildcard '?'
		String sql = "select * from producer where name like ?;";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, String.format("%%%s%%", paramsName));

		return pstmt;
	}

	private static PreparedStatement createPreparedStatementDelete(Connection conn, Long id) throws SQLException {
		// Wildcard '?'
		String sql = "delete from producer where id =  ?;";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setLong(1, id);

		return pstmt;
	}

	private static PreparedStatement createPreparedStatementSave(Connection conn, Producer producer) throws SQLException {
		// Wildcard '?'
		String sql = "insert into producer (name, date_to) values (?, ?);";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, producer.getName());
		pstmt.setTimestamp(2, Timestamp.valueOf(producer.getDateTo()));

		return pstmt;
	}

	private static List<Producer> resultFind(ResultSet rs) throws SQLException {
		List<Producer> producers = new ArrayList<>();

		while (rs.next()) {
			producers.add(builderProducer(rs));
		}

		return producers;
	}

	private static Producer builderProducer(ResultSet rs) throws SQLException {
		Long id = rs.getLong("id");
		String name = rs.getString("name");
		Timestamp timestamp = rs.getTimestamp("date_to");

		return Producer.builder()
				.id(id)
				.name(name)
				.dateTo(timestamp.toLocalDateTime())
				.build();
	}
}
