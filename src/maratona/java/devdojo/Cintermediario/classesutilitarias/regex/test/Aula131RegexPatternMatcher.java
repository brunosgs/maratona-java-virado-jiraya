package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * - As expressões regulares = REGEX, são formas de localizar ou substituir
 * padrões em um texto;
 * <p>
 * - No exemplo 'texto2' com o regex = "aba", ao executar ele localiza somente
 * as posições 0 e 4, quando o matcher localiza ele não retorna para cadeia de
 * caracteres anterior, ele continua de onde parou até localizar a próxima
 * sequencia que iguale ao que foi passado para o pattern;
 */
public class Aula131RegexPatternMatcher {

	public static void main(String[] args) {
		String regex = "aba";
		String texto = "abaaba";
		String texto2 = "abababa";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto2);

		System.out.println("Texto:  " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("Regex:  " + regex);
		System.out.println("Posições encontradas");

		while (matcher.find()) {
			System.out.print(matcher.start() + " ");
		}
	}

}
