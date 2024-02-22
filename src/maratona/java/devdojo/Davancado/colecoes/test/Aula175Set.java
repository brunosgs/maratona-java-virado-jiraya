package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.HashSet;
import java.util.Set;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;

/**
 * - O Set não permite elementos duplicados dentro da coleção;
 * <p>
 * - Ao impletar um 'new HashSet<>()', os elementos da lista são organizados
 * pelo Hash, assim não tem uma ordem definida pois ele verifica pelo equals e
 * conforme inserido elementos o Set pode se reorganizar por causa do seu Hash,
 * assim não tendo um índice definido;
 * <p>
 * - Ao implementar um Set e precisa que tenha definido pela inserção a
 * implementação de Set se usa o 'new LinkedHashSet<>()';
 */
public class Aula175Set {

	public static void main(String[] args) {
		Set<Manga> mangas = new HashSet<>();
		// Set<Manga> mangas = new LinkedHashSet<>();

		mangas.add(new Manga(5L, "Bleach", 29.90, 0));
		mangas.add(new Manga(7L, "Pokemon", 15.10, 5));
		mangas.add(new Manga(23L, "Dragon Ball", 22.90, 0));
		mangas.add(new Manga(65L, "One Punch-Man", 22.90, 2));
		mangas.add(new Manga(8L, "Naruto", 22.50, 0));
		mangas.add(new Manga(2L, "Dragon Ball Z", 15.90, 1));
		mangas.add(new Manga(2L, "Dragon Ball Z", 15.90, 1));

		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}

}
