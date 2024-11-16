package maratona.java.devdojo.Ejdbc.test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Aula258Log4J2 {

	public static void main(String[] args) {
		/*
		 * Producer producer = Producer.builder() .name("Studio Deen") .build();
		 *
		 * ProducerRepository.save(producer);
		 */
		log.info("INFO");
		log.debug("DEBUG");
		log.warn("WARN");
		log.error("ERROR");
		log.trace("TRACE");
	}

}
