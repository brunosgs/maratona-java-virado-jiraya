package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

/**
 * - Os metacaracters são formas de filtrar o que você precisa localizar ou até
 * mesmo utilizar para substituir em um texto;
 * <p>
 * - Espaços em branco podem ser representados por: \t \n \f \r
 * <p>
 * - Nos exemplos foram passados alguns meta caracteres, mas existem outros que
 * auxiliam na utilização do Regex;
 */
public class Aula132RegexMetaCaracteres {

	public static void main(String[] args) {
		System.out.println("TODOS OS DÍGITOS: ");
		String regex = "\\d";
		String texto = "weg6141tgf";

		TestesRegex.testeRegex(regex, texto);
		/* ------------------------------------------------ */

		System.out.println("TUDO O QUE NÃO FOR DÍGITO: ");
		regex = "\\D";
		texto = "weg6@4&tgf";

		TestesRegex.testeRegex(regex, texto);
		/* ------------------------------------------------ */

		System.out.println("TODOS OS ESPAÇOS EM BRANCO (\\t \\n \\f \\r): ");
		regex = "\\s";
		texto = "we g6@4 &L";

		TestesRegex.testeRegex(regex, texto);

		texto = "weg@\t4&L";

		TestesRegex.testeRegex(regex, texto);
		/* ------------------------------------------------ */

		System.out.println("TODOS OS CARACTERS EXCLUINDO OS BRANCOS: ");
		regex = "\\S";
		texto = "we g6@4 &LKL";

		TestesRegex.testeRegex(regex, texto);
		/* ------------------------------------------------ */

		System.out.println("TUDO QUE CONTER ENTRE a-ZA-Z, DÍGITOS E UNDERSCORE:");
		regex = "\\w";
		texto = "we g6@4__ &LKL";

		TestesRegex.testeRegex(regex, texto);
		/* ------------------------------------------------ */

		System.out.println("TUDO QUE NÃO FOR INCLUSO ENTRE a-ZA-Z, DÍGITOS E UNDERSCORE:");
		regex = "\\W";
		texto = "we g6@4__ &LKL";

		TestesRegex.testeRegex(regex, texto);
	}

}
