package maratona.java.devdojo.Ejdbc.service;

import java.util.List;

import maratona.java.devdojo.Ejdbc.dominio.Producer;
import maratona.java.devdojo.Ejdbc.repository.ProducerRepositoryRowSet;

public class ProducerRowSetService {
	public static List<Producer> findByNameJdbcRowSet(String name) {
		return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
	}
}
