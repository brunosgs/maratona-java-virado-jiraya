package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

/**
 * - anyMatch() recebe um 'Predicate' onde é feito uma validação no
 * fluxo=stream. Caso um item seja satisfatório ele não percorre o fluxo
 * inteiro, se o fluxo=stream estiver vazio, então ele retorna false;
 * <p>
 * - allMatch() recebe um 'Predicate' onde é feito uma validação no
 * fluxo=stream. Caso todos os itens sejam satisfatórios, ele não percorre o
 * fluxo inteiro, se o fluxo=stream estiver vazio, então ele retorna true;
 * <p>
 * - noneMatch() recebe um 'Predicate' onde é feito uma validação no
 * fluxo=stream. Caso nenhum dos itens seja satisfatório, se o fluxo=stream
 * estiver vazio, então ele retorna true;
 * <p>
 * - findAny, findFirst e max retonam um 'Optional';
 */
public class Aula208StreamMatching {
	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 3.99),
					new LightNovel("Violet Evergarden", 15.99), new LightNovel("No Game no life", 2.99),
					new LightNovel("Fullmetal Alchemist", 5.99), new LightNovel("Kugo desuga", 1.99),
					new LightNovel("Kugo desuga", 1.99), new LightNovel("Monogatari", 4.99)));

	public static void main(String[] args) {
		boolean anyMatch = listLightNovel.stream()
				.anyMatch(ln -> ln.getPrice() > 8);

		boolean allMatch = listLightNovel.stream()
				.allMatch(ln -> ln.getPrice() > 0);

		boolean noneMatch = listLightNovel.stream()
				.noneMatch(ln -> ln.getPrice() < 0);

		System.out.println("Existem um item satisfatório?: " + anyMatch);
		System.out.println("Todos os itens são satisfatórios?: " + allMatch);
		System.out.println("Nenhum dos itens é satisfatório?: " + noneMatch);

		/**
		 * findAny(), retona um 'Optional' sem garantia de resultado, onde no exemplo
		 * foi filtrado, feito o find e depois verificado pelo Optional se ele esta
		 * prensente, se sim imprime;
		 */
		listLightNovel.stream()
				.filter(ln -> ln.getPrice() > 3)
				.findAny()
				.ifPresent(System.out::println);

		/**
		 * findFirst(), retorna o primeiro elemento da lista, onde no exemplo foi
		 * ordernando por preço do menor para o maior e depois revertido a ordenação que
		 * foi do maior para o menor, filtrado pelo preço e depois com o find e a partir
		 * disso verificado pelo Optional se ele esta prensente, se sim imprima;
		 */
		listLightNovel.stream()
				.sorted(Comparator.comparing(LightNovel::getPrice)
						.reversed()) // Compara pelo preço asc e depois reverte a ordem
				.filter(ln -> ln.getPrice() > 3)
				.findFirst()
				.ifPresent(System.out::println);

		// max(), busca o maior da lista baseado na comparação passada. No exemplo foi
		// filtrado pelo preço, feito o max e depois verificado se esta presente, se sim
		// imprime;
		listLightNovel.stream()
				.filter(ln -> ln.getPrice() > 3)
				.max(Comparator.comparing(LightNovel::getPrice))
				.ifPresent(System.out::println);
	}

}
