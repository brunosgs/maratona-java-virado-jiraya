package maratona.java.devdojo.Davancado.colecoes.test;

import maratona.java.devdojo.Davancado.colecoes.dominio.Smartphone;

/**
 * - Ao comparar dois objetos utilizando o equals, ele compara se as variáveis
 * de referência estão apontadas pro mesmo objeto;
 */
public class Aula161Equals {

	public static void main(String[] args) {
		Smartphone smart1 = new Smartphone("1CV34D", "iPhone");
		Smartphone smart2 = new Smartphone("1CV34C", "iPhone");

		System.out.println(smart1.equals(smart2));

		smart1 = smart2;

		System.out.println(smart1.equals(smart2));
	}

}
