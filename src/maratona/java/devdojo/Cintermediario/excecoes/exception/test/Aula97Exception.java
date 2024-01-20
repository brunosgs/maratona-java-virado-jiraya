package maratona.java.devdojo.Cintermediario.excecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class Aula97Exception {

	/**
	 * <p>
	 * - try...catch, tenta executar o código caso não consiga e seja lançado algum
	 * erro ou exception é capturado. OBS: Nunca deixe o catch VAZIO;
	 * <p>
	 * - A Exception é a mais generica, mas como boa pratica sempre tente pegar a
	 * exceção mais fiel ao problema, como no exemplo, file lança IOException e no catch ficou como esperado
	 * a captura de IOException;
	 * <p>
	 * - Evitar de colocar regra de negocios no catch;
	 * <p>
	 * <strong>OBS: Para lançar a exception, foi preciso tirar a permissão de gravar na pasta aquivo que foi criada</strong>
	 */
	public static void main(String[] args) {
		criarNovoArquivo();
	}

	private static void criarNovoArquivo() {
		File file = new File("arquivo\\teste.txt");

		try {
			boolean isCriado = file.createNewFile();

			System.out.println("Arquivo criado " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
