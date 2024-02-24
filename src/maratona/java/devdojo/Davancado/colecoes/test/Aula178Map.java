package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * - Map não deve ter chaves duplicadas, caso tente adicionar uma chave que já
 * exista no Map ele sobrescreve;
 */
public class Aula178Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("teklado", "teclado");
		map.put("mouze", "mouse");
		map.put("vc", "você");
		map.put("vc", "você 2"); // Sobrescreve o que já existe

		map.putIfAbsent("vc", "você 3"); // Não sobrescreve se já existir

		System.out.println(map);

		System.out.println("\nInterar para ter a chave o valor");
		for (Entry<String, String> string : map.entrySet()) {
			System.out.println(string.getKey() + " / " + string.getValue());
		}

		System.out.println("\nInterar para ter a chave o valor 2");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}

		System.out.println("\nInterar para ter a chave e depois buscar pelo valor");
		for (String key : map.keySet()) {
			System.out.println("Chave: " + key + " / Valor: " + map.get(key));
		}
	}

}
