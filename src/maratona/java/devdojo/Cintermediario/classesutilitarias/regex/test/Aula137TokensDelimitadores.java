package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

/**
 * - Com o split é possível pegar os tokens e definir o delimitador para o
 * próximo token;
 */
public class Aula137TokensDelimitadores {

	public static void main(String[] args) {
		String texto = "Pedro, João, Maria";
		String texto2 = "Pedro1João2Maria";

		String[] nomes = texto.split(",");
		String[] nomes2 = texto2.split("\\d");

		for (String nome : nomes) {
			System.out.println(nome.trim());
		}

		for (String nome : nomes2) {
			System.out.println(nome);
		}

	}

}
