package maratona.java.devdojo.Ejdbc.test;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

@Log4j2
public class Aula262FindByNameJDBC {

	public static void main(String[] args) {
		List<Producer> listProducersByName = ProducerService.findByName("MAD");
		String producersFormatted = listProducersByName.stream()
				.map(Producer::toString)
				.collect(Collectors.joining(System.lineSeparator()));

		log.info(String.format("Producers found: %n%s", producersFormatted));
	}

}
