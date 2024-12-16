package maratona.java.devdojo.Fcrud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Fcrud.conn.ConnectionFactory;
import maratona.java.devdojo.Fcrud.dominio.Anime;
import maratona.java.devdojo.Fcrud.dominio.Producer;

@Log4j2
public class AnimeRepository {
	public static void delete(Long id) {
		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pstmt = createPreparedStatementDelete(conn, id)) {
			pstmt.execute();
			log.info("Deleted anime '{}' from the database", id);
		} catch (SQLException e) {
			log.error("Error while trying to delete anime: '{}'", id, e);
		}
	}

	public static void save(Anime anime) {
		log.info("Saving anime by name '{}'", anime.getName());

		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pstmt = createPreparedStatementSave(conn, anime)) {
			pstmt.execute();
		} catch (SQLException e) {
			log.error("Error while trying to saiving anime: '{}'", anime, e);
		}
	}

	public static void update(Anime anime) {
		log.info("Updating the anime: '{}'", anime.getName());

		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = createPreparedStatementUpdate(conn, anime)) {
			pstmt.execute();
		} catch (SQLException e) {
			log.error("Error while trying to saving anime: '{}'", anime, e);
		}
	}

	public static List<Anime> findByName(String paramsName) {
		log.info("Finding Anime by name '{}'", paramsName);

		List<Anime> animes = new ArrayList<>();

		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = createPreparedStatementFindByName(conn, paramsName);
				ResultSet rs = pstmt.executeQuery()) {
			animes.addAll(resultFind(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find all animes", e);
		}

		return animes;
	}

	public static Optional<Anime> findById(Long paramId) {
		log.info("Finding Anime by id '{}'", paramId);

		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = createPreparedStatementFindById(conn, paramId);
				ResultSet rs = pstmt.executeQuery()) {
			if (!rs.first()) {
				return Optional.empty();
			}

			rs.beforeFirst();

			return Optional.of(resultFind(rs).get(0));
		} catch (SQLException e) {
			log.error("Error while trying to find all animes", e);
		}

		return Optional.empty();
	}

	private static List<Anime> resultFind(ResultSet rs) throws SQLException {
		List<Anime> animes = new ArrayList<>();

		while (rs.next()) {
			animes.add(builderAnime(rs));
		}

		return animes;
	}

	private static Anime builderAnime(ResultSet rs) throws SQLException {
		Long animeId = rs.getLong("id");
		String animeName = rs.getString("name");
		int animeEpisodes = rs.getInt("episodes");
		Timestamp animeDateTo = rs.getTimestamp("date_to");
		Long producerId = rs.getLong("producer_id");
		String producerName = rs.getString("producer_name");
		Timestamp producerDateTo = rs.getTimestamp("producer_date_to");

		Producer producerToBd = Producer.builder()
				.id(producerId)
				.name(producerName)
				.dateTo(producerDateTo.toLocalDateTime())
				.build();

		return Anime.builder()
				.id(animeId)
				.name(animeName)
				.episodeos(animeEpisodes)
				.dateTo(animeDateTo.toLocalDateTime())
				.producer(producerToBd)
				.build();
	}

	/**
	 * - O 'PreparedStatement' serve para pre compilar o SQL e evitar também o SQL
	 * injection;
	 */
	private static PreparedStatement createPreparedStatementDelete(Connection conn, Long paramId) throws SQLException {
		// Wildcard '?'
		String sql = "delete from anime where id =  ?;";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setLong(1, paramId);

		return pstmt;
	}

	private static PreparedStatement createPreparedStatementSave(Connection conn, Anime paramAnime) throws SQLException {
		// Wildcard '?'
		String sql = "insert into anime (name, episodes, date_to, producer_id) values (?, ?, ?, ?);";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, paramAnime.getName());
		pstmt.setInt(2, paramAnime.getEpisodeos());
		pstmt.setTimestamp(3, Timestamp.valueOf(paramAnime.getDateTo()));
		pstmt.setLong(4, paramAnime.getProducer()
				.getId());

		return pstmt;
	}

	private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
		// Wildcard '?'
		String sql = """
				update anime
				set name = ?, episodes = ?
				where id = ?;
				""";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, anime.getName());
		pstmt.setInt(2, anime.getEpisodeos());
		pstmt.setLong(3, anime.getId());

		return pstmt;
	}

	private static PreparedStatement createPreparedStatementFindById(Connection conn, Long paramId) throws SQLException {
		// Wildcard '?'
		String sql = """
				select a.id,
					   a.name,
					   a.episodes,
					   a.date_to,
					   p.id as producer_id,
					   p.name as producer_name,
					   p.date_to as producer_date_to
				from anime a join producer p on p.id = a.producer_id
				where a.id = ?;
				     """;
		PreparedStatement pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		pstmt.setLong(1, paramId);

		return pstmt;
	}

	private static PreparedStatement createPreparedStatementFindByName(Connection conn, String paramName) throws SQLException {
		// Wildcard '?'
		String sql = """
				select a.id,
					   a.name,
					   a.episodes,
					   a.date_to,
					   p.id as producer_id,
					   p.name as producer_name,
					   p.date_to as producer_date_to
				from anime a join producer p on p.id = a.producer_id
				where a.name like ?;
				     """;
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());

		pstmt.setString(1, String.format("%%%s%%", paramName));

		return pstmt;
	}

}
