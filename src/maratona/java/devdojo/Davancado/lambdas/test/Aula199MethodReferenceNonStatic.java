package maratona.java.devdojo.Davancado.lambdas.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.lambdas.dominio.Anime;
import maratona.java.devdojo.Davancado.lambdas.service.AnimeComparators;

/**
 * - Utilizando o objeto instanciado para referenciar o método não estático;
 */
public class Aula199MethodReferenceNonStatic {

	public static void main(String[] args) {
		List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 366), new Anime("Berserk", 43),
				new Anime("One Piece", 1088), new Anime("Naruto", 500), new Anime("Dragon Ball", 153)));
		AnimeComparators animeComparators = new AnimeComparators();

		animeList.sort(animeComparators::compareByEpisodesNonStatic);
		System.out.println(animeList);
	}

}
