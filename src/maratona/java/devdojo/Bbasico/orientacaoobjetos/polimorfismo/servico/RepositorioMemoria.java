package maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.servico;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{

	@Override
	public void salvar() {
		System.out.println("Salvando em memória...");
	}

}
