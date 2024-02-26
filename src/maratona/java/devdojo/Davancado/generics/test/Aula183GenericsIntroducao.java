package maratona.java.devdojo.Davancado.generics.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.colecoes.dominio.Consumidor;

/**
 * - Antes para se declarar uma lista a forma era 'List lista = new
 * ArrayList();', isso na versão do java 1.4, não possuindo um tipagem para o
 * objeto. A manipulação desses objetos ficava complexa e deixava o código mais
 * ainda verboso.
 * <p>
 * - Como mantes a retrocompatibilidade com as outras versões? Foi adicionado o
 * 'Generics' que tipa em tempo de compilação;
 */
public class Aula183GenericsIntroducao {

	public static void main(String[] args) {
		// Type Erause
		List<String> listString = new ArrayList<>();

		// Definção da lista versão 1.4
		List lista = new ArrayList();

		lista.add("Texto");
		lista.add(100L);
		lista.add(new Consumidor("Teste objeto"));

		// A manipulação da lista era mais complexa nessa versão
		for (Object object : lista) {
			if (object instanceof String) {
				System.out.println(object);
			}

			if (object instanceof Long) {
				System.out.println(object);
			}

			if (object instanceof Consumidor) {
				Consumidor consumidor = (Consumidor) object;
				System.out.println(consumidor);
			}
		}

		add(listString, new Consumidor("Teste consumidor"));

		for (String object : listString) {
			System.out.println(object);
		}
	}

	private static void add(List lista, Consumidor consumidor) {
		lista.add(consumidor);
	}

}
