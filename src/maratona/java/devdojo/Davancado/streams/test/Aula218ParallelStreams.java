package maratona.java.devdojo.Davancado.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * - Aplicando soma de várias formas e utilizando o paralelismo com threads do
 * streams;
 * <p>
 * - Cuidados que deve se tomar a usar o 'Parallel Streams': Utilização de
 * unboxing e boxing; Operações de limit() e findFirts() não foram feitas para
 * ser trabalhadas paralelamente, já o findAny() sim; Custo total da computação,
 * N elementos para quantidade de processamentos P; Quantidade de dados, se for
 * muito pequena não compensa fazer paralelismo; Tipo de coleções, ArrayList,
 * Set é boa para paralelismo já a linkedList, interate() do stream não são
 * boas; Tamanho do Stream (tamanha definido); Cuidado com processamento do merge;
 *
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
