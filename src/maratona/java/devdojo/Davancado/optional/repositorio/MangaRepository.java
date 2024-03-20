package maratona.java.devdojo.Davancado.optional.repositorio;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import maratona.java.devdojo.Davancado.optional.dominio.Manga;

/**
 * - Cria um findBy baseado no manga, e depois com o manga se trabalha o
 * 'Predicate' para fazer a localização dos itens solicitados;
 */
public class MangaRepository {
	private static List<Manga> mangas = List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "Bleach", 366));

	public static Optional<Manga> findByTitle(String title) {
		return findBy(m -> m.getTitle().contains(title));
	}

	public static Optional<Manga> findById(Integer id) {
		return findBy(m -> m.getId().equals(id));
	}

	private static Optional<Manga> findBy(Predicate<Manga> predicate) {
		Manga found = null;

		for (Manga manga : mangas) {
			if (predicate.test(manga)) {
				found = manga;
			}
		}

		return Optional.ofNullable(found);
	}
}
