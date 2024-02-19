package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;

/**
 * - Caso em situações onde já exista um 'Comparable' implementado a um objeto,
 * mas é preciso fazer uma ordenação de outro atributo, se implementa o
 * 'Comparator' customizado, que vai implementar o método 'campare()';
 */
public class Aula171SortingListsComparator {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>();

		mangas.add(new Manga(5L, "Bleach", 29.90));
		mangas.add(new Manga(7L, "Pokemon", 15.10));
		mangas.add(new Manga(23L, "Dragon Ball", 22.90));
		mangas.add(new Manga(65L, "One Punch-Man", 22.90));
		mangas.add(new Manga(8L, "Naruto", 22.50));
		mangas.add(new Manga(2L, "Dragon Ball Z", 15.90));

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		// Collections.sort(mangas, new MangaByIdComparator());
		mangas.sort(new MangaByIdComparator()); // outra forma de se ordernar

		System.out.print("\nLista ordenada (crescente): \n");
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}

}

class MangaByIdComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga manga, Manga otherManga) {
		return manga.getId().compareTo(otherManga.getId());
	}

}
