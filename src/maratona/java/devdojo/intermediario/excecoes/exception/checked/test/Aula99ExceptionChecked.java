package maratona.java.devdojo.intermediario.excecoes.exception.checked.test;

import java.io.File;
import java.io.IOException;

/**
 * - Ao inserir a palavra chave 'throws' + a 'Exception' ao um método,
 * ele informa que deve ser tratado com try...catch onde é chamado ou
 * inserir um novo 'throws' para que o próximo que chamar vai ter que
 * tratar a exceção que será lançada;
 * <p>
 * - Quando utilizar o 'throws'? Quando o método for 'private', como o método
 * tera visibilidade somente dentro da classe não será necessario expor um
 * throws. Mas já se for 'public' é importante inserir, por motivos de não
 * saber onde esse método pode estar sendo chamado;
 * <p>
 * - Ao relançar 'throw' uma exceção, que é checked, por exemplo 'IOException' que herda
 * de 'Exception' deve se colocar o 'throws' na assinatura do método.
 */

public class Aula99ExceptionChecked {

	public static void main(String[] args) {
		criarNovoArquivo();

		System.out.println("----------------------------------------------------");

		try {
			utilizarThrows();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------------------------------");

		try {
			criarNovoArquivoThrow();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------------------------------");
	}

	private static void criarNovoArquivo() {
		File file = new File("arquivo\\teste.txt");
		boolean isCriado;

		try {
			isCriado = file.createNewFile();

			System.out.println("Arquivo criado " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void criarNovoArquivoThrow() throws IOException {
		File file = new File("arquivo\\teste.txt");
		boolean isCriado;

		try {
			isCriado = file.createNewFile();

			System.out.println("Arquivo criado " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void utilizarThrows() throws IOException {
		File file = new File("arquivo\\testeThrows.txt");

		file.createNewFile();
	}

}
