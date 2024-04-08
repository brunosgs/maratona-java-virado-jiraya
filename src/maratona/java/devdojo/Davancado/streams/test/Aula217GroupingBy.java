package maratona.java.devdojo.Davancado.streams.test;

import static maratona.java.devdojo.Davancado.streams.dominio.Category.DRAMA;
import static maratona.java.devdojo.Davancado.streams.dominio.Category.FANTASY;
import static maratona.java.devdojo.Davancado.streams.dominio.Category.ROMANCE;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.streams.dominio.Category;
import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;
import maratona.java.devdojo.Davancado.streams.dominio.Promotion;

/**
 * - Criando maps com stream;
 * <p>
 * - Foi utilizando a importação estática para esse exemplo, assim o código fica
 * mais limpo;
 */
public class Aula217GroupingBy {
	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99, FANTASY), new LightNovel("Overlord", 3.99, FANTASY),
					new LightNovel("Violet Evergarden", 15.99, DRAMA), new LightNovel("No Game no life", 2.99, FANTASY),
					new LightNovel("Fullmetal Alchemist", 5.99, FANTASY), new LightNovel("Kugo desuga", 1.99, FANTASY),
					new LightNovel("Kugo desuga", 1.99, FANTASY), new LightNovel("Monogatari", 4.99, ROMANCE)));

	public static void main(String[] args) {
		Map<Category, DoubleSummaryStatistics> mapCollectSummary = listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
		System.out.println(mapCollectSummary);
		System.out.println();

		// toSet() evita valores duplicados, ele implementa um hashSet
		Map<Category, Set<Promotion>> mapCollectToSet = listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
						Collectors.mapping(Aula217GroupingBy::getPromotion, Collectors.toSet())));
		System.out.println(mapCollectToSet);
		System.out.println();

		/*
		 * toCollections() é uma fabrica de coleções, nesse exemplo foi criado um map
		 * onde as chaves são 'Category' e os valores são listas de 'LinkedHashSet' de
		 * 'Promotion';
		 */
		Map<Category, LinkedHashSet<Promotion>> mapCollectToLinkedHashSet = listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
						Collectors.mapping(Aula217GroupingBy::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
		System.out.println(mapCollectToLinkedHashSet);
		System.out.println();

		listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
						Collectors.groupingBy(Aula217GroupingBy::getPromotion, Collectors.summarizingDouble(LightNovel::getPrice))))
				.entrySet()
				.forEach(System.out::println);
	}

	private static Promotion getPromotion(LightNovel ln) {
		return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
	}
}
