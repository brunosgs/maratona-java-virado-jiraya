package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.HashMap;
import java.util.Map;

import maratona.java.devdojo.Davancado.colecoes.dominio.Consumidor;
import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;

/**
 * Se em um Map a sua chave for um objeto, ao utlizar o 'getKey()' estou
 * retornando o objeto;
 */
public class Aula179Map {

	public static void main(String[] args) {
		Consumidor consumidor = new Consumidor("João");
		Consumidor consumidor2 = new Consumidor("DevDojo Academy");

		Manga manga = new Manga(5L, "Bleach", 29.90, 0);
		Manga manga2 = new Manga(7L, "Pokemon", 15.10, 5);
		Manga manga3 = new Manga(23L, "Dragon Ball", 22.90, 0);
		Manga manga4 = new Manga(65L, "One Punch-Man", 22.90, 2);
		Manga manga5 = new Manga(8L, "Naruto", 22.50, 0);
		Manga manga6 = new Manga(2L, "Dragon Ball Z", 15.90, 1);
		Manga manga7 = new Manga(2L, "One Piece", 27.45, 1);

		Map<Consumidor, Manga> consumidorManga = new HashMap<>();

		consumidorManga.put(consumidor, manga);
		consumidorManga.put(consumidor2, manga3);

		for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
			System.out.println(entry.getKey().getNome() + " / " + entry.getValue().getNome());
		}

		System.out.println(consumidor);
	}

}
