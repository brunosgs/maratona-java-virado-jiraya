package maratona.java.devdojo.Davancado.designpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * - Em abientes que é multithreaded, e o carregamento pode ser lazy, o correto
 * é se utilizar da double-checked locking. Onse é sincronizado para que valide
 * se a instancia já esta criada;
 */
public final class AircraftSingletonLazy {
	private static AircraftSingletonLazy INSTANCE;

	private final Set<String> availableSeats = new HashSet<>();
	private final String name;

	private AircraftSingletonLazy(String name) {
		this.name = name;
	}

	{
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public static AircraftSingletonLazy getInstance() {
		// double-checked locking
		if (INSTANCE == null) {
			synchronized (AircraftSingletonLazy.class) {
				if (INSTANCE == null) {
					INSTANCE = new AircraftSingletonLazy("787-900");
				}
			}
		}

		return INSTANCE;
	}

	public String getName() {
		return name;
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

}
