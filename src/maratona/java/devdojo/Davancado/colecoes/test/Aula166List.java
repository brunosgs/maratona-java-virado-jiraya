package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.List;

/**
 * - 'List' é uma interface que extende de 'Collection', sendo assim a criação
 * de lista é orientada a interfaces;
 * <p>
 * - Em versões anteriores (1.4), não era necessário a inserção do '<>' para o
 * tipo da lista, depois que foi inserido o 'Generics' ao Java, ai em tempo de
 * compilação ele solicita a obrigatoriedade de um tipo para a lista;
 */
public class Aula166List {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();

		nomes.add("João");
		nomes.add("Dojo teste");

		System.out.println("ForEach: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("\nFor: ");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	}

}
