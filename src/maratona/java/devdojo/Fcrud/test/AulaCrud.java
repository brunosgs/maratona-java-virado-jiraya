package maratona.java.devdojo.Fcrud.test;

import java.util.List;
import java.util.Scanner;

import maratona.java.devdojo.Fcrud.service.ProducerService;

/**
 * Esse exemplo é composta pelas aulas (275, 276, 277)
 */
public class AulaCrud {
	private static final Scanner SCANN = new Scanner(System.in);

	public static void main(String[] args) {
		int op;

		while (true) {
			producerMenu();
			op = Integer.parseInt(SCANN.nextLine());

			if (op == 0) {
				System.out.println("System finished...");
				break;
			}

			ProducerService.menu(op);
		}

	}

	private static void producerMenu() {
		List.of("\nType the number of your operation", "1 - Search for producer", "2 - Delete producer", "3 - Save producer",
				"0 - Exit\n")
				.forEach(System.out::println);
	}

}
