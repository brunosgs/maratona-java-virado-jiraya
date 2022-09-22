package maratona.java.devdojo.orientacaoobjetos.polimorfismo.servico;

import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Computador;
import maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
	public static void calcularImpostoComputador(Computador computador) {
		System.out.println("Relatório de imposto do computador");

		double imposto = computador.calcularImposto();

		System.out.println("Computador: " + computador.getNome());
		System.out.println("Valor: " + computador.getValor());
		System.out.println("Imposto: " + imposto);
	}

	public static void calcularImpostoTomate(Tomate tomate) {
		System.out.println("Relatório de imposto do tomate");

		double imposto = tomate.calcularImposto();

		System.out.println("Computador: " + tomate.getNome());
		System.out.println("Valor: " + tomate.getValor());
		System.out.println("Imposto: " + imposto);
	}

}
