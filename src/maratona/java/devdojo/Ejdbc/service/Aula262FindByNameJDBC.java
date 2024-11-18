package maratona.java.devdojo.Ejdbc.service;

import java.util.List;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.dominio.Producer;

@Log4j2
public class Aula262FindByNameJDBC {

	public static void main(String[] args) {
		List<Producer> listProducersByName = ProducerService.findByName("MAD");

		listProducersByName.stream()
				.forEach(System.out::println);

		log.info("Producers found '{}'", listProducersByName);
	}

}
