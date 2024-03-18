package maratona.java.devdojo.Davancado.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import maratona.java.devdojo.Davancado.lambdas.dominio.Anime;
import maratona.java.devdojo.Davancado.lambdas.service.AnimeComparators;

/**
 * - Para criar um objeto utilizando o method reference, precisa de uma
 * interface funcional. Para isso existe o 'Supplier', onde é criado o objeto
 * Objeto::new e depois utilizado o '.get()' que retorna o objeto criado;
 */
public class Aula200MethodReferenceConstructor {

	public static void main(String[] args) {
		List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 366), new Anime("Berserk", 43),
				new Anime("One Piece", 1088), new Anime("Naruto", 500), new Anime("Dragon Ball", 153)));

		// Sem parametros no construtor
		Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
		AnimeComparators animeComparators = newAnimeComparators.get();

		animeList.sort(animeComparators::compareByEpisodesNonStatic);
		System.out.println(animeComparators);

		// Com parametros no construtor
		BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
		Anime newAnime = animeBiFunction.apply("Fullmetal Alchemist: Brotherhood", 64);

		System.out.println(newAnime);
	}

}
