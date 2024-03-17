package maratona.java.devdojo.Davancado.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * - O 'Function' é uma interface funcional;
 * <p>
 * - Para 'Function' existem dois tipos, o tipo 'T' é que recebe e o 'R' é o
 * retorno;
 */
public class Aula197Function {

	public static void main(String[] args) {
		List<String> listStrings = List.of("Goku", "Ichigo", "Naruto");
		List<Integer> listMapIntegers = map(listStrings, String::length);

		System.out.println(listMapIntegers);

		map(listStrings, String::toUpperCase).forEach(e -> System.out.println(e));
	}

	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<>();

		for (T e : list) {
			R r = function.apply(e);

			result.add(r);
		}

		return result;
	}

}
