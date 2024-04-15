package maratona.java.devdojo.Davancado.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * - Aplicando soma de várias formas e utilizando o paralelismo com threads do
 * streams;
 */
public class Aula218ParallelStreams {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime()
				.availableProcessors());

		long num = 100_000_000;

		sumFor(num);
		sumStreamInterate(num);
		sumParallelStreamInterate(num);
		sumLongStreamInterate(num);
		sumParallelLongStreamInterate(num);
	}

	private static void sumFor(long num) {
		System.out.println("Sum for: ");

		long init = System.currentTimeMillis();
		long result = 0;

		for (long i = 1; i <= num; i++) {
			result += i;
		}

		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + "ms");
	}

	private static void sumStreamInterate(long num) {
		System.out.println("Sum StreamInterate: ");

		long init = System.currentTimeMillis();
		long result = Stream.iterate(1L, i -> i + 1)
				.limit(num)
				.reduce(0L, Long::sum);

		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + "ms");
	}

	private static void sumParallelStreamInterate(long num) {
		System.out.println("Sum ParallelStreamInterate: ");

		long init = System.currentTimeMillis();
		long result = Stream.iterate(1L, i -> i + 1)
				.limit(num)
				.parallel()
				.reduce(0L, Long::sum);

		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + "ms");
	}

	private static void sumLongStreamInterate(long num) {
		System.out.println("Sum LongStreamInterate: ");

		long init = System.currentTimeMillis();
		long result = LongStream.rangeClosed(1L, num)
				.reduce(0L, Long::sum);

		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + "ms");
	}

	private static void sumParallelLongStreamInterate(long num) {
		System.out.println("Sum ParallelLongStreamInterate: ");

		long init = System.currentTimeMillis();
		long result = LongStream.rangeClosed(1L, num)
				.parallel()
				.reduce(0L, Long::sum);

		long end = System.currentTimeMillis();

		System.out.println(result + " " + (end - init) + "ms");
	}
}
