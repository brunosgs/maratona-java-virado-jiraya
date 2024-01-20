package maratona.java.devdojo.Bbasico.orientacaoobjetos.abstratas.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.abstratas.dominio.Desenvolvedor;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.abstratas.dominio.Gerente;

public class Aula84ClassesAbstratas {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Maria", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 12000);

		System.out.println(gerente);
		System.out.println(desenvolvedor);
	}

}
