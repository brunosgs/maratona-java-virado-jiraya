package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

/**
 * - Forma de fazer com o uso de Streams;
 * <p>
 * 1 - Ordernar os LightNovel por titulo;
 * <p>
 * 2 - Buscar pelos três primeiros títulos com o preço menor que 4;
 * <p>
 * - No Streams existem duas formas de operações, as intermediarias que são
 * encadeamentos de chamadas que retornam um Stream e as finais como o collect;
 */
public class Aula204Streams {
	private static List<LightNovel> listLightNovel = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99),
			new LightNovel("Overlord", 3.99), new LightNovel("Violet Evergarden", 5.99),
			new LightNovel("No Game no life", 2.99), new LightNovel("Fullmetal Alchemist", 5.99),
			new LightNovel("Kugo desuga", 1.99), new LightNovel("Monogatari", 4.99)));

	public static void main(String[] args) {
		List<String> listName = listLightNovel.stream()
				.sorted(Comparator.comparing(LightNovel::getTitle))
				.filter(ln -> ln.getPrice() <= 4)
				.limit(3)
				.map(LightNovel::getTitle)
				.collect(Collectors.toList());

		listName.forEach(System.out::println);
	}

}
