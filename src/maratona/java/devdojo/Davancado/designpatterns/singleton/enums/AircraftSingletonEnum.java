package maratona.java.devdojo.Davancado.designpatterns.singleton.enums;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
	INSTANCE;
	private final Set<String> availableSeats;

	private AircraftSingletonEnum() {
		this.availableSeats = new HashSet<>();
		this.availableSeats.add("1A");
		this.availableSeats.add("1B");
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

}
