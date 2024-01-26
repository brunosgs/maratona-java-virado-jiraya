package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

/**
 * - Ao utilizar o range, ele ira buscar no texto o que estive dentro do range
 * utilizando do OR=ou, baseado no metacaracter que for inserido para o range;
 * <p>
 * - Se o regex é: '0[xX][0-9a-fA-F]' e caso tente fazer o matcher com o texto
 * que contem um hexadecimal, exemplo: '0xFFABC', só irá buscar '0xF', não
 * buscando o código hexa completo.
 */
public class Aula133RegexRange {

	public static void main(String[] args) {
		System.out.println("RANGE DE CARACTERES []: \n");

		String texto = "CAFEbabe";
		String textoEx = "12 0x 0X 0xFFABC 0x109 0x1";

		String regex = "[abc]";
		TestesRegex.testeRegex(regex, texto);

		regex = "[abcABC]";
		TestesRegex.testeRegex(regex, texto);

		regex = "[a-zA-C]";
		TestesRegex.testeRegex(regex, texto);

		regex = "0[xX][0-9a-fA-F]";
		TestesRegex.testeRegex(regex, textoEx);

	}

}