package maratona.java.devdojo.Davancado.designpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
	private final Set<String> availableSeats = new HashSet<>();
	private final String name;

	public Aircraft(String name) {
		this.name = name;
	}

	{
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public String getName() {
		return name;
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

}
