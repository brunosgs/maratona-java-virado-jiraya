package maratona.java.devdojo.Aintroducao.arrays.multidimensionais;

public class Aula36ArraysMultidimensionais {

	public static void main(String[] args) {
		int[][] dias = new int[3][3];

		System.out.println(dias[0]); // Imprime o endereço de memória
		System.out.println(dias[0][0]); // Imprime o valor 0

		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;

		dias[1][0] = 31;
		dias[1][1] = 31;
		dias[1][2] = 31;

		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[i].length; j++) {
				System.out.print(dias[i][j] + " ");
			}

			System.out.print("\n");
		}
	}

}
