package maratona.java.devdojo.Davancado.designpatterns.singleton.test;

import maratona.java.devdojo.Davancado.designpatterns.singleton.enums.AircraftSingletonEnum;

/**
 * - Por padrão enum é thread-safe e não existe a opção de utilizar Reflection
 * para alterar o construtor da enumeração;
 */
public class Aula250SingletonWithEnum {

	public static void main(String[] args) {
		bookSeatSingletonWithEnum("1A");
		bookSeatSingletonWithEnum("1A");
	}

	private static void bookSeatSingletonWithEnum(String seat) {
		System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());

		AircraftSingletonEnum aircraftSingletonWithEnum = AircraftSingletonEnum.INSTANCE;

		System.out.println(aircraftSingletonWithEnum.bookSeat(seat));
	}

}
