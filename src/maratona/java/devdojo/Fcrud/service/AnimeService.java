package maratona.java.devdojo.Fcrud.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import maratona.java.devdojo.Fcrud.dominio.Anime;
import maratona.java.devdojo.Fcrud.dominio.Producer;
import maratona.java.devdojo.Fcrud.repository.AnimeRepository;
import maratona.java.devdojo.Fcrud.repository.ProducerRepository;

public class AnimeService {
	private static final Scanner SCANN = new Scanner(System.in);

	public static void menu(int op) {
		switch (op) {
			case 1 -> findByName();
			case 2 -> delete();
			case 3 -> save();
			case 4 -> update();
		}
	}

	private static void findByName() {
		System.out.println("Type the name or empty to all");
		String paramName = SCANN.nextLine();

		AnimeRepository.findByName(paramName)
				.forEach(anime -> System.out.printf("[ID: %d] - %s %d %s%n", anime.getId(), anime.getName(), anime.getEpisodeos(),
						anime.getProducer()
								.getName()));
	}

	private static void delete() {
		System.out.println("Type the id of the anime you want to delete");
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
			AnimeRepository.delete(paramId);
			System.out.println("Anime with ID " + paramId + " has been deleted.");
		} else {
			System.out.println("Operation canceled.");
		}
	}

	private static void save() {
		System.out.println("Type the name of the anime");
		String paramName = SCANN.nextLine();
		Integer paramEpisodes;
		long paramProducerId;

		while (true) {
			try {
				System.out.println("Type the number of episodes");
				paramEpisodes = Integer.parseInt(SCANN.nextLine());

				if (paramEpisodes == 0) {
					System.out.println("Invalid input. Please enter a number greater than 0.");

					continue;
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid numeric.");
			}
		}

		System.out.println("List of producers");
		List<Producer> listOfProducers = ProducerRepository.findByName("");
		listOfProducers.forEach(System.out::println);

		while (true) {
			try {
				System.out.println("Select a Producer ID");
				long tempParamProducerId = Long.parseLong(SCANN.nextLine());

				if (tempParamProducerId == 0) {
					System.out.println("Invalid input. Please enter a number id greater than 0.");

					continue;
				}

				boolean anyMatch = listOfProducers.stream()
						.anyMatch(p -> p.getId() == tempParamProducerId);

				if (!anyMatch) {
					System.out.println("Producer not found, please enter a valid id!");

					continue;
				}

				paramProducerId = tempParamProducerId;

				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid numeric ID.");
			}
		}

		if (!paramName.isEmpty()) {
			Anime animeToSave = Anime.builder()
					.name(paramName)
					.episodeos(paramEpisodes)
					.dateTo(LocalDateTime.now())
					.producer(Producer.builder()
							.id(paramProducerId)
							.build())
					.build();

			AnimeRepository.save(animeToSave);
		} else {
			System.out.println("Invalid input, name empty value");
		}
	}

	private static void update() {
		System.out.println("Type the id of the object you want to update");
		Integer paramEpisodes;
		long paramId;

		while (true) {
			try {
				paramId = Long.parseLong(SCANN.nextLine());

				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid numeric.");
			}
		}

		Optional<Anime> resultAnime = AnimeRepository.findById(paramId);

		if (resultAnime.isEmpty()) {
			System.out.println("Anime not found");
			return;
		}

		Anime animeFromDb = resultAnime.get();
		System.out.println("Anime found: " + animeFromDb);

		System.out.println("Type the new name or enter to keep the same");
		String paramName = SCANN.nextLine();

		while (true) {
			try {
				System.out.println("Type the new number of episodes or enter to keep the same");
				paramEpisodes = Integer.parseInt(SCANN.nextLine());

				if (animeFromDb.getEpisodeos() == paramEpisodes) {
					paramEpisodes = animeFromDb.getEpisodeos();
				}

				if (paramEpisodes == 0) {
					System.out.println("Invalid input. Please enter a number greater than 0.");

					continue;
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid numeric.");
			}
		}

		paramName = paramName.isEmpty() ? animeFromDb.getName() : paramName;

		Anime animeToUpdate = Anime.builder()
				.id(animeFromDb.getId())
				.name(paramName)
				.episodeos(paramEpisodes)
				.build();

		AnimeRepository.update(animeToUpdate);
	}

}
