package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

/**
 * - A classe Collectors possui várias implementações para coletar a informação
 * gerada atravéz do stream;
 */
public class Aula213StreamsSummarizing {
	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 3.99),
					new LightNovel("Violet Evergarden", 15.99), new LightNovel("No Game no life", 2.99),
					new LightNovel("Fullmetal Alchemist", 5.99), new LightNovel("Kugo desuga", 1.99),
					new LightNovel("Kugo desuga", 1.99), new LightNovel("Monogatari", 4.99)));

	public static void main(String[] args) {
		// Contando os itens da lista;
		long count = listLightNovel.stream()
				.count();

		Long countWithCollect = listLightNovel.stream()
				.collect(Collectors.counting());

		System.out.println("Count by count(): " + count);
		System.out.println("Count by collect() and Collectors.counting(): " + countWithCollect);
		System.out.println();

		// Comparando os itens da lista
		listLightNovel.stream()
				.max(Comparator.comparing(LightNovel::getPrice))
				.ifPresent(ln -> System.out.println("Comparator by max(): " + ln));

		listLightNovel.stream()
				.collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
				.ifPresent(ln -> System.out.println("Comparator by collect() and Collectors.maxBy(): " + ln));
		System.out.println();

		// Somando itens na lista
		double sum = listLightNovel.stream()
				.mapToDouble(LightNovel::getPrice)
				.sum();

		Double sumWrapper = listLightNovel.stream()
				.collect(Collectors.summingDouble(LightNovel::getPrice));

		System.out.println("Sum by sum(): " + sum);
		System.out.println("Sum by collect() and Collectors.summingDouble(): " + sumWrapper);
		System.out.println();

		// Média aritmética de atributos dos itens da lista
		listLightNovel.stream()
				.mapToDouble(LightNovel::getPrice)
				.average()
				.ifPresent(p -> System.out.println("Averaging by average():" + p));

		Double averagingWrapper = listLightNovel.stream()
				.collect(Collectors.averagingDouble(LightNovel::getPrice));

		System.out.println("Averaging by collect() and Collectors.averagingDouble(): " + averagingWrapper);
		System.out.println();

		// O summarizing traz como resultado: count, min, max, sum, average
		DoubleSummaryStatistics collectorsBySummarizingDouble = listLightNovel.stream()
				.collect(Collectors.summarizingDouble(LightNovel::getPrice));

		System.out.println(collectorsBySummarizingDouble);
		System.out.println();

		// Concatenando
		String tittles = listLightNovel.stream()
				.map(LightNovel::getTitle)
				.collect(Collectors.joining(", "));

		System.out.println(tittles);
	}

}
