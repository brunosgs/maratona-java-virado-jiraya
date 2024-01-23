package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestesRegex {
	public static void testeRegex(String regex, String texto) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		System.out.println("Índice: 0123456789");
		System.out.println("Texto:  " + texto);
		System.out.println("Regex:  " + regex);
		System.out.println("Posições encontradas");

		while (matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}

		System.out.println();
	}
}
