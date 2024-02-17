package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * O 'Collections.sort()' quando utilizado em uma List de Strings ele reordena
 * em ordem ascendente (crescente) no menor para o maior. E para itens iteiros
 * segue o mesmo fluxo;
 */
public class Aula169SortingLists {

	public static void main(String[] args) {
		List<String> mangas = new ArrayList<>();
		List<Double> dinheiros = new ArrayList<>();

		mangas.add("Bleach");
		mangas.add("Pokemon");
		mangas.add("Dragon Ball");
		mangas.add("One Punch-Man");
		mangas.add("Naruto");
		mangas.add("Dragon Ball Z");

		System.out.println("Lista não ordernada: " + mangas);
		Collections.sort(mangas);
		System.out.println("Lista ordernada (crescente): " + mangas);

		dinheiros.add(100.21);
		dinheiros.add(23.98);
		dinheiros.add(21.21);
		dinheiros.add(98.10);

		System.out.println("\nLista não ordernada: " + dinheiros);
		Collections.sort(dinheiros);
		System.out.println("Lista ordernada (crescente): " + dinheiros);
	}

}
