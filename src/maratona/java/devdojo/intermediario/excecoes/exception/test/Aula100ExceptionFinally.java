package maratona.java.devdojo.intermediario.excecoes.exception.test;

/**
 * - O bloco de código finally sempre será executado, independente do que o try...catch
 * capturar;
 * <p>
 */
public class Aula100ExceptionFinally {

	public static void main(String[] args) {
		String con = openConnection();

		System.out.println(con);

		openConnectionTryFinally();
		// openConnectionThrowRuntime();
	}

	// Antes de executar o 'return' ele faz o 'finally', depois executa o return
	private static String openConnection() {
		try {
			System.out.println("START -- openConnection --");
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");

			return "Conexão aberta\n";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechando recurso liberado no sistema operacional");
		}

		return null;
	}

	/**
	 * Dessa forma pode ser usado o try...finally, porem caso estoure uma exception
	 * vai ser lançada onde foi feito a chamada. Será definido se será tratado ou não
	 * o erro;
	 * */
	private static void openConnectionTryFinally() {
		try {
			System.out.println("START -- openConnectionTryFinally --");
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");

			// Simula o lançamento de uma Exception
			throw new RuntimeException();
		} finally {
			System.out.println("Fechando recurso liberado no sistema operacional\n");
		}
	}

	// Exemplo onde se gera um erro é mostra como o 'finally' se comporta
	private static void openConnectionThrowRuntime() {
		try {
			System.out.println("START -- openConnectionThrowRuntime --");
			System.out.println("Abrindo arquivo");

			// Simula o lançamento de uma Exception
			throw new RuntimeException();

			// System.out.println("Escrevendo dados no arquivo");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechando recurso liberado no sistema operacional\n");
		}
	}

}
