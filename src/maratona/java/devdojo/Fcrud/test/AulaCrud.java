package maratona.java.devdojo.Fcrud.test;

import java.util.Scanner;

import maratona.java.devdojo.Fcrud.service.ProducerService;

/**
 * Essa aula é composta pelas aulas (275, 276)
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
		System.out.println("\nType the number of your operation");
		System.out.println("1 - Search for producer");
		System.out.println("2 - Delete producer");
		System.out.println("0 - Exit\n");
	}

}
