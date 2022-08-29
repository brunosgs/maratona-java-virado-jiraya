package maratona.java.devdojo.introducao.operadores;

public class Aula17LogicoAnd {

	public static void main(String[] args) {
		// Operadores lógicos: AND(&&), OR(||) e NOT (!)

		int idade = 29;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
		boolean isDentroDaLeiMenorrQueTrinta = idade < 30 && salario >= 3381;

		System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
		System.out.println("isDentroDaLeiMenorrQueTrinta: " + isDentroDaLeiMenorrQueTrinta);
	}

}
