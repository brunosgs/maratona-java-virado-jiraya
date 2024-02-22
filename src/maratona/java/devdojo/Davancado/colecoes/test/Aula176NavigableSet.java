package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;
import maratona.java.devdojo.Davancado.colecoes.dominio.Smartphone;

/**
 * - Para que a inserção em uma coleção 'NavigableSet' implementando 'new
 * TreeSet<>()' funcione corretamente, o objeto deve implementar 'Comparable' ou
 * deve se passar uma classe personalizada criando uma implementação de
 * 'Comparator' para a coleção;
 */
public class Aula176NavigableSet {

	public static void main(String[] args) {
		NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneComparatorMarca());
		NavigableSet<Manga> mangas = new TreeSet<>();

		smartphones.add(new Smartphone("2155", "Nokia"));

		System.out.println(smartphones + "\n");

		mangas.add(new Manga(5L, "Bleach", 29.90, 0));
		mangas.add(new Manga(7L, "Pokemon", 15.10, 5));
		mangas.add(new Manga(23L, "Dragon Ball", 22.90, 0));
		mangas.add(new Manga(65L, "One Punch-Man", 22.90, 2));
		mangas.add(new Manga(8L, "Naruto", 22.50, 0));
		mangas.add(new Manga(2L, "Dragon Ball Z", 15.90, 1));
		mangas.add(new Manga(2L, "One Piece", 27.45, 1));

		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}

}

class SmartphoneComparatorMarca implements Comparator<Smartphone> {

	@Override
	public int compare(Smartphone smartphone, Smartphone otherSmartphone) {
		return smartphone.getMarca().compareTo(otherSmartphone.getMarca());
	}

}
