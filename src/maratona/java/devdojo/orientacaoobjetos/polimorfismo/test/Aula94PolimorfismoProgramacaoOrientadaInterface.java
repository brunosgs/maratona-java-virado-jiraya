package maratona.java.devdojo.orientacaoobjetos.polimorfismo.test;

import maratona.java.devdojo.orientacaoobjetos.polimorfismo.repositorio.Repositorio;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico.RepositorioArquivo;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico.RepositorioBancoDados;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico.RepositorioMemoria;

/*
	A variável de referência é uma interface, ela recebe um objeto que estende
	dela, assim sendo possível definir o objeto. Como os objetos implementam as
	assinatura de métodos da mesma, é possível ter acesso ao método sobrescrito
	no objeto pela referência mais genérica.
*/
public class Aula94PolimorfismoProgramacaoOrientadaInterface {

	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioBancoDados();
		repositorio.salvar();

		repositorio = new RepositorioArquivo();
		repositorio.salvar();

		repositorio = new RepositorioMemoria();
		repositorio.salvar();
	}

}
