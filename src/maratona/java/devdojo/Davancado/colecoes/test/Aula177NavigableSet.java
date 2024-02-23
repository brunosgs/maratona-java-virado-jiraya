package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;
import maratona.java.devdojo.Davancado.colecoes.dominio.Smartphone;

/**
 * - Quando implementado o 'new TreeSet<>()' ele não permitira elementos
 * duplicados porque ele se baseia no 'Comparator' ou 'Comparable';
 * <p>
 * - O método 'lower()' caso não encontre um objeto baseado em sua implementação
 * de comparação, que seja menor do que ele, retorna 'null'. Caso encontre, ele
 * retorna o primeiro objeto menor do que esta sendo passado pela comparação.
 * Ex: compara pelo preço, o preço é 15.20 e existem outros dois objetos com o
 * valor de 15.15 e 14.90, o retorno sera o objeto 15.15;
 * <p>
 * - O método 'floor()' ele executa da mesma forma que o 'lower()' só que o
 * porem é que se na comparação ele retornar um objeto igual ou o próximo menor
 * que ele;
 * <p>
 * - O método 'higher()' é o inverso de 'lower()', buscando assim o próximo
 * objeto que seja maior que ele na comparação implementada;
 * <p>
 * - E o método 'ceiling()' é o inverso de 'floor()', buscando assim o objeto de
 * valor igual ou maior;
 * <p>
 * - O método 'pollFirst()' retorna e remove o primeiro item da lista, baseado
 * na comparação implementada;
 * <p>
 * - O método 'pollFirst()' retorna e remove o primeiro item da lista, baseado
 * na comparação implementada;
 */
public class Aula177NavigableSet {

	public static void main(String[] args) {
		/*
		 * A lista de smartphones implementa um 'Comparator' que verificar a marca, dois
		 * objetos de marca iguais não são inseridos da lista. Já a lista mangas
		 * implementa em seu objeto um 'Comparable', sendo assim, o objeto Manga
		 * implementa o método 'compareTo()' que compara o preço, caso exitas dois
		 * preços iguais, só um objeto será inserido.
		 */
		NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneComparatorMarca2());
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

		// 'descendingSet()' pega ordernanda decrescente
		for (Manga manga : mangas.descendingSet()) {
			System.out.println(manga);
		}

		System.out.println("\nOrdem crescente");
		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		Manga yuyu = new Manga(28L, "Yuyu Hakusho", 15.10, 1);

		System.out.println("\nMenor que o valor " + yuyu.getPreco() + ": " + mangas.lower(yuyu));
		System.out.println("Menor ou igual a o valor " + yuyu.getPreco() + ": " + mangas.floor(yuyu));
		System.out.println("Maior que o valor " + yuyu.getPreco() + ": " + mangas.higher(yuyu));
		System.out.println("Maior ou igual a o valor " + yuyu.getPreco() + ": " + mangas.ceiling(yuyu));

		System.out.println("\nTamanho da lista " + mangas.size());
		System.out.println("Retorna e remove o primeiro item: " + mangas.pollFirst());
		System.out.println("Retorna e remove o último item: " + mangas.pollLast());
		System.out.println("Tamanho da lista " + mangas.size());

		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}

}

class SmartphoneComparatorMarca2 implements Comparator<Smartphone> {

	@Override
	public int compare(Smartphone smartphone, Smartphone otherSmartphone) {
		return smartphone.getMarca().compareTo(otherSmartphone.getMarca());
	}

}
