package maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Computador;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Produto;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.polimorfismo.dominio.Tomate;

public class Aula91PolimorfismoFuncionamento {

	public static void main(String[] args) {
		Produto produto01 = new Computador("Intel i9", 2500);

		System.out.println(produto01.getNome());
		System.out.println(produto01.getValor());
		System.out.println(produto01.calcularImposto());

		Produto produto02 = new Tomate("Cereja", 5);

		System.out.println(produto02.getNome());
		System.out.println(produto02.getValor());
		System.out.println(produto02.calcularImposto());
	}

}
