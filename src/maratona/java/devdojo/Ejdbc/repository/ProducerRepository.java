package maratona.java.devdojo.Ejdbc.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
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
		String sql = "select * from producer;";

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
		String sql = "select * from producer where name like '%%%s%%';".formatted(paramsName);

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			producers.addAll(resultFind(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}

		return producers;
	}

	public static void showProducerMetaData() {
		log.info("Showing Producer Metadata");

		String sql = "select * from producer";

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			ResultSetMetaData metaData = rs.getMetaData();
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

	public static void showDriverMetaData() {
		log.info("Showing Driver Metadata");

		try (Connection conn = ConnectionFactory.getConnection()) {
			DatabaseMetaData dbMetaData = conn.getMetaData();

			/**
			 * ResultSet.TYPE_FORWARD_ONLY
			 * <p>
			 * - Navegação: Este é o tipo padrão de ResultSet. Ele permite que você mova o
			 * cursor apenas para frente, de uma linha para a próxima. Você não pode voltar
			 * para linhas anteriores.
			 * <p>
			 * - Uso: É eficiente em termos de recursos e adequado para iteração simples de
			 * resultados.
			 */
			if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				log.info("Supports TYPE_FORWARD_ONLY");

				if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					log.info("And supports CONCUR_UPDATABLE");
				}
			}

			/**
			 * - ResultSet.TYPE_SCROLL_INSENSITIVE
			 * <p>
			 * - Navegação: Permite que o cursor se mova para frente e para trás. Você pode
			 * navegar livremente pelo conjunto de resultados.
			 * <p>
			 * - Sensibilidade: Insensível a alterações. Isso significa que se os dados no
			 * banco de dados forem alterados enquanto você está iterando pelo ResultSet,
			 * essas mudanças não serão refletidas no ResultSet.
			 * <p>
			 * - Uso: Útil quando você precisa navegar de forma arbitrária pelos resultados,
			 * sem se preocupar com alterações subsequentes aos dados no banco de dados.
			 */
			if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				log.info("Supports TYPE_SCROLL_INSENSITIVE");

				if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					log.info("And supports CONCUR_UPDATABLE");
				}
			}

			/**
			 * - ResultSet.TYPE_SCROLL_SENSITIVE
			 * <p>
			 * - Navegação: Permite que o cursor se mova para frente e para trás. Você pode
			 * navegar livremente pelo conjunto de resultados.
			 * <p>
			 * - Sensibilidade: Sensível a alterações. Se os dados no banco de dados forem
			 * modificados enquanto você estiver iterando, o ResultSet será atualizado para
			 * refletir essas mudanças.
			 * <p>
			 * - Uso: Útil quando você precisa navegar de forma arbitrária e deseja ver as
			 * alterações feitas nos dados enquanto está processando o ResultSet.
			 */
			if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				log.info("Supports TYPE_SCROLL_SENSITIVE");

				if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					log.info("And supports CONCUR_UPDATABLE");
				}
			}

			/**
			 * - ResultSet.CONCUR_UPDATABLE
			 * <p>
			 * - Concorrência: Este modo permite que você atualize os dados no conjunto de
			 * resultados. Você pode usar métodos como updateRow(), insertRow() e
			 * deleteRow() para modificar diretamente os dados no ResultSet.
			 * <p>
			 * - Uso: Ideal para aplicações onde você precisa manipular os dados diretamente
			 * a partir do ResultSet, como uma interface de usuário que permite edição de
			 * dados.
			 */
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}
	}

	/**
	 * - A chamadas last, first, absolute e relative estão movimentando o cursor no
	 * ResultSet. A cada chamada ele esta em um lugar diferente;
	 * <p>
	 * - Chamadas como isLast, isFirst, isBeforeFirst e is
	 */
	public static void showTypeScrollWorking() {
		log.info("Show TYPE_SCROLL_INSENSITIVE");

		String sql = "select * from producer;";

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(sql)) {

			rs.last();
			Producer resultFindLast = builderProducer(rs);
			log.info("Last result '{}'", resultFindLast);
			log.info("Row number '{}'", rs.getRow());

			rs.first();
			Producer resultFindFirst = builderProducer(rs);
			log.info("First result '{}'", resultFindFirst);
			log.info("Row number '{}'", rs.getRow());

			rs.absolute(10);
			Producer resultFindAbsolute = builderProducer(rs);
			log.info("Absolute result '{}'", resultFindAbsolute);
			log.info("Row number '{}'", rs.getRow());

			rs.relative(-2);
			Producer resultFindRelative = builderProducer(rs);
			log.info("Absolute result '{}'", resultFindRelative);
			log.info("Row number '{}'", rs.getRow());

			log.info("Row is last? '{}'", rs.isLast());
			log.info("Row is first? '{}'", rs.isFirst());
			log.info("Row is after last? '{}'", rs.isAfterLast());
			log.info("Row is before first? '{}'", rs.isBeforeFirst());

			rs.last(); // Aponta para o ultimo
			rs.next(); // Aponta para o proximo

			// Retorna para o ultimo e depois faz a sequencia...
			while (rs.previous()) {
				log.info(builderProducer(rs));
			}
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}
	}

	public static List<Producer> findByNameAndUpdateToUpperCase(String paramsName) {
		log.info("Finding by name Producers");

		List<Producer> producers = new ArrayList<>();
		String sql = "select * from producer where name like '%%%s%%';".formatted(paramsName);

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(sql)) {

			producers.addAll(resultFindUpdateToUpperCase(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find by name producers", e);
		}

		return producers;
	}

	public static List<Producer> findByNameAndInsertWhenNotFound(String paramsName) {
		log.info("Finding by name Producers or insert when not found");

		String sql = "select * from producer where name like '%%%s%%';".formatted(paramsName);

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(sql)) {

			if (!rs.next()) {
				insertNewProducer(rs, paramsName);
				rs.beforeFirst();

				return resultFind(rs);
			}

			rs.beforeFirst();

			return resultFind(rs);
		} catch (SQLException e) {
			log.error("Error while trying to find by name producers", e);
		}

		return new ArrayList<Producer>();
	}

	public static void findByNameAndDelete(String paramsNames) {
		String sql = "select * from producer where name like '%%%s%%';".formatted(paramsNames);

		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				log.info("Deleting '{}'", rs.getString("name"));
				rs.deleteRow();
			}
		} catch (SQLException e) {
			log.error("Error while trying to delete producers by name", e);
		}
	}

	public static List<Producer> findByNamePreparedStatement(String paramsName) {
		log.info("Finding by name prepared statement Producers");

		List<Producer> producers = new ArrayList<>();

		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = preparedStatementFindByName(conn, paramsName);
				ResultSet rs = pstmt.executeQuery()) {
			producers.addAll(resultFind(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}

		return producers;
	}

	public static void updateProducerPreparedStatement(Producer producer) {
		try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement pstmt = preparedStatementUpdate(conn, producer)) {
			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected <= 0) {
				log.info("Producer not found to update, rows affected '{}'", rowsAffected);
			} else {
				log.info("Updated producer id '{}', rows affected '{}'", producer.getId(), rowsAffected);
			}
		} catch (SQLException e) {
			log.error("Error while trying to update producer id: '{}'", producer.getId(), e);
		}
	}

	public static List<Producer> findByNameCallableStatement(String paramsName) {
		log.info("Finding by name callable Producers");

		List<Producer> producers = new ArrayList<>();

		try (Connection conn = ConnectionFactory.getConnection();
				CallableStatement callst = callableStatementFindByName(conn, paramsName);
				ResultSet rs = callst.executeQuery()) {
			producers.addAll(resultFind(rs));
		} catch (SQLException e) {
			log.error("Error while trying to find all producers", e);
		}

		return producers;
	}

	private static void insertNewProducer(ResultSet rs, String paramsName) throws SQLException {
		/**
		 * - 'moveToInsertRow()'
		 * <p>
		 * Move o cursor para a linha de inserção. A posição atual do cursor é lembrada
		 * enquanto o cursor está posicionado na linha de inserção. A linha de inserção
		 * é uma linha especial associada a um conjunto de resultados atualizável. É
		 * essencialmente um buffer onde uma nova linha pode ser construída chamando os
		 * métodos do atualizador antes de inserir a linha no conjunto de resultados.
		 * Apenas os métodos do atualizador, getter e insertRow podem ser chamados
		 * quando o cursor está na linha de inserção. Todas as colunas em um conjunto de
		 * resultados devem receber um valor cada vez que este método for chamado antes
		 * de chamar insertRow. Um método do atualizador deve ser chamado antes que o
		 * método agetter possa ser chamado em um valor de coluna.
		 */
		rs.moveToInsertRow();
		rs.updateString("name", paramsName);
		rs.updateTimestamp("date_to", Timestamp.valueOf(LocalDateTime.now()));
		rs.insertRow();
		log.info("Name not found, but a new Producer was inserted.");
	}

	private static List<Producer> resultFind(ResultSet rs) throws SQLException {
		List<Producer> producers = new ArrayList<>();

		while (rs.next()) {
			producers.add(builderProducer(rs));
		}

		return producers;
	}

	private static List<Producer> resultFindUpdateToUpperCase(ResultSet rs) throws SQLException {
		List<Producer> producers = new ArrayList<>();

		/**
		 * Executa a atualização do campo e persiste em banco com 'updateRow()' a
		 * informação localizada;
		 */
		while (rs.next()) {
			rs.updateString("name", rs.getString("name")
					.toUpperCase());
			rs.updateRow();
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

	/**
	 * - O 'PreparedStatement' serve para pre compilar o SQL e evitar também o SQL
	 * injection;
	 */
	private static PreparedStatement preparedStatementFindByName(Connection conn, String paramsName) throws SQLException {
		// Wildcard '?'
		String sql = "select * from producer where name like ?;";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, String.format("%%%s%%", paramsName));

		return pstmt;
	}

	private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
		// Wildcard '?'
		String sql = "update producer set name = ? where id = ?;";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, producer.getName());
		pstmt.setLong(2, producer.getId());

		return pstmt;
	}

	private static CallableStatement callableStatementFindByName(Connection conn, String paramsName) throws SQLException {
		// Wildcard '?'
		String sql = "call pc_get_producer_by_name(?);";
		CallableStatement callst = conn.prepareCall(sql);

		callst.setString(1, paramsName);

		return callst;
	}
}