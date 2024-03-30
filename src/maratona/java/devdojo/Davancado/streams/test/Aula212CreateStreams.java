package maratona.java.devdojo.Davancado.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * - Execuntando infinitas chamadas em um Stream, por isso sempre utlizar um
 * limit() porque é possível travar ou estourar mémoria;
 */
public class Aula212CreateStreams {

	public static void main(String[] args) {
		Stream.iterate(1, n -> n + 2)
				.limit(10)
				.forEach(System.out::println);

		System.out.println();

		// Fibonacci com streams
		Stream.iterate(new int[] { 0,
				1 },
				a -> new int[] { a[1],
						a[0] + a[1] })
				.limit(10)
				.forEach(f -> System.out.print(Arrays.toString(f)));

		System.out.println();

		// Fibonacci com streams
		Stream.iterate(new int[] { 0,
				1 },
				a -> new int[] { a[1],
						a[0] + a[1] })
				.limit(10)
				.map(a -> a[0])
				.forEach(System.out::print);

		System.out.println();

		// Gerando números aleatórios
		ThreadLocalRandom random = ThreadLocalRandom.current();
		Stream.generate(() -> random.nextInt(1, 500))
				.limit(90)
				.forEach(System.out::println);
	}

}
