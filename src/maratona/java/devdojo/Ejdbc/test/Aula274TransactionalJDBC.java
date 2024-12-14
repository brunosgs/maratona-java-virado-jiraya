package maratona.java.devdojo.Ejdbc.test;

import java.time.LocalDateTime;
import java.util.List;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

public class Aula274TransactionalJDBC {

	public static void main(String[] args) {
		Producer producerToUpdate1 = Producer.builder()
				.name("Khara")
				.dateTo(LocalDateTime.now())
				.build();

		Producer producerToUpdate2 = Producer.builder()
				.name("Lapin Track")
				.dateTo(LocalDateTime.now())
				.build();

		Producer producerToUpdate3 = Producer.builder()
				.name("Magic Bus")
				.build();

		ProducerService.saveTransactional(List.of(producerToUpdate1, producerToUpdate2, producerToUpdate3));
	}

}
