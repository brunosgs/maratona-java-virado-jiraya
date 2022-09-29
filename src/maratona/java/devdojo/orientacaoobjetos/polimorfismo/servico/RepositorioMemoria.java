package maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico;

import maratona.java.devdojo.orientacaoobjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{

	@Override
	public void salvar() {
		System.out.println("Salvando em memória...");
	}

}
