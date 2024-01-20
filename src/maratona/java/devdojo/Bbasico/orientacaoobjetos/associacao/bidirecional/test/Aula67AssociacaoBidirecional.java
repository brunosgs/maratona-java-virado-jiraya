package maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.bidirecional.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.bidirecional.dominio.Jogador;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.bidirecional.dominio.Time;

/*
  OBS: Cuidar ao fazer as associações! Caso esqueça uma associação ela pode estar
  em um lado do dominio mas no outro não, exemplo, caso seja adicionado mas 1 jogador
  ao time e não seja atribuido ao jogador o time, ai temos um problema no relacionamento.
*/
public class Aula67AssociacaoBidirecional {

	public static void main(String[] args) {
		Jogador jogador01 = new Jogador("Cafú");
		Jogador jogador02 = new Jogador("Ronaldinho");
		Jogador[] jogadores = { jogador01, jogador02 };

		Time time = new Time("Brasil");

		jogador01.setTime(time);
		time.setJogadores(jogadores);

		jogador01.imprime();

		/*
		 * OBS2: Ao imprimir jogador02 verifica-se que não foi associado a nenhum time,
		 * mas ao imprimir o time, ele existe como um jogador. Atenção nas associações
		 * bidirecionais.
		 */
		jogador02.imprime();

		System.out.println("\n -- TIME --");
		time.imprime();

	}

}
