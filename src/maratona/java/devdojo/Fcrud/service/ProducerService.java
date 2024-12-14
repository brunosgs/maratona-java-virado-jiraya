package maratona.java.devdojo.Fcrud.service;

import java.util.List;
import java.util.Scanner;

import maratona.java.devdojo.Fcrud.dominio.Producer;
import maratona.java.devdojo.Fcrud.repository.ProducerRepository;

public class ProducerService {
	private static Scanner scann = new Scanner(System.in);

	public static void buildMenu(int op) {
		switch (op) {
		case 1:
			findByName();
			break;
		default:
			throw new IllegalArgumentException("Not a valid option!");
		}
	}

	private static void findByName() {
		System.out.println("Type the name or empty to all");
		String paramName = scann.nextLine();

		List<Producer> listProducer = ProducerRepository.findByName(paramName);

		for (int i = 0; i < listProducer.size(); i++) {
			System.out.printf("[%d] - %s%n", listProducer.get(i)
					.getId(),
					listProducer.get(i)
							.getName());
		}
	}
}
