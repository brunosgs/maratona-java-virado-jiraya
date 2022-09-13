package maratona.java.devdojo.orientacaoobjetos.associacao.test;

import maratona.java.devdojo.orientacaoobjetos.associacao.dominio.Escola;
import maratona.java.devdojo.orientacaoobjetos.associacao.dominio.Professor;

public class Aula66AssociacaoUnidirecional02 {

	public static void main(String[] args) {
		Professor professor01 = new Professor("Pedro");
		Professor professor02 = new Professor("Maria");

		Professor[] professores = { professor01, professor02 };

		Escola escola = new Escola("E.E.B. Prof. Pedro", professores);

		escola.imprime();
	}

}
