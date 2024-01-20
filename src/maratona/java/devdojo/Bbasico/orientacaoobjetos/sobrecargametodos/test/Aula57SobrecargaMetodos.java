package maratona.java.devdojo.Bbasico.orientacaoobjetos.sobrecargametodos.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.sobrecargametodos.dominio.Anime;

public class Aula57SobrecargaMetodos {

	public static void main(String[] args) {
		Anime anime = new Anime();

		anime.init("Bleach", "TV", 366, "Shonen");

		anime.imprime();
	}

}
