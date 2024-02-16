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
 * <p>
 * - Evitar de ficar mexendo com o tamanho da lista quando estiver interando
 * sobre ela.
 * <p>
 * - Não é possível criar lista de tipos primitivos, quando for criado deve se
 * utilizar os Wrappers;
 */
public class Aula167List {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<String> newNames = new ArrayList<>();
		List<Integer> inteiros = new ArrayList<>();

		nomes.add("João");
		nomes.add("Dojo teste");
		newNames.add("Pedro");
		newNames.add("Maria");

		for (String nome : nomes) {
			System.out.println(nome);
		}

		nomes.addAll(newNames);
		System.out.println("\nNova Lista de nomes: " + nomes);

		int indice = 1;
		nomes.remove(indice); // Remove um item por objeto ou índice
		System.out.println("Remove nome no ídice " + indice + ": " + nomes);

		inteiros.add(45);
		System.out.println("Lista de inteiros: " + inteiros);

	}

}
