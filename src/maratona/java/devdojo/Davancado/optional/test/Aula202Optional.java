package maratona.java.devdojo.Davancado.optional.test;

import java.util.Optional;

import maratona.java.devdojo.Davancado.optional.dominio.Manga;
import maratona.java.devdojo.Davancado.optional.repositorio.MangaRepository;

/**
 * - Exercício resolvido em aula
 */
public class Aula202Optional {

	public static void main(String[] args) {
		Optional<Manga> byTitle = MangaRepository.findByTitle("Boku no Hero");

		// Se existir faz alteração do nome
		byTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
		System.out.println(byTitle.get());

		// Se não existir, lança uma exception
		Manga byIdOrElseThrow = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
		System.out.println(byIdOrElseThrow);

		// Se não existir, cria um novo objeto com o nome
		String title = "Naruto";
		Manga byTitleOrElseNew = MangaRepository.findByTitle(title).orElse(new Manga(3, title, 500));

		System.out.println(byTitleOrElseNew);
	}

}
