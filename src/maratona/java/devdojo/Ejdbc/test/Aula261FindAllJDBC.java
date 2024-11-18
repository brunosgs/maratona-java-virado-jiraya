package maratona.java.devdojo.Ejdbc.test;

import java.util.List;

import lombok.extern.log4j.Log4j2;
import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

@Log4j2
public class Aula261FindAllJDBC {

	public static void main(String[] args) {
		List<Producer> allProducers = ProducerService.findAll();

		allProducers.stream()
				.forEach(System.out::println);

		log.info("Producers found '{}'", allProducers);
	}

}
