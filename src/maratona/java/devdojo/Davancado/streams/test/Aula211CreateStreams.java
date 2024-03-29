package maratona.java.devdojo.Davancado.streams.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Aula211CreateStreams {

	public static void main(String[] args) {
		// Criando streams a partir de intergers
		IntStream.rangeClosed(0, 50)
				.filter(n -> n % 2 == 0)
				.forEach(n -> System.out.print(n + " "));

		System.out.println();

		IntStream.range(0, 49)
				.filter(n -> n % 2 == 0)
				.forEach(n -> System.out.print(n + " "));

		System.out.println();

		// Criando streams a partir de Strings
		Stream.of("Teste", "de", "Strings")
				.map(String::toUpperCase)
				.forEach(s -> System.out.print(s + " "));

		System.out.println();

		// Criando streams a partir de Arrays
		int[] numeros = { 1,
				2,
				3,
				4,
				5 };

		Arrays.stream(numeros)
				.average()
				.ifPresent(System.out::println);

		System.out.println();

		// Criandos streams para ler arquivos
		try (Stream<String> lines = Files.lines(Paths.get("fileStream.txt"))) {
			lines.filter(l -> l.contains("Java"))
					.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
