package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * - Funciona da mesma forma que o 'NavigableSet', mas sendo só aplicado a
 * chave, precisa que o objeto implemente 'Comparable' ou que se passe ao map um
 * 'Comparator'.
 * <p>
 * - O 'headMap' retorna pela chaves que são menores que a passada como consulta
 * e qualquer ação feita a partir desse retorno esta linkado com a lista e pode
 * sofre alterações na lista original.
 */
public class Aula181NavigableMap {

	public static void main(String[] args) {
		NavigableMap<String, String> navMap = new TreeMap<>();

		navMap.put("A", "Letra A");
		navMap.put("D", "Letra D");
		navMap.put("B", "Letra B");
		navMap.put("C", "Letra C");
		navMap.put("E", "Letra E");

		for (Entry<String, String> entry : navMap.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}

		/*
		 * Caso queira que o retorno tenha a chave passada como parâmetro, é só
		 * adicionar true.
		 */
		System.out.println(navMap.headMap("C", true));
	}

}
