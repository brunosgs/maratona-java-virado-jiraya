package maratona.java.devdojo.Ejdbc.repository;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
		String sql = "select id, name from producer;";

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
		String sql = "select id, name from producer where name like '%%%s%%';".formatted(paramsName);

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

	private static List<Producer> resultFind(ResultSet rs) throws SQLException {
		List<Producer> producers = new ArrayList<>();

		while (rs.next()) {
			Long id = rs.getLong("id");
			String name = rs.getString("name");

			Producer producer = Producer.builder()
					.id(id)
					.name(name)
					.build();

			producers.add(producer);
		}

		return producers;
	}
}