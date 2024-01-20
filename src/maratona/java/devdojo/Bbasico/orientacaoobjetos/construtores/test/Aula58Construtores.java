package maratona.java.devdojo.Bbasico.orientacaoobjetos.construtores.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.construtores.dominio.Anime;

public class Aula58Construtores {

	public static void main(String[] args) {
		Anime anime = new Anime("Bleach", "TV", 366, "Shonen");
		Anime anime2 = new Anime();

		anime.imprime();
		System.out.println("---------------------");
		anime2.imprime();
	}

}
