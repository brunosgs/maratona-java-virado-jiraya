package maratona.java.devdojo.Davancado.designpatterns.singleton.test;

import maratona.java.devdojo.Davancado.designpatterns.singleton.domain.Aircraft;
import maratona.java.devdojo.Davancado.designpatterns.singleton.domain.AircraftSingletonEager;

/**
 * - O Singleton é um padrão de projeto criacional que permite a você garantir
 * que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso
 * global para essa instância.
 */
public class Aula248SingletonEager {

	public static void main(String[] args) {
		bookSeat("1A");
		bookSeat("1A");

		bookSeatSingleton("1A");
		bookSeatSingleton("1A");

	}

	private static void bookSeat(String seat) {
		Aircraft aircraft = new Aircraft("787-900");

		System.out.println(aircraft);

		System.out.println(aircraft.bookSeat(seat));
	}

	private static void bookSeatSingleton(String seat) {
		// Não é mais possível se utilizar o new
		AircraftSingletonEager aircraftSingleton = AircraftSingletonEager.getInstance();

		System.out.println(aircraftSingleton);

		System.out.println(aircraftSingleton.bookSeat(seat));
	}

}
