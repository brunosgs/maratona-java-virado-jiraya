package maratona.java.devdojo.Ejdbc.test;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.service.ProducerService;

public class Aula269PreparedStatementJDBC {

	public static void main(String[] args) {
		Producer producerToUpdate = Producer.builder()
				.id(3L)
				.name("TMS Entertainment")
				.build();

		ProducerService.updateProducerPreparedStatement(producerToUpdate);
	}

}
