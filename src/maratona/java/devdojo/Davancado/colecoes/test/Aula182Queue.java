package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * - O 'Queue' = fila, tem como padrão o FIFO (Fist-in-First-out);
 */
public class Aula182Queue {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();

		queue.add("C");
		queue.add("B");
		queue.add("A");

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

		System.out.println(queue);
	}

}
