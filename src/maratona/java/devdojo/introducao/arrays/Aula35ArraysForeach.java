package maratona.java.devdojo.introducao.arrays;

public class Aula35ArraysForeach {

	public static void main(String[] args) {
		int[] numeros = new int[3];
		int[] numeros2 = { 1, 2, 3, 4, 5 }; // Definindo um array com 5 posições sendo essas inicialozidas.
		int[] numeros3 = new int[] { 10, 20, 30, 40, 50 };

		System.out.println("Utilizando o foreach");
		for (int numero : numeros3) {
			System.out.println(numero);
		}

		System.out.println("\nDefinindo array com [3] posições");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		System.out.println("\nDefinindo array e já incializando");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}

		System.out.println("\nDefinindo array com [] e já incializando");
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
	}

}
