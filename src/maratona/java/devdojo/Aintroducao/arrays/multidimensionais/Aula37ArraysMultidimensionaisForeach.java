package maratona.java.devdojo.Aintroducao.arrays.multidimensionais;

public class Aula37ArraysMultidimensionaisForeach {

	public static void main(String[] args) {
		int[][] dias = new int[3][3];

		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;

		dias[1][0] = 31;
		dias[1][1] = 31;
		dias[1][2] = 31;

		for (int[] arrayMulti : dias) {
			for (int dia : arrayMulti) {
				System.out.print(dia + " ");
			}

			System.out.print("\n");
		}
	}

}
