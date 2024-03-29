package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

/**
 * - Para utilizar um reduce em uma lista de objetos, no exemplo foi utilizado
 * primeiro o map para extrair os valores a serem reduzidos = reduce e depois
 * executado o reduce para a soma;
 */
public class Aula210StreamsReduce {
	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 3.99),
					new LightNovel("Violet Evergarden", 15.99), new LightNovel("No Game no life", 2.99),
					new LightNovel("Fullmetal Alchemist", 5.99), new LightNovel("Kugo desuga", 1.99),
					new LightNovel("Kugo desuga", 1.99), new LightNovel("Monogatari", 4.99)));

	public static void main(String[] args) {
		/**
		 * Fez um autoboxing do valor de preço do objeto do tipo primitivo para o
		 * wrapper. OBS: Cuidar para tipo de sistemas onde a desempenho é um ponto
		 * crucial para o desempenho da aplicação.
		 */
		listLightNovel.stream()
				.map(LightNovel::getPrice)
				.filter(ln -> ln > 3)
				.reduce(Double::sum)
				.ifPresent(System.out::println);

		/**
		 * Com o mapToDouble() é evitado de ficar fazendo wrapper e unwrapper de um
		 * primitivo para o wrapper ou o inverso. Observando o exemplo não foi
		 * necesassario utilizar o reduce para executar a soma;
		 */
		double sum = listLightNovel.stream()
				.mapToDouble(LightNovel::getPrice)
				.filter(ln -> ln > 3)
				.sum();

		System.out.println("tipo primitivo: " + sum);
	}

}
