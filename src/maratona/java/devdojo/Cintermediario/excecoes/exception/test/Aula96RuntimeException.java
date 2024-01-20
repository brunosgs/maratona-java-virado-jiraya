package maratona.java.devdojo.Cintermediario.excecoes.exception.test;

/**
 * Checked e Unchecked<br>
 * <p>
 * - Execeções Checked: são execeções filhas da classe 'Exception' diretamente, caso
 * não tratadas são lançadas em tempo de compilação, nesse caso, em tempo de compilação ele trava
 * e não compila o código;
 * <p>
 * - Exceções Unchecked: Exemplo é NullPointException é uma Runtime, elas são lançadas em tempo de execução
 */
public class Aula96RuntimeException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// Unchecked
		Object obj = null;
		int[] num = {1, 2};


		System.out.println(num[2]); // Lança o exceção de ArrayIndexOfBounds
		System.out.println(obj.toString()); // Lança exceção de NullPointer

	}

}
