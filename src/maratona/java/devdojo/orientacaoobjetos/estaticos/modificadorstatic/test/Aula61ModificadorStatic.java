package maratona.java.devdojo.orientacaoobjetos.estaticos.modificadorstatic.test;

import maratona.java.devdojo.orientacaoobjetos.estaticos.modificadorstatic.dominio.Carro;

public class Aula61ModificadorStatic {

	public static void main(String[] args) {
		Carro carro01 = new Carro("BMW", 280);
		Carro carro02 = new Carro("Mercedes", 275);
		Carro carro03 = new Carro("Audi", 290);

		Carro.velocidadeLimite = 180;

		carro01.imprime();
		carro02.imprime();
		carro03.imprime();
	}

}
