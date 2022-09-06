package maratona.java.devdojo.orientacaoobjetos.introducaoclasses.test;

import maratona.java.devdojo.orientacaoobjetos.introducaoclasses.dominio.Carro;

/* Crie uma classe carro com os atributos:
 *  - Nome
 *  - Modelo
 *  - Ano
 *
 * Em seguida, crie dois objetos distintos e imprima seus valores
 * */
public class Aula42ExercicioClasses {

	public static void main(String[] args) {
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();

		carro01.nome = "I30";
		carro01.modelo = "CW";
		carro01.ano = 2016;

		carro02.nome = "Mustang";
		carro02.modelo = "GT";
		carro02.ano = 2022;

		System.out
				.println("Nome do carro: " + carro01.nome + " do modelo " + carro01.modelo + " de ano " + carro01.ano);
		System.out
				.println("Nome do carro: " + carro02.nome + " do modelo " + carro02.modelo + " de ano " + carro02.ano);
	}

}
