package maratona.java.devdojo.Davancado.colecoes.test;

import maratona.java.devdojo.Davancado.colecoes.dominio.Carro;

/**
 * - Ao comparar dois objetos utilizando o equals, ele compara se as variáveis
 * de referência estão apontadas pro mesmo objeto;
 * <p>
 * - Implementado equals na classe 'Carro';
 */
public class Aula162Equals {

	public static void main(String[] args) {
		Carro carro1 = new Carro("1CV34D", "VW");
		Carro carro2 = new Carro("1CV34D", "Ferrari");

		System.out.println(carro1.equals(carro2));
	}

}
