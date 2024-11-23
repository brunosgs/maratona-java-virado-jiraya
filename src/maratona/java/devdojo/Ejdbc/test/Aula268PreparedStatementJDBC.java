package maratona.java.devdojo.Ejdbc.test;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

@Log4j2
public class Aula268PreparedStatementJDBC {

	public static void main(String[] args) {
		List<Producer> byNamePreparedStatement = ProducerService.findByNamePreparedStatement("TNK or X'='X");

		String producersFormatted = byNamePreparedStatement.stream()
				.map(Producer::toString)
				.collect(Collectors.joining(System.lineSeparator()));

		log.info(String.format("Producers found: %n%s", producersFormatted));
	}

}
