package maratona.java.devdojo.Davancado.threads.service;

import java.util.ArrayList;
import java.util.List;

/**
 * - Ao utilizar uma classe ou método thread-safe, sempre tomar cuidado para
 * entender se as chamadas a cima desses métodos também serão sincronizadas.
 */
public class ThreadSafeNamesService {
	private final List<String> names = new ArrayList<>();

	public synchronized void add(String name) {
		names.add(name);
	}

	public synchronized void removeFirst() {
		if (names.size() > 0) {
			System.out.println(Thread.currentThread()
					.getName());
			System.out.println(names.remove(0));
		}
	}

}
