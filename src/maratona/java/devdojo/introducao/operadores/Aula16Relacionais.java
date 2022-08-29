package maratona.java.devdojo.introducao.operadores;

public class Aula16Relacionais {

	public static void main(String[] args) {
		// Operador de resto (%)
		int resto = 20 % 2;

		System.out.println("Resto da divisão 20/2: " + resto);

		/*
		 * Operadores lógicos, retornam sempre um boolean. Os operadores são: O
		 * menor(<), menor igual(<=), maior(>), maior igual(>=), comparação(==) e
		 * diferente(!=)
		 */
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezDiferenteVinte = 10 != 20;
		boolean isDezMaiorIgualVinte = 10 >= 20;
		boolean isDezMenorIgualVinte = 10 <= 20;

		System.out.println("Dez é maior que vinte?: " + isDezMaiorQueVinte);
		System.out.println("Dez é menor que vinte?: " + isDezMenorQueVinte);
		System.out.println("Dez é igual a vinte?: " + isDezIgualVinte);
		System.out.println("Dez é diferente de vinte?: " + isDezDiferenteVinte);
		System.out.println("Dez é maior igual a vinte?: " + isDezMaiorIgualVinte);
		System.out.println("Dez é menor igual a vinte?: " + isDezMenorIgualVinte);
	}

}
