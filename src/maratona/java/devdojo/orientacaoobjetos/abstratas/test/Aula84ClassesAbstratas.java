package maratona.java.devdojo.orientacaoobjetos.abstratas.test;

import maratona.java.devdojo.orientacaoobjetos.abstratas.dominio.Desenvolvedor;
import maratona.java.devdojo.orientacaoobjetos.abstratas.dominio.Gerente;

public class Aula84ClassesAbstratas {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Maria", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 12000);

		System.out.println(gerente);
		System.out.println(desenvolvedor);
	}

}
