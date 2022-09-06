package maratona.java.devdojo.orientacaoobjetos.introducaoclasses.test;

import maratona.java.devdojo.orientacaoobjetos.introducaoclasses.dominio.Carro;

public class Aula43ReferenciaObjetos {

	public static void main(String[] args) {
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();

		carro01.nome = "I30";
		carro01.modelo = "CW";
		carro01.ano = 2016;

		carro02.nome = "Mustang";
		carro02.modelo = "GT";
		carro02.ano = 2022;

		carro01 = carro02; // referenciando outro objeto

		carro01.nome = "HB20"; // Caso você altere, o que muda é no objeto referenciado.

		System.out
				.println("Nome do carro: " + carro01.nome + " do modelo " + carro01.modelo + " de ano " + carro01.ano);
		System.out
				.println("Nome do carro: " + carro02.nome + " do modelo " + carro02.modelo + " de ano " + carro02.ano);

	}

}
