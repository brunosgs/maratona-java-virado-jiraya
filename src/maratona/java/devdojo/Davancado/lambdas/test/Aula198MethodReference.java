package maratona.java.devdojo.Davancado.lambdas.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.lambdas.dominio.Anime;
import maratona.java.devdojo.Davancado.lambdas.service.AnimeComparators;

/**
 * - Utilizando a referência para métodos estáticos;
 */
public class Aula198MethodReference {

	public static void main(String[] args) {
		List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 366), new Anime("Berserk", 43),
				new Anime("One Piece", 1088), new Anime("Naruto", 500), new Anime("Dragon Ball", 153)));

		System.out.println("Compara por título: ");
		animeList.sort(AnimeComparators::compareByTitle);
		animeList.forEach(e -> System.out.println(e.getTittle() + " / " + e.getEpisodes()));

		System.out.println("\nCompara por episódios: ");
		animeList.sort(AnimeComparators::compareByEpisodes);
		animeList.forEach(e -> System.out.println(e.getTittle() + " / " + e.getEpisodes()));
	}

}
