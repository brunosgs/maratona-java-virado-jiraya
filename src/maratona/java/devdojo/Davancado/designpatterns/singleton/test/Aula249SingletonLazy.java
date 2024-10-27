package maratona.java.devdojo.Davancado.designpatterns.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import maratona.java.devdojo.Davancado.designpatterns.singleton.domain.AircraftSingletonLazy;

/**
 * - O Singleton é um padrão de projeto criacional que permite a você garantir
 * que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso
 * global para essa instância.
 * <p>
 * - Reflection: A Java Reflection é uma poderosa API que permite a um programa
 * Java examinar e manipular informações sobre suas próprias classes em tempo de
 * execução. Com a Reflection, é possível obter informações sobre campos,
 * métodos e construtores de uma classe, além de acessar e modificar esses
 * elementos mesmo que eles sejam privados.
 */
public class Aula249SingletonLazy {

	public static void main(String[] args) {
		bookSeatSingleton("1A");
		bookSeatSingleton("1A");

		System.out.println(AircraftSingletonLazy.getInstance());
		System.out.println(AircraftSingletonLazy.getInstance());

		// Reflection
		try {
			Constructor<AircraftSingletonLazy> declaredConstructor;
			declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);

			declaredConstructor.setAccessible(true);

			AircraftSingletonLazy newInstance = declaredConstructor.newInstance("787-900");

			System.out.println(newInstance);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	private static void bookSeatSingleton(String seat) {
		// Não é mais possível se utilizar o new
		AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();

		System.out.println(aircraftSingletonLazy);

		System.out.println(aircraftSingletonLazy.bookSeat(seat));
	}

}
