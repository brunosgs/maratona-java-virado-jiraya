package maratona.java.devdojo.orientacaoobjetos.polimorfismo.test;

import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Computador;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Produto;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Televisao;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Tomate;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico.CalculadoraImposto;

/*
	O Java Type Casting é classificado em dois tipos:
	- Widening cast (Ímplicito) - conversão automática de tipo;
	- Narrowing cast (explicito) - precisa de conversão explicita.
*/
public class Aula92PolimorfismoParametrosPolimorficos {

	public static void main(String[] args) {
		// Widening cast
		Produto produtoComputador = new Computador("Intel i9", 2500);
		Produto produtoTomate = new Tomate("Cereja", 5);
		Computador computador = new Computador("Ryzen 9", 2200);
		Tomate tomate = new Tomate("Italiano", 6.50);
		Televisao televisao = new Televisao("Samsung 42\"", 1800);

		// Narrowing cast
		Produto produtoTelevisao = new Televisao("LG 50\"", 2500);
		Televisao televisaoLG = (Televisao) produtoTelevisao;

		CalculadoraImposto.calcularImposto(produtoComputador);
		CalculadoraImposto.calcularImposto(produtoTomate);

		/**
		 * Foi possível passar ao método 'calcularImposto' uma variável de referência
		 * mais especializada porque essa extende de 'Produto'.
		 */
		CalculadoraImposto.calcularImposto(computador);
		CalculadoraImposto.calcularImposto(tomate);
		CalculadoraImposto.calcularImposto(televisao);
		CalculadoraImposto.calcularImposto(televisaoLG);
	}

}
