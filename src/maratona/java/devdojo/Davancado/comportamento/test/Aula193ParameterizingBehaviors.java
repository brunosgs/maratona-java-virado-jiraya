package maratona.java.devdojo.Davancado.comportamento.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.comportamento.dominio.Car;

public class Aula193ParameterizingBehaviors {
	private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

	public static void main(String[] args) {
		System.out.println("Cars for by color: " + filterCarsByColor(cars, "Black"));
		System.out.println("Cars for by yaer: " + filterCarsByYearBefore(cars, 2015));
	}

	private static List<Car> filterCarsByColor(List<Car> cars, String color) {
		List<Car> filteredCars = new ArrayList<>();

		for (Car car : cars) {
			if (car.getColor().equals(color)) {
				filteredCars.add(car);
			}
		}

		if (filteredCars.size() == 0) {
			System.out.println("Car war not located...");
		}

		return filteredCars;
	}

	private static List<Car> filterCarsByYearBefore(List<Car> cars, int year) {
		List<Car> filteredCars = new ArrayList<>();

		for (Car car : cars) {
			if (car.getYear() < year) {
				filteredCars.add(car);
			}
		}

		if (filteredCars.size() == 0) {
			System.out.println("Car war not located...");
		}

		return filteredCars;
	}

}
