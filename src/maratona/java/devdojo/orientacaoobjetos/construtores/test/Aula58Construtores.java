package maratona.java.devdojo.orientacaoobjetos.construtores.test;

import maratona.java.devdojo.orientacaoobjetos.construtores.dominio.Anime;

public class Aula58Construtores {

	public static void main(String[] args) {
		Anime anime = new Anime("Bleach", "TV", 366, "Shonen");
		Anime anime2 = new Anime();

		anime.imprime();
		System.out.println("---------------------");
		anime2.imprime();
	}

}
