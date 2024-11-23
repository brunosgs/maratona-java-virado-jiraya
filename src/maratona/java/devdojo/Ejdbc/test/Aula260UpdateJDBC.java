package maratona.java.devdojo.Ejdbc.test;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

public class Aula260UpdateJDBC {

	public static void main(String[] args) {
		Producer producerToUpdate = Producer.builder()
				.id(3L)
				.name("TMS Entertainment")
				.build();

		ProducerService.update(producerToUpdate);
	}

}
