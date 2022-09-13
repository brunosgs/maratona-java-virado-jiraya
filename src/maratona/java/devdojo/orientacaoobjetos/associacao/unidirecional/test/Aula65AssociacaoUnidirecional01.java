package maratona.java.devdojo.orientacaoobjetos.associacao.unidirecional.test;

import maratona.java.devdojo.orientacaoobjetos.associacao.unidirecional.dominio.Jogador;
import maratona.java.devdojo.orientacaoobjetos.associacao.unidirecional.dominio.Time;

// Associação unidirecional uma para muitos (one to many)
public class Aula65AssociacaoUnidirecional01 {

	public static void main(String[] args) {
		Jogador jogador01 = new Jogador("Neymar");
		Jogador jogador02 = new Jogador("Emerson");
		Time time = new Time("Seleção Brasileira");

		jogador01.setTime(time);
		jogador02.setTime(time);

		jogador01.imprime();
		jogador02.imprime();
	}

}
