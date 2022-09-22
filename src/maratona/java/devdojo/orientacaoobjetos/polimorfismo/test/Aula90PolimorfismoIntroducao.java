package maratona.java.devdojo.orientacaoobjetos.polimorfismo.test;

import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Computador;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Tomate;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico.CalculadoraImposto;

/*
	- Criado interface 'Taxavel' com assinatura de um método chamado 'calcularImposto()';

	- Criado classe abstrata 'Produto' para servir de modelo para produtos que devem
	ser taxaveis e implementado a interface 'Taxavel';

	- Criado duas classes que estendem de 'Produto', que são 'Computador' e 'Tomate'. Como
	são duas classes concretas, precisa ser sobrescrito o método 'calcularImposto()' que vem
	da classe abstrata 'Produto' que implementa 'Taxavel';

	- Criado serviço 'CalculadoraImposto' com dois métodos estáticos que tem como função
	calcular a taxa do produto e imprimir os produtos, utilizando do método que foi sobrescrito
	para cada dominio.
*/
public class Aula90PolimorfismoIntroducao {

	public static void main(String[] args) {
		Computador computador = new Computador("Mac", 15000);
		Tomate tomate = new Tomate("Tomate Sicíliano", 10);

		CalculadoraImposto.calcularImpostoComputador(computador);
		System.out.println("--------------- ** ----------------");
		CalculadoraImposto.calcularImpostoTomate(tomate);
	}

}
