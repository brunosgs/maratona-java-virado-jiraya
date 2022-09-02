package maratona.java.devdojo.introducao.arrays;

// OBS: variáveis do tipo primitivo não podem ser inicializadas com null, só tipos de referência: arrays, objetos.
public class Aula32Arrays {

	public static void main(String[] args) {
		/*
		 * Quando definido um array ele vai solicitar o número de posições, e na memória
		 * ele é definido como um objeto
		 */
		int[] idades = new int[3];

		idades[0] = 21;
		idades[1] = 15;
		idades[2] = 11;

		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
	}

}
