package maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.servico;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Computador;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Produto;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Tomate;

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

	/**
	 * Como o método agora esta mais genérico, agora esta mais desacoplado
	 */
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatório de imposto");

		double imposto = produto.calcularImposto();

		System.out.println("Produto: " + produto.getNome());
		System.out.println("Valor: " + produto.getValor());
		System.out.println("Imposto: " + imposto);

		// Verifica com o 'instanceof' se a instância do objeto é 'Tomate'
		if (produto instanceof Tomate) {
			// Executa um cast para localizar a data de validade
			String dataValidade = ((Tomate) produto).getDataValidade();

			System.out.println("Data validade: " + dataValidade);
		}

		System.out.println("--------------------------------");
	}

}
