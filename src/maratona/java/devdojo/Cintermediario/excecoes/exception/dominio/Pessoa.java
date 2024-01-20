package maratona.java.devdojo.Cintermediario.excecoes.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
	public void salvar() throws LoginInvalidoException, FileNotFoundException {
		System.out.println("Salvando Pessoa");
	}
}
