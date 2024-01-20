package maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.dominio.Calculadora;

public class Aula48MetodosParametrosTipoPrimitivo {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		int numero1 = 1;
		int numero2 = 2;

		// Ao passar tipos primitivos como parâmetros, ele esta passando uma cópia não a referência
		calculadora.alteraDoisNumeros(numero1, numero2);

		System.out.println("\nAlterar dois números test: ");
		System.out.println("Número1: " + numero1);
		System.out.println("Número2: " + numero2);
	}

}
