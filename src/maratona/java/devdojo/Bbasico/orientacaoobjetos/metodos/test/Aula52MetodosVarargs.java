package maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.dominio.Calculadora;

public class Aula52MetodosVarargs {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int[] numeros = { 1, 2, 3, 4, 5 };

		calculadora.somaArray(numeros);
		calculadora.somaVarArgs(1, 2, 3, 4);
	}

}
