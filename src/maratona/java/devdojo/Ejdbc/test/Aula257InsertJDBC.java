package maratona.java.devdojo.Ejdbc.test;

import java.time.LocalDateTime;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.repository.ProducerRepository;

public class Aula257InsertJDBC {

	public static void main(String[] args) {
		Producer producer = Producer.builder()
				.name("Tear Studio")
				.dateTo(LocalDateTime.now())
				.build();

		ProducerRepository.save(producer);
	}

}
