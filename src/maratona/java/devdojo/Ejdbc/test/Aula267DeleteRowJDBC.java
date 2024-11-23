package maratona.java.devdojo.Ejdbc.test;

import maratona.java.devdojo.Ejdbc.service.ProducerService;

public class Aula267DeleteRowJDBC {

	public static void main(String[] args) {
		ProducerService.findByNameAndDelete("Deen");
	}

}
