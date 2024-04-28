package maratona.java.devdojo.Davancado.threads.test;

import maratona.java.devdojo.Davancado.threads.service.ThreadSafeNamesService;

/**
 * - Classes do tipo thread-safe são classes que possuem métodos que são
 * 'synchronized';
 */
public class Aula226ThreadSafe {

	public static void main(String[] args) {
		ThreadSafeNamesService threadSafeNamesSerive = new ThreadSafeNamesService();

		threadSafeNamesSerive.add("Junkrat");

		Runnable r = threadSafeNamesSerive::removeFirst;

		new Thread(r).start();
		new Thread(r).start();

	}
}
