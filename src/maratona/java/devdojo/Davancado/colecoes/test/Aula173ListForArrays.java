package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * - Para converter um 'List' para um 'Array', ao passar o tamanho na conversão,
 * passar como 0.
 * <p>
 * - Ao se utilizar o 'Arrays.asList()' para converter um Array para um List
 * deve estar sempre ciente de que ele cria um link entre os dois, pois ele é
 * imutável. Se tentar fazer um 'set()' em uma posição do List, vai modificar o
 * Array e o List. Já ao tentar utilizar o 'add()' no List vai gerar uma
 * exceção;
 * <p>
 * - Para que se possa criar um List a partir de um Array quando criar o new
 * ArrayList<>() passar como argumento para o construtor o
 * Arrays.asList(array_para_converter[n]);
 */
public class Aula173ListForArrays {

	public static void main(String[] args) {
		// Converte de um List para um Array
		List<Integer> numeros = new ArrayList<>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		Integer[] listToArray = numeros.toArray(new Integer[0]);

		System.out.println(Arrays.toString(listToArray));
		System.out.println(" ------------- x -------------");

		// Converte de um Array para um List, mas com link entre os dois
		Integer[] numerosArray = new Integer[3];

		numerosArray[0] = 4;
		numerosArray[1] = 5;
		numerosArray[2] = 6;

		List<Integer> arrayToList = Arrays.asList(numerosArray);

		arrayToList.set(0, 13);

		// arrayToList.add(25); Gera uma exceção de operação não suportada
		System.out.println(Arrays.toString(numerosArray));
		System.out.println(arrayToList);

		System.out.println(" ------------- x -------------");

		/*
		 * Converte de um Array para um List, passando o array como argumento sem criar
		 * um link entre os dois.
		 */
		List<Integer> listNumeros = new ArrayList<>(Arrays.asList(numerosArray));

		listNumeros.add(119);

		System.out.println(listNumeros);

		System.out.println(" ------------- x -------------");
		// Criar lista a partir de varargs

		List<String> asListVarargs = Arrays.asList("9", "b", "4");

		System.out.println(asListVarargs);
	}

}
