package maratona.java.devdojo.introducao.arrays;

public class Aula34Array03 {

	public static void main(String[] args) {
		String[] nomes = new String[3];

		nomes[0] = "Bruno";
		nomes[1] = "José";
		nomes[2] = "Maria";

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}

}
