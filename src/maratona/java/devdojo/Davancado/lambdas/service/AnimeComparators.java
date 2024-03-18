package maratona.java.devdojo.Davancado.lambdas.service;

import maratona.java.devdojo.Davancado.lambdas.dominio.Anime;

public class AnimeComparators {
	public static int compareByTitle(Anime a1, Anime a2) {
		return a1.getTittle().compareTo(a2.getTittle());
	}

	public static int compareByEpisodes(Anime a1, Anime a2) {
		return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
	}

	public int compareByEpisodesNonStatic(Anime a1, Anime a2) {
		return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
	}
}
