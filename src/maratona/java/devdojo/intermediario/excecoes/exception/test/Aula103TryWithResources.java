package maratona.java.devdojo.intermediario.excecoes.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import maratona.java.devdojo.intermediario.excecoes.exception.dominio.Leitor1;
import maratona.java.devdojo.intermediario.excecoes.exception.dominio.Leitor2;

/**
 * - O try...catch resources, ele se encarrega de fechar recursos abertos. Para que
 * ele seja aplicado, a variável de referância deve implementar 'Closeable' ou 'AutoCloseable',
 * com isso o java se encarrega de fechar o recurso e assim não é necessario implementar
 * o 'finally';
 * <p>
 * - É possível remover o catch, mas é obrigatorio na assinatura do método
 * lançar = 'throws' + a exceção corespondente ou genérica;
 * <p>
 * - É possível incluir varios recursos no try e a forma que ele fecha os recursos
 * é inversamente ao que foi declarado, começa de baixo para cima;
 *
 */
public class Aula103TryWithResources {

	public static void main(String[] args) {
		readLeitor();
	}

	public static void readLeitor() {
		try (Leitor1 leitor1 = new Leitor1();
			Leitor2 leitor2 = new Leitor2()) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFileTryWithResources() {
		try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFileTryWithResourcesThrows() throws FileNotFoundException, IOException {
		try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
		}
	}

	public static void readFile() {
		Reader reader = null;

		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
