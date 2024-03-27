package maratona.java.devdojo.Davancado.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * - Ao utilizar o '.map()', o retorno será sempre uma Stream de algo;
 * <p>
 * - Para achatar essa lista e retornar algo que não seja uma lista de arrays ou
 * uma lista de lista, se utiliza o flatMap(). No exemplo só utilizar map o
 * retorno foi um 'Stream<String[]>' = uma streams de arrays;
 */
public class Aula207StreamsFlatMap {

	public static void main(String[] args) {
		List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

		String[] split = words.get(0)
				.split("");

		System.out.println(Arrays.toString(split));
		System.out.println("----------- x -----------");

		List<String[]> listOfArrays = words.stream()
				.map(w -> w.split(""))
				.collect(Collectors.toList());

		for (String[] strings : listOfArrays) {
			for (String letter : strings) {
				System.out.println(letter);
			}
		}

		System.out.println("----------- x -----------");

		// Classe Arrays possue o stream
		List<String> listOfLetter = words.stream()
				.map(w -> w.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList());

		System.out.println(listOfLetter);
	}

}
