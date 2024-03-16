package maratona.java.devdojo.Davancado.comportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import maratona.java.devdojo.Davancado.comportamento.dominio.Car;

public class Aula194ParameterizingBehaviorsGenerics {
	private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

	public static void main(String[] args) {
		// Utilizando Lambda
		List<Car> filterCarsGreen = filter(cars, car -> car.getColor().equals("Green"));
		List<Car> filterCarsYear = filter(cars, car -> car.getYear() > 2015);

		System.out.println("Filter cars green: " + filterCarsGreen);
		System.out.println("Filter cars year: " + filterCarsYear);

		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Números pares: " + filter(nums, num -> num % 2 == 0));

	}

	// Método genérico para ser utilizado para localizar conforme predicado
	private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> filteredList = new ArrayList<>();

		for (T e : list) {
			if (predicate.test(e)) {
				filteredList.add(e);
			}
		}

		if (filteredList.size() == 0) {
			System.out.println("Was not located...");
		}

		return filteredList;
	}

}
