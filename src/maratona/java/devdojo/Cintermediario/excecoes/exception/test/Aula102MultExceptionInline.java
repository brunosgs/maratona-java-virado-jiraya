package maratona.java.devdojo.Cintermediario.excecoes.exception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * - Existe na sintaxe que é possível adicionar múltiplos exceptions em uma unica linha
 * dividido por 'pipe = |';
 * <p>
 * - Não é possível utilizar 'Exception' com a mesma linha de herança, exemplo IOException
 * e FileNotFoundException, ou é inserido a exceção mais genérica ou incluído em um novo catch;
 *
 */
public class Aula102MultExceptionInline {

	public static void main(String[] args) {
		try {
			multExceptionsChecked();
			multExceptionsRuntime();
		} catch (FileNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e = new RuntimeException();

			e.printStackTrace();
		}
	}

	private static void multExceptionsChecked() throws SQLException, FileNotFoundException, IOException {
		System.out.println("Chamada do método multExceptionsChecked ");
	}

	private static void multExceptionsRuntime() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException  | IllegalArgumentException | ArithmeticException e ) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException  | IllegalArgumentException | ArithmeticException ");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}
	}
}
