package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

/**
 * - Para localizar padrões em inícios de string o meta caracter de anchor que
 * se utiliza é '^', por exemplo: ^s, onde ele vai localizar se o começo do
 * texto contem s;
 * <p>
 * - O meta caracter '\w' representa qualquer caracter alfanumérico ou
 * sublinhado;
 * <p>
 * - Quando utilizado o '[]' mais o '^' vira uma negação: [^];
 */
public class Aula136RegexAnchor {

	public static void main(String[] args) {
		System.out.println("ANCHOR: ");
		String textoEx = "Aut fugiat voluptate quo eligendi quibusdam est?";
		String regex = "^\\w+";

		TestesRegex.testeRegex(regex, textoEx);

		/*
		 * Esse regex é uma negação, então ele só vai buscar o que não é
		 * alfanumérico/sublinhado
		 */
		regex = "[^\\w+]";
		TestesRegex.testeRegex(regex, textoEx);
	}

}
