package maratona.java.devdojo.Fcrud.test;

import java.util.Scanner;

import maratona.java.devdojo.Fcrud.service.ProducerService;

public class Aula275Crud {
	private static Scanner scann = new Scanner(System.in);

	public static void main(String[] args) {
		int op;

		while (true) {
			producerMenu();
			op = Integer.parseInt(scann.nextLine());

			if (op == 0) {
				System.out.println("System finished...");
				break;
			}

			ProducerService.buildMenu(op);
		}

	}

	private static void producerMenu() {
		System.out.println("\nType the number of your operation");
		System.out.println("1 - Search for producer");
		System.out.println("0 - Exit\n");
	}

}
