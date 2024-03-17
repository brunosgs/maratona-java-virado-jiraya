package maratona.java.devdojo.Davancado.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

/**
 * - O 'Consumer' ele é uma interface funcional e executa uma operação onde não
 * existe retorno = void;
 */
public class Aula196Consumer {

	public static void main(String[] args) {
		List<String> listStrings = List.of("Pedro", "Goku", "Ichigo");
		List<Integer> listIntegers = List.of(1, 2, 3, 4, 5);

		forEach(listStrings, s -> System.out.println(s));
		forEach(listIntegers, i -> System.out.println(i));
	}

	private static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T e : list) {
			consumer.accept(e);
		}
	}

}
