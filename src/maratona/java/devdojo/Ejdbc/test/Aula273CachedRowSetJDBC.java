package maratona.java.devdojo.Ejdbc.test;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.repository.ProducerRepositoryRowSet;
import maratona.java.devdojo.Ejdbc.service.ProducerRowSetService;

@Log4j2
public class Aula273CachedRowSetJDBC {

	public static void main(String[] args) {
		producersFormatted(ProducerRepositoryRowSet.findByNameJdbcRowSet("tm"));

		Producer producerToUpdate = Producer.builder()
				.id(3L)
				.name("tms Entertainment")
				.build();

		ProducerRowSetService.updateCachedRowSet(producerToUpdate);

		producersFormatted(ProducerRepositoryRowSet.findByNameJdbcRowSet("tm"));
	}

	private static void producersFormatted(List<Producer> producers) {
		String producersFormatted = producers.stream()
				.map(Producer::toString)
				.collect(Collectors.joining(System.lineSeparator()));

		log.info(String.format("Producers found: %n%s", producersFormatted));
	}


}
