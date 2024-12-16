package maratona.java.devdojo.Fcrud.service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

import maratona.java.devdojo.Fcrud.dominio.Producer;
import maratona.java.devdojo.Fcrud.repository.ProducerRepository;

public class ProducerService {
	private static final Scanner SCANN = new Scanner(System.in);

	public static void menu(int op) {
		switch (op) {
			case 1 -> findByName();
			case 2 -> delete();
			case 3 -> save();
			case 4 -> update();
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

		System.out.println("Are you sure? (Y/N)");
		String choice = SCANN.nextLine();

		if ("y".equalsIgnoreCase(choice)) {
			ProducerRepository.delete(paramId);
			System.out.println("Producer with ID " + paramId + " has been deleted.");
		} else {
			System.out.println("Operation canceled.");
		}
	}

	private static void save() {
		System.out.println("Type the name of the producer");
		String paramName = SCANN.nextLine();

		if (!paramName.isEmpty()) {
			Producer producerToSave = Producer.builder()
					.name(paramName)
					.dateTo(LocalDateTime.now())
					.build();

			ProducerRepository.save(producerToSave);
		} else {
			System.out.println("Invalid input, empty value");
		}
	}

	private static void update() {
		System.out.println("Type the id of the object you want to update");
		long paramId = Long.parseLong(SCANN.nextLine());

		Optional<Producer> resultProducer = ProducerRepository.findById(paramId);

		if (resultProducer.isEmpty()) {
			System.out.println("Producer not found");
			return;
		}

		Producer producerFromDb = resultProducer.get();
		System.out.println("Producer found: " + producerFromDb);

		System.out.println("Type the new name or enter to keep the same");
		String paramName = SCANN.nextLine();

		paramName = paramName.isEmpty() ? producerFromDb.getName() : paramName;

		Producer producerToUpdate = Producer.builder()
				.id(producerFromDb.getId())
				.name(paramName)
				.dateTo(producerFromDb.getDateTo())
				.build();

		ProducerRepository.update(producerToUpdate);
	}

	private static void findByName() {
		System.out.println("Type the name or empty to all");
		String paramName = SCANN.nextLine();

		ProducerRepository.findByName(paramName)
				.forEach(producer -> System.out.printf("[ID: %d] - %s%n", producer.getId(), producer.getName()));
	}
}
