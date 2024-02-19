package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;

/**
 * - Collections.sort() para ser ordenado um objeto diferente de String e Double
 * que já possuem na sua implementação o método 'compareTo()', deve se
 * implementar na classe = objeto o Comparable<'T'> onde o mesmo será
 * obrigatória uma implementação de 'compareTo()';
 */
public class Aula170SortingListsComparable {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>();

		mangas.add(new Manga(5L, "Bleach", 29.90));
		mangas.add(new Manga(7L, "Pokemon", 15.10));
		mangas.add(new Manga(23L, "Dragon Ball", 22.90));
		mangas.add(new Manga(65L, "One Punch-Man", 22.90));
		mangas.add(new Manga(8L, "Naruto", 22.50));
		mangas.add(new Manga(2L, "Dragon Ball Z", 15.90));

		System.out.println(mangas);
		Collections.sort(mangas);
		System.out.println("\n" + mangas);
	}

}
