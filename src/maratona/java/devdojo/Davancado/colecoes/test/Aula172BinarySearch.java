package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * - O Binary Search faz uma busca na lista e retorna o índice do objeto
 * localizado. Caso não encontre, ele se baseia em uma regra;
 * <p>
 * - O retorno se baseando a regra que será sempre a posição onde deveria ser
 * inserido, mas a soma de -1;
 * <p>
 * - Para funcionar de maneira esperada o algoritmo binary search, a lista deve
 * já estar ordenada, se não o resutado não será o esperado = 'undefined'.
 */
public class Aula172BinarySearch {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);

		Collections.sort(numeros);
		System.out.println("Lista: " + numeros);

		int value = 1;
		int findBinarySearch = Collections.binarySearch(numeros, value);

		/*
		 * Se o valor não for localizado ele retona pela regra (-(posição de inserção)
		 * -1)
		 */
		System.out.println("Valor: " + value);
		System.out.println("Binary Search localizou na posição: " + findBinarySearch);
	}

}
