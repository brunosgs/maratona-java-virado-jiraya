package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

/**
 * - Forma de fazer sem o uso de Streams;
 * <p>
 * 1 - Ordernar os LightNovel por titulo;
 * <p>
 * 2 - Buscar pelos três primeiros títulos com o preço menor que 4;
 */
public class Aula203Streams {
	private static List<LightNovel> listLightNovel = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99),
			new LightNovel("Overlord", 3.99), new LightNovel("Violet Evergarden", 5.99),
			new LightNovel("No Game no life", 2.99), new LightNovel("Fullmetal Alchemist", 5.99),
			new LightNovel("Kugo desuga", 1.99), new LightNovel("Monogatari", 4.99)));

	public static void main(String[] args) {
		listLightNovel.sort(Comparator.comparing(LightNovel::getTitle));
		listLightNovel.forEach(System.out::println);

		List<String> titles = new ArrayList<>();

		for (LightNovel lightNovel : listLightNovel) {
			if (lightNovel.getPrice() < 4) {
				titles.add(lightNovel.getTitle());
			}

			if (titles.size() >= 3) {
				break;
			}
		}

		System.out.println(titles);
	}

}
