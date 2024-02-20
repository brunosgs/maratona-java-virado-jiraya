package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;

/**
 * - Ao tentar remover um item de um List utilizando o foreach, aplicando o
 * metodo remove direto na List, não funciona corretamente. É lançado uma
 * exception, um o modo de remoção correta seria utilizando o 'Iterator'.
 */
public class Aula174Iterator {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>();

		mangas.add(new Manga(5L, "Bleach", 29.90, 0));
		mangas.add(new Manga(7L, "Pokemon", 15.10, 5));
		mangas.add(new Manga(23L, "Dragon Ball", 22.90, 0));
		mangas.add(new Manga(65L, "One Punch-Man", 22.90, 2));
		mangas.add(new Manga(8L, "Naruto", 22.50, 0));
		mangas.add(new Manga(2L, "Dragon Ball Z", 15.90, 1));

		Iterator<Manga> mangasInterator = mangas.iterator();

		while (mangasInterator.hasNext()) {
			if (mangasInterator.next().getQuantidade() == 0) {
				mangasInterator.remove();
			}
		}

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		// Forma de remoção utilizando programação funcional
		// mangas.removeIf(manga -> manga.getQuantidade() == 0);
	}

}
