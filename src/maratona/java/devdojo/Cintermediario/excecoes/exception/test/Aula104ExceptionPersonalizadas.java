package maratona.java.devdojo.Cintermediario.excecoes.exception.test;

import java.util.Scanner;

import maratona.java.devdojo.Cintermediario.excecoes.exception.dominio.LoginInvalidoException;

/**
 * - No exemplo foi utilizado um exceção personalizada onde ela é checked,
 * porque implementa 'Exception' e utilizado o try...catch...resources, pois o
 * 'Scanner' implementa 'Closeable'. Foi assinado o método porque é obrigatório
 * para que quem o chama implemente um tratamento da exceção.
 */
public class Aula104ExceptionPersonalizadas {

	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void logar() throws LoginInvalidoException {
		try (Scanner scan = new Scanner(System.in)) {
			String usernameDB = "user";
			String passwordDB = "123456";

			System.out.println("Usuario: ");
			String usernameTyped = scan.nextLine();

			System.out.println("Senha: ");
			String passwordTyped = scan.nextLine();

			if (!usernameDB.equals(usernameTyped) || !passwordDB.equals(passwordTyped)) {
				throw new LoginInvalidoException("Usuário ou senha inválidos!");
			}
		}

		System.out.println("Usuário logado com sucesso!");
	}

}
