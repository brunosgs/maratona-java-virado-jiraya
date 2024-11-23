package maratona.java.devdojo.Ejdbc.service;

import java.util.List;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.repository.ProducerRepository;

public class ProducerService {
	public static void save(Producer producer) {
		ProducerRepository.save(producer);
	}

	public static void delete(Long id) {
		requiredValidId(id);
		ProducerRepository.delete(id);
	}

	public static void update(Producer producer) {
		requiredValidId(producer.getId());
		ProducerRepository.update(producer);
	}

	public static List<Producer> findAll() {
		return ProducerRepository.findAll();
	}

	public static List<Producer> findByName(String name) {
		return ProducerRepository.findByName(name);
	}

	public static void showProducerMetadata() {
		ProducerRepository.showProducerMetaData();
	}

	public static void showDriverMetaData() {
		ProducerRepository.showDriverMetaData();
	}

	public static void showTypeScrollWorking() {
		ProducerRepository.showTypeScrollWorking();
	}

	public static List<Producer> findByNameAndUpdateToUpperCase(String paramsName) {
		return ProducerRepository.findByNameAndUpdateToUpperCase(paramsName);
	}

	public static List<Producer> findByNameAndInsertWhenNotFound(String paramsName) {
		return ProducerRepository.findByNameAndInsertWhenNotFound(paramsName);
	}

	public static void findByNameAndDelete(String paramsName) {
		ProducerRepository.findByNameAndDelete(paramsName);
	}

	public static List<Producer> findByNamePreparedStatement(String paramsName) {
		return ProducerRepository.findByNamePreparedStatement(paramsName);
	}

	private static void requiredValidId(Long id) {
		if (id == null || id <= 0) {
			throw new IllegalArgumentException("Ivalid value for id: %d".formatted(id));
		}
	}

}
