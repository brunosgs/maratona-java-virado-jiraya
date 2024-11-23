package maratona.java.devdojo.Ejdbc.test;

import java.util.List;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

@Log4j2
public class Aula266UpdateWithResultSetJDBC {

	public static void main(String[] args) {
		List<Producer> listProducersByName = ProducerService.findByNameAndUpdateToUpperCase("Deen");

		listProducersByName.stream()
				.forEach(System.out::println);

		log.info("Producers found '{}'", listProducersByName);
	}

}
