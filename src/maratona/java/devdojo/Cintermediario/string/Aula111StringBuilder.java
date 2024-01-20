package maratona.java.devdojo.Cintermediario.string;

/**
 * - StringBuilder é uma classe, com ela é possível manipular as Strings que são imutáveis;
 *<p>
 * - Dentro do StringBuilder existe o método append, esse tem a mesma função do concat;
 */
public class Aula111StringBuilder {

	public static void main(String[] args) {
		String nome = "Pedro";
		nome.concat(" Silva");

		System.out.println(nome);

		StringBuilder sb = new StringBuilder("Antonio Silva ");
		sb.append("Dev Dojo");
		sb.reverse(); // Inverte a string
		sb.delete(0, 3); // Remove uma sequencia de caracteres


 		System.out.println(sb);
	}

}
