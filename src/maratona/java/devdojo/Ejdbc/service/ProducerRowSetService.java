package maratona.java.devdojo.Ejdbc.service;

import java.util.List;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.repository.ProducerRepositoryRowSet;

public class ProducerRowSetService {
	public static List<Producer> findByNameJdbcRowSet(String name) {
		return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
	}

	public static void updateJdbcRowSet(Producer producer) {
		ProducerRepositoryRowSet.updateJdbcRowSet(producer);
	}

	public static void updateCachedRowSet(Producer producer) {
		ProducerRepositoryRowSet.updateCachedRowSet(producer);
	}
}
