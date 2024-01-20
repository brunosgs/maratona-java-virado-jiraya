package maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.arraysobjetos.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.arraysobjetos.dominio.Jogador;

public class Aula64AssociacaoArraysComObjetos {

	public static void main(String[] args) {
		Jogador jogador01 = new Jogador("Pelé");
		Jogador jogador02 = new Jogador("Romário");
		Jogador jogador03 = new Jogador("Cafú");

		Jogador[] jogadores = { jogador01, jogador02, jogador03 };

		for (Jogador jogador : jogadores) {
			jogador.imprime();
		}
	}

}
