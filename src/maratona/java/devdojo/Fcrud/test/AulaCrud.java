package maratona.java.devdojo.Fcrud.test;

import java.util.List;
import java.util.Scanner;

import maratona.java.devdojo.Fcrud.service.AnimeService;
import maratona.java.devdojo.Fcrud.service.ProducerService;

/**
 * Esse exemplo é composta pelas aulas (275, 276, 277, 278)
 */
public class AulaCrud {
	private static final Scanner SCANN = new Scanner(System.in);

	public static void main(String[] args) {
		int op;

		while (true) {
			menu();
			op = Integer.parseInt(SCANN.nextLine());

			if (op == 0) {
				System.out.println("System finished...");
				break;
			}

			switch (op) {
				case 1 -> {
					producerMenu();
					op = Integer.parseInt(SCANN.nextLine());

					ProducerService.menu(op);
				}
				case 2 -> {
					animeMenu();
					op = Integer.parseInt(SCANN.nextLine());

					AnimeService.menu(op);
				}
			}
		}

	}

	private static void menu() {
		List.of("\nType the number of your operation", "1 - Producer", "2 - Anime", "0 - Exit\n")
				.forEach(System.out::println);
	}

	private static void producerMenu() {
		List.of("\nType the number of your operation", "1 - Search for producer", "2 - Delete producer", "3 - Save producer",
				"4 - Update producer", "99 - Return\n")
				.forEach(System.out::println);
	}

	private static void animeMenu() {
		List.of("\nType the number of your operation", "1 - Search for anime", "2 - Delete anime", "3 - Save anime",
				"4 - Update anime", "99 - Return\n")
				.forEach(System.out::println);
	}

}
