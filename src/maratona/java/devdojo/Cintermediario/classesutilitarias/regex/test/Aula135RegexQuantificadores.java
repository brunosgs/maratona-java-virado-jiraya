package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

/**
 * - Continuação dos meta caracteres:
 * <p>
 * - O ponto . é o conringa, para se utilizar no java tem que existe o
 * delimitiador de escape \\ por exemplo: 1\\.3, tudo que estiver entrre 1 e 3 =
 * 123, 1@3, 1A3;
 */
public class Aula135RegexQuantificadores {

	public static void main(String[] args) {
		System.out.println("QUANTIFICADORES: ");
		String textoEx = "ichigo@hotmail.com, 123teste@gmail.com, !#$@test@mail.br, teste@gmail.com, orochimaru@mail.br";
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

		TestesRegex.testeRegex(regex, textoEx);

		System.out.println("Email válido: " + "!#$@test@mail.br".matches(regex));
		System.out.println(textoEx.split(",")[1].trim());
	}

}
