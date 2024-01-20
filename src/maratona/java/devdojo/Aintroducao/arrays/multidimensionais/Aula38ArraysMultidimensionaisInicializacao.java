package maratona.java.devdojo.Aintroducao.arrays.multidimensionais;

public class Aula38ArraysMultidimensionaisInicializacao {

	public static void main(String[] args) {
		int[][] arrayInt = new int[3][];
		@SuppressWarnings("unused")
		int[][] arrayInt2 = { { 0, 0 }, { 10, 20, 30 }, { 10, 20, 30, 40, 50, 60 } };

		arrayInt[0] = new int[2];
		arrayInt[1] = new int[] { 10, 20, 30 };
		arrayInt[2] = new int[] { 10, 20, 30, 40, 50, 60 };

		for (int[] arrBase : arrayInt) {
			for (int numeroInt : arrBase) {
				System.out.print(numeroInt + " ");
			}

			System.out.print("\n");
		}
	}

}
