package maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico;

import maratona.java.devdojo.orientacaoobjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em um arquivo...");
	}
}
