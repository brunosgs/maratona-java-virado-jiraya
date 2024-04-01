package maratona.java.devdojo.Davancado.streams.test;

import java.util.List;

/**
 * - 'Reduce' é um acumulador, onde o retorno sempre será um unico resultado;
 */
public class Aula209Reduce {

	public static void main(String[] args) {
		// Reduce utilizando valores númericos
		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

		integers.stream()
				.reduce((a, b) -> a + b)
				.ifPresent(System.out::println);

		Integer integer = integers.stream()
				.reduce(0, (a, b) -> a + b);

		System.out.println(integer);

		Integer integer2 = integers.stream()
				.reduce(Integer::sum)
				.get();

		System.out.println(integer2);

		System.out.println("-------------------- x --------------------");
		integers.stream()
				.reduce(Integer::max)
				.ifPresent(System.out::println);
	}

}
