package maratona.java.devdojo.orientacaoobjetos.blocoinicializacao.test;

import maratona.java.devdojo.orientacaoobjetos.blocoinicializacao.dominio.Anime;

public class Aula60BlocoInicializacao {

	public static void main(String[] args) {
		Anime anime = new Anime("Bleach");

		for (int episodio : anime.getEpisodios()) {
			System.out.print(episodio + " ");
		}
	}

}
