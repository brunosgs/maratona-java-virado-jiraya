package maratona.java.devdojo.Davancado.streams.test;

import static java.util.stream.Collectors.groupingBy;
import static maratona.java.devdojo.Davancado.streams.dominio.Category.DRAMA;
import static maratona.java.devdojo.Davancado.streams.dominio.Category.FANTASY;
import static maratona.java.devdojo.Davancado.streams.dominio.Category.ROMANCE;
import static maratona.java.devdojo.Davancado.streams.dominio.Promotion.NORMAL_PRICE;
import static maratona.java.devdojo.Davancado.streams.dominio.Promotion.UNDER_PROMOTION;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import maratona.java.devdojo.Davancado.streams.dominio.Category;
import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;
import maratona.java.devdojo.Davancado.streams.dominio.Promotion;

/**
 * - Criando maps com stream;
 * <p>
 * - Foi utilizando a importação estática para esse exemplo, assim o código fica
 * mais limpo;
 */
public class Aula215GroupingBy {
	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99, FANTASY), new LightNovel("Overlord", 3.99, FANTASY),
					new LightNovel("Violet Evergarden", 15.99, DRAMA), new LightNovel("No Game no life", 2.99, FANTASY),
					new LightNovel("Fullmetal Alchemist", 5.99, FANTASY), new LightNovel("Kugo desuga", 1.99, FANTASY),
					new LightNovel("Kugo desuga", 1.99, FANTASY), new LightNovel("Monogatari", 4.99, ROMANCE)));

	public static void main(String[] args) {
		Map<Promotion, List<LightNovel>> collectMap = listLightNovel.stream()
				.collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));

		Map<Category, Map<Promotion, List<LightNovel>>> collectMapMap = listLightNovel.stream()
				.collect(groupingBy(LightNovel::getCategory, groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));

		for (Promotion promotionKey : collectMap.keySet()) {
			System.out.println(promotionKey);

			for (LightNovel lightNovel : collectMap.get(promotionKey)) {
				System.out.println(lightNovel);
			}
		}

		System.out.println();

		for (Category categoryKey : collectMapMap.keySet()) {
			System.out.println(categoryKey);

			for (Promotion promotionKey : collectMapMap.get(categoryKey)
					.keySet()) {
				System.out.println(promotionKey);

				collectMap.get(promotionKey)
						.forEach(System.out::println);
			}
		}
	}

}
