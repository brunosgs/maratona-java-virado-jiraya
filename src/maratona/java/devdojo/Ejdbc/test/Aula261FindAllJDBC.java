package maratona.java.devdojo.Ejdbc.test;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

@Log4j2
public class Aula261FindAllJDBC {

	public static void main(String[] args) {
		List<Producer> allProducers = ProducerService.findAll();
		String producersFormatted = allProducers.stream()
				.map(Producer::toString)
				.collect(Collectors.joining(System.lineSeparator()));

		log.info(String.format("Producers found: %n%s", producersFormatted));
	}

}
