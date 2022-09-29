package maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico;

import maratona.java.devdojo.orientacaoobjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDados implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando no banco de dados...");
	}

}
