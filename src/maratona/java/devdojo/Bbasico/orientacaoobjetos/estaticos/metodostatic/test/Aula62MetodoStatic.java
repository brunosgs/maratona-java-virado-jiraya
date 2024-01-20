package maratona.java.devdojo.Bbasico.orientacaoobjetos.estaticos.metodostatic.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.estaticos.metodostatic.dominio.Carro;

public class Aula62MetodoStatic {

	public static void main(String[] args) {
		Carro carro01 = new Carro("BMW", 280);
		Carro carro02 = new Carro("Mercedes", 275);
		Carro carro03 = new Carro("Audi", 290);

		Carro.setVelocidadeLimite(180);

		carro01.imprime();
		carro02.imprime();
		carro03.imprime();
	}

}
