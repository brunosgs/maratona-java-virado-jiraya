package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;

/**
 * - O Binary Search faz uma busca na lista e retorna o indíce do objeto
 * localizado. Caso não encontro ele se baseia em uma regra;
 * <p>
 * - O retorno se baseando a regra sera sempre a posição que deveria ser
 * inserido, mas a soma de -1;
 * <p>
 * - Para que funcione de maneira esperada o algoritmo binary search, a lista
 * deve já estar ordenada, se não o resutado não será o esperado = 'undefined';
 */
public class Aula172BinarySearchManga {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>();

		mangas.add(new Manga(5L, "Bleach", 29.90));
		mangas.add(new Manga(7L, "Pokemon", 15.10));
		mangas.add(new Manga(23L, "Dragon Ball", 22.90));
		mangas.add(new Manga(65L, "One Punch-Man", 22.90));
		mangas.add(new Manga(8L, "Naruto", 22.50));
		mangas.add(new Manga(2L, "Dragon Ball Z", 15.90));

		System.out.println("Lista não ordernada:");
		for (Manga manga : mangas) {
			System.out.println("\t" + manga);
		}

		// Formas de fazer o sort()
		// Collections.sort(mangas, new MangaByIdComparator());
		mangas.sort(new MangaByIdComparator());
		// mangas.sort(Comparator.comparing(Manga::getId));

		System.out.println("\nLista ordernada:");
		for (Manga manga : mangas) {
			System.out.println("\t" + manga);
		}

		Manga mangaToSearch = new Manga(8L, "Naruto", 22.50);

		int findBinarySearch = Collections.binarySearch(mangas, mangaToSearch);

		System.out.println("\nValor: " + mangaToSearch);
		System.out.println("Binary Search localizou na posição: " + findBinarySearch);
	}

}
