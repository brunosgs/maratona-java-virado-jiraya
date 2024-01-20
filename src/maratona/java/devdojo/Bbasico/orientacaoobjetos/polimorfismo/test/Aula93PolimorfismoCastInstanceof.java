package maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Computador;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Produto;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Tomate;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.servico.CalculadoraImposto;

public class Aula93PolimorfismoCastInstanceof {

	public static void main(String[] args) {
		Produto produtoComputador = new Computador("Intel i9", 2500);
		Tomate tomate = new Tomate("Cereja", 5);

		tomate.setDataValidade("11/10/2022");

		CalculadoraImposto.calcularImposto(produtoComputador);
		CalculadoraImposto.calcularImposto(tomate);
	}

}
