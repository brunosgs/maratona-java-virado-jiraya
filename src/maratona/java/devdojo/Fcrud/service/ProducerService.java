package maratona.java.devdojo.Fcrud.service;

import java.util.List;
import java.util.Scanner;

import maratona.java.devdojo.Fcrud.dominio.Producer;
import maratona.java.devdojo.Fcrud.repository.ProducerRepository;

public class ProducerService {
	private static final Scanner SCANN = new Scanner(System.in);

	public static void menu(int op) {
		switch (op) {
		case 1:
			findByName();

			break;
		case 2:
			delete();

			break;
		default:
			throw new IllegalArgumentException("Not a valid option!");
		}
	}

	private static void findByName() {
		System.out.println("Type the name or empty to all");
		String paramName = SCANN.nextLine();

		List<Producer> listProducer = ProducerRepository.findByName(paramName);

		for (int i = 0; i < listProducer.size(); i++) {
			Producer producer = listProducer.get(i);

			System.out.printf("[ID: %d] - %s%n", producer.getId(), producer.getName());
		}
	}

	private static void delete() {
		System.out.println("Type the id of the producer you want to delete");
		long paramId;

		while (true) {
			try {
				paramId = Long.parseLong(SCANN.nextLine());

				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid numeric ID.");
			}
		}

		System.out.println("Are you sure? (S/N)");
		String choice = SCANN.nextLine();

		if ("s".equalsIgnoreCase(choice)) {
			ProducerRepository.delete(paramId);
			System.out.println("Producer with ID " + paramId + " has been deleted.");
		} else {
			System.out.println("Operation canceled.");
		}
	}
}
