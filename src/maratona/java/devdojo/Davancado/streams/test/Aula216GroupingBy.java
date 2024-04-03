package maratona.java.devdojo.Davancado.streams.test;

import static maratona.java.devdojo.Davancado.streams.dominio.Category.DRAMA;
import static maratona.java.devdojo.Davancado.streams.dominio.Category.FANTASY;
import static maratona.java.devdojo.Davancado.streams.dominio.Category.ROMANCE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.streams.dominio.Category;
import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

/**
 * - Criando maps com stream;
 * <p>
 * - Foi utilizando a importação estática para esse exemplo, assim o código fica
 * mais limpo;
 */
public class Aula216GroupingBy {
	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99, FANTASY), new LightNovel("Overlord", 3.99, FANTASY),
					new LightNovel("Violet Evergarden", 15.99, DRAMA), new LightNovel("No Game no life", 2.99, FANTASY),
					new LightNovel("Fullmetal Alchemist", 5.99, FANTASY), new LightNovel("Kugo desuga", 1.99, FANTASY),
					new LightNovel("Kugo desuga", 1.99, FANTASY), new LightNovel("Monogatari", 4.99, ROMANCE)));

	public static void main(String[] args) {
		// Map que agrupa por 'Category' e depois conta a quantidade de cada categoria
		Map<Category, Long> mapGroupingCounting = listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

		/**
		 * Map que agrupa por 'Category' e depois busca pelos maiores preços de cada
		 * categoria.
		 */
		Map<Category, Optional<LightNovel>> mapGroupingMaxBy = listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

		/**
		 * Map que agrupa por 'Category' e depois coleta pelo maior preço de cada
		 * categoria, extaindo o objeto do 'Optional';
		 */
		Map<Category, LightNovel> mapGroupingCollectiongAndThen = listLightNovel.stream()
				.collect(Collectors.groupingBy(LightNovel::getCategory,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

		/**
		 * Opção de se agrupar e extrair o map que faz: agrupa por 'Category' e depois
		 * coleta pelo maior preço de cada categoria, extaindo o objeto do 'Optional';
		 */
		Map<Category, LightNovel> mapToMap = listLightNovel.stream()
				.collect(Collectors.toMap(LightNovel::getCategory, Function.identity(),
						BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

		System.out.println(mapGroupingCounting + "\n");
		System.out.println(mapGroupingMaxBy + "\n");
		System.out.println(mapGroupingCollectiongAndThen + "\n");
		System.out.println(mapToMap + "\n");
	}

}
