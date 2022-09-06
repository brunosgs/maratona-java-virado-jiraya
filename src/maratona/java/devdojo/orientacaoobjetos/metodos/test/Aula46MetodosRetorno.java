package maratona.java.devdojo.orientacaoobjetos.metodos.test;

import maratona.java.devdojo.orientacaoobjetos.metodos.dominio.Calculadora;

public class Aula46MetodosRetorno {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		double resultadoDivisao = calculadora.divideDoisNumeros(20, 0);

		System.out.println(resultadoDivisao);
		System.out.println("----------------");

		calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
	}

}
