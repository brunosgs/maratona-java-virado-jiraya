package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.List;

public class Aula206FlatMap {

	public static void main(String[] args) {
		List<List<String>> devdojo = new ArrayList<>();
		List<String> graphicDesigners = List.of("Pedro", "João", "Maria", "José", "Roberto");
		List<String> developers = List.of("Gustavo", "William", "Mario", "Patricia", "Ana");
		List<String> students = List.of("Édipo", "Guto", "Roberta", "Cesar", "Clara");

		devdojo.add(graphicDesigners);
		devdojo.add(developers);
		devdojo.add(students);

		// Leitura de todos os nomes sem stream
		for (List<String> people : devdojo) {
			for (String person : people) {
				System.out.println(person);
			}
		}

		System.out.println("------------------- x -------------------");

		/**
		 * Ao utlizar o flatMap, esta achatando = flatten a lista de lista para uma
		 * lista unica;
		 */
		devdojo.stream()
				.flatMap(List::stream)
				.forEach(System.out::println);
	}

}
