package maratona.java.devdojo.Davancado.comportamento.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.comportamento.dominio.Car;
import maratona.java.devdojo.Davancado.comportamento.interfaces.CarPredicate;

/**
 * Para utilizar uma classe anonima mais reutilizável é possível utilizar os
 * predicados, tanto a interface pronta que já existe no Java ou a que pode ser
 * criado pelo usuário;
 */
public class Aula194ParameterizingBehaviors {
	private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

	public static void main(String[] args) {
		List<Car> filterCarGreen = filter(cars, new CarPredicate() {
			
			@Override
			public boolean test(Car car) {
				return car.getColor().equals("Green");
			}
		});

		System.out.println(filterCarGreen);

		// Utilizando Lambda
		List<Car> filterCarsGreen = filter(cars, car -> car.getColor().equals("Green"));
		List<Car> filterCarsYear = filter(cars, car -> car.getYear() > 2015);

		System.out.println("Filter cars green: " + filterCarsGreen);
		System.out.println("Filter cars year: " + filterCarsYear);
	}

	private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
		List<Car> filteredCars = new ArrayList<>();

		for (Car car : cars) {
			if (carPredicate.test(car)) {
				filteredCars.add(car);
			}
		}

		if (filteredCars.size() == 0) {
			System.out.println("Car war not located...");
		}

		return filteredCars;
	}

}
