package maratona.java.devdojo.intermediario.excecoes.exception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * - Ao capturar multiplas exceções, caso uma a exception lançada seja a que existe
 * no 'catch' ela sera usado o tratamento feito;
 * <p>
 * - Mas caso não seja encontrado o exception, sera lançado no main da aplicação ou
 * em quem chamou o método;
 * <p>
 * - Como regra, não se pode colocar um tipo mais generico a frente de outros nas chamadas catch,
 * porque senão nunca serão chamados. O proprio compilador informara um erro. Exemplo é o método
 * 'multExceptionsGeneric()', onde todos as exceptions capturadas são filhas de 'RuntimeException', como
 * foi lançado uma exception e o primeiro catch é o mais generico os outros catchs nunca serão excecutados
 * por causa da regra do polimorfismo.
 * <p>
 * - Na assinatura do método é possível especificar quais são as exceptions que serão lançadas separando
 * por ','
 */
public class Aula101MultException {

	public static void main(String[] args) {
		multExceptionsRuntime();
		multExceptionsRuntimeGeneric();

		try {
			multExceptionsChecked();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//throw new RuntimeException();
	}

	private static void multExceptionsRuntimeGeneric() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		}  catch (RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		} /*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("Dentro do IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("Dentro do ArithmeticException");
		}*/
	}

	private static void multExceptionsRuntime() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("Dentro do IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("Dentro do ArithmeticException");
		} catch (RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}
	}

	private static void multExceptionsChecked() throws SQLException, FileNotFoundException {
		System.out.println("Chamada do método multExceptionsChecked ");
	}

}
