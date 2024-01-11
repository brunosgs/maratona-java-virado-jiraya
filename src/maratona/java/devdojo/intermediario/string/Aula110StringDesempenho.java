package maratona.java.devdojo.intermediario.string;

/**
 * - A classe StringBuilder armazena caracteres especificados pela sua capacidade, caso ela seja excedida,
 * é aumentada para acomodar os caracteres adicionais. Não precisa alocar novos objetos quando realiza uma
 * concatenação. Não são sincronizadas. Não são seguras para threads;
 *<p>
 * - O StringBuffer é a mesma coisa que o StringBuilder só que sincronizado, ele é thread-safe. Serve para
 * ambiente onde possui multi thread;
 */
public class Aula110StringDesempenho {

	public static void main(String[] args) {
		System.out.println("Concatenar com String:");
		concatString(100_000);

		System.out.println("Concatenar com StringBuilder:");
		concatStringBuilder(1_100_000);

		System.out.println("Concatenar com StringBuffer:");
		concatStringBuffer(1_100_000);
	}

	private static void concatString(int tamanho) {
		long inicio = System.currentTimeMillis();

		String texto = "";

		for (int i = 0; i < tamanho; i++) {
			texto += i;
		}

		long fim = System.currentTimeMillis();

		System.out.println("Tempo gasto em: " + ((fim - inicio) / 1000) + "s");
		System.out.println("Tempo gasto em: " + (fim - inicio) + "ms");
	}

	private static void concatStringBuilder(int tamanho) {
		long inicio = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder(tamanho);

		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}

		long fim = System.currentTimeMillis();

		System.out.println("Tempo gasto em: " + ((fim - inicio) / 1000) + "s");
		System.out.println("Tempo gasto em: " + (fim - inicio) + "ms");
	}

	private static void concatStringBuffer(int tamanho) {
		long inicio = System.currentTimeMillis();

		StringBuffer sbf = new StringBuffer(tamanho);

		for (int i = 0; i < tamanho; i++) {
			sbf.append(i);
		}

		long fim = System.currentTimeMillis();

		System.out.println("Tempo gasto em: " + ((fim - inicio) / 1000) + "s");
		System.out.println("Tempo gasto em: " + (fim - inicio) + "ms");
	}
}
