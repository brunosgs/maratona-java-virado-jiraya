package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

/**
 * Os meta caracteres que representam os quantificadores são:
 * <p>
 * -'?' que representa zero ou uma ocorrência;
 * <p>
 * '*' que representa zero ou mais ocorrência;
 * <p>
 * '+' que representa uma ou mais ocorrência;
 * <p>
 * - '{n, m}' que representa de n até m, onde n ou m é uma caracter que
 * represente;
 * <p>
 * '()' que representa o agrupamento;
 * <p>
 * '|' que representa o OR=ou, exemplo: o(v|c)o onde o resultado pode ser ovo ou
 * oco;
 * <p>
 * '$' que representra o fim da linha;
 */
public class Aula134RegexQuantificadores {

	public static void main(String[] args) {
		System.out.println("QUANTIFICADORES: ");
		String textoEx = "12 0x 0X 0xFFABC 0x10G 0x1";
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

		TestesRegex.testeRegex(regex, textoEx);

	}

}
