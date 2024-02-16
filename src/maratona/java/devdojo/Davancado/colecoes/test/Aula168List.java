package maratona.java.devdojo.Davancado.colecoes.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.colecoes.dominio.Carro;

/**
 * - O método contains(), verifica se o objeto que foi passado contem na lista,
 * ele se utiliza do equals, definido na classe para validar se o objeto é igual
 * ou não;
 * <p>
 * - Se o retorno do 'indexOf()' for -1, e houver uma tentativa de buscar o
 * objeto na lista por esse índice utilizado o 'get()', vai lançar um erro;
 */
public class Aula168List {

	public static void main(String[] args) {
		Carro carro1 = new Carro("1CV34D", "VW");
		Carro carro2 = new Carro("2CV33E", "Ferrari");
		Carro carro3 = new Carro("1CT38E", "BMW");
		Carro carro4 = new Carro("2CV33E", "Ferrari");

		List<Carro> carros = new ArrayList<>();

		carros.add(carro1);
		carros.add(carro2);

		for (Carro carro : carros) {
			System.out.println(carro);
		}

		carros.add(0, carro3); // Defini em qual índice será adiciona na lista

		System.out.println("\nLista de carros: " + carros); // O objeto carro tem o toString()

		boolean contains = carros.contains(carro4);
		int indexOf = carros.indexOf(carro4);
		Carro carroLocalizado = carros.get(indexOf);

		System.out.println("\nO " + carro4 + " contem na lista?: " + contains);
		System.out.println("O " + carro4 + " esta no índice?: " + indexOf);
		System.out.println("O carro localizado dentro da lista: " + carroLocalizado);

		carros.clear();

		System.out.println("\nLista de carros limpa: " + carros);
	}

}
