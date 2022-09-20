package maratona.java.devdojo.orientacaoobjetos.abstratas.test;

import maratona.java.devdojo.orientacaoobjetos.abstratas.dominio.Desenvolvedor;
import maratona.java.devdojo.orientacaoobjetos.abstratas.dominio.Gerente;

public class Aula85MetodosAbstratos {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Maria", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Bruno", 12000);

		gerente.imprime();
		desenvolvedor.imprime();
		System.out.println(gerente);
		System.out.println(desenvolvedor);
	}

}
