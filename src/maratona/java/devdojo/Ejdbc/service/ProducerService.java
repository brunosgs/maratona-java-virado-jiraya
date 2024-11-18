package maratona.java.devdojo.Ejdbc.service;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.repository.ProducerRepository;

public class ProducerService {
	public static void save(Producer producer) {
		ProducerRepository.save(producer);
	}

	public static void delete(Long id) {
		if (id <= 0) {
			throw new IllegalArgumentException("Ivalid value for id: %d".formatted(id));
		}

		ProducerRepository.delete(id);
	}

}
