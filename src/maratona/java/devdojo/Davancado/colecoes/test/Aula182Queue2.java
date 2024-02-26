package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;

/**
 * - O PriorityQueue é baseado no heap de prioridade. Os elementos da fila de
 * prioridade são ordenados de acordo com a ordenação natural, ou por um
 * Comparador fornecido no momento da construção da fila, dependendo de qual
 * construtor é utilizado;
 */
public class Aula182Queue2 {

	public static void main(String[] args) {
		Queue<Manga> queueMangas = new PriorityQueue<>();

		queueMangas.add(new Manga(5L, "Bleach", 29.90, 0));
		queueMangas.add(new Manga(7L, "Pokemon", 15.10, 5));
		queueMangas.add(new Manga(23L, "Dragon Ball", 22.90, 0));
		queueMangas.add(new Manga(65L, "One Punch-Man", 22.90, 2));
		queueMangas.add(new Manga(8L, "Naruto", 22.50, 0));
		queueMangas.add(new Manga(2L, "Dragon Ball Z", 15.90, 1));
		queueMangas.add(new Manga(2L, "One Piece", 27.45, 1));

		while (!queueMangas.isEmpty()) {
			System.out.println(queueMangas.poll());
		}
	}

}
