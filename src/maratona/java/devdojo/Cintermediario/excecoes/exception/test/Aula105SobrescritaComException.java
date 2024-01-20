package maratona.java.devdojo.Cintermediario.excecoes.exception.test;

import java.io.FileNotFoundException;

import maratona.java.devdojo.Cintermediario.excecoes.exception.dominio.Funcionario;
import maratona.java.devdojo.Cintermediario.excecoes.exception.dominio.LoginInvalidoException;
import maratona.java.devdojo.Cintermediario.excecoes.exception.dominio.Pessoa;

/**
 * REGRAS:
 * <p>
 * - Quando existe uma sobrescrita de método, exemplo 'Funcionario', não é obrigatorio declarar as
 * mesmas exceções que o método sobrescrito declarada;
 * <p>
 * - Não é possível adicionar exceções mais genericas ao método sobrescrito ou
 * execeções checked que não foram declaradas no método herdado, exemplo 'Funcionario';
 */
public class Aula105SobrescritaComException {

	public static void main(String[] args)	 {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();

		try {
			pessoa.salvar();
		} catch (FileNotFoundException | LoginInvalidoException e) {
			e.printStackTrace();
		}

		funcionario.salvar();

	}

}
