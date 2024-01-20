package maratona.java.devdojo.Cintermediario.excecoes.exception.unchecked.test;

/**
 * Lançado exceções unchecked:
 * <p>
 * - Ao utilizar 'throw new' esta lançando uma exceção, sempre que for lançar uma exceção,
 * utilizar as exceções mais especificas;
 * <p>
 * - No exemplo de divisão por 0 houve a idenficação do problema, não foi necessario
 * continuar com o try...catch, mas como foi lançado deve sempre ser tratado,
 * para que o programa continue o fluxo.
 * <p>
 * - O 'throws' pode ser utilizar em um método, onde é informado que pode ou não
 * lançar uma exceção, informando ao compilador que é bom tratar com try...catch;
 */
public class Aula98RuntimeExceptionUnchecked {

	public static void main(String[] args) {
		try {
			divisao(1, 0);
		} catch(RuntimeException e) {
			e.printStackTrace();
		}

		/* Caso não existir o try...catch para tratar o erro lançado do método,
		 * o programa não imprimiria o código finalizado.
		 * */
		System.out.println("Código finalizado!");
	}

	private static int divisao(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Argumento ilegal, não pode ser abaixo de 0");
		}

		/*try {
			return a/b;
		} catch(RuntimeException e) {
			e.printStackTrace();
		}*/

		return a/b;
	}

}
