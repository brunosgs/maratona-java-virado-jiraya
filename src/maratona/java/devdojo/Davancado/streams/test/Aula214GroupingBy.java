package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.streams.dominio.Category;
import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

public class Aula214GroupingBy {
	public static void main(String[] args) {
		// Método para chamar o exemplo sem streams
		mapLightNovels();
		System.out.println();

		// Exemplo de como é feito com streams
		Map<Category, List<LightNovel>> mapCollectCategoryLightNovel = listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory));

		System.out.println(mapCollectCategoryLightNovel);
	}

	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
					new LightNovel("Overlord", 3.99, Category.FANTASY),
					new LightNovel("Violet Evergarden", 15.99, Category.DRAMA),
					new LightNovel("No Game no life", 2.99, Category.FANTASY),
					new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
					new LightNovel("Kugo desuga", 1.99, Category.FANTASY),
					new LightNovel("Kugo desuga", 1.99, Category.FANTASY),
					new LightNovel("Monogatari", 4.99, Category.ROMANCE)));

	private static void mapLightNovels() {
		// Sem utilizar o streams:
		Map<Category, List<LightNovel>> mapCategoryLightNovel = new HashMap<>();
		List<LightNovel> fantasy = new ArrayList<>();
		List<LightNovel> drama = new ArrayList<>();
		List<LightNovel> romance = new ArrayList<>();

		for (LightNovel lightNovel : listLightNovel) {
			switch (lightNovel.getCategory()) {
			case FANTASY:
				fantasy.add(lightNovel);

				break;
			case DRAMA:
				drama.add(lightNovel);

				break;
			case ROMANCE:
				romance.add(lightNovel);

				break;

			default:
				break;
			}
		}

		mapCategoryLightNovel.put(Category.ROMANCE, romance);
		mapCategoryLightNovel.put(Category.DRAMA, drama);
		mapCategoryLightNovel.put(Category.FANTASY, fantasy);

		System.out.println(mapCategoryLightNovel);
	}

}
