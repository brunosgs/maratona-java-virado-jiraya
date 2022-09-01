package maratona.java.devdojo.introducao.estruturasrepeticao;

// Tipos de estruturas de repetição: while, do while e for
public class Aula27WhileDoWhileFor {

	public static void main(String[] args) {
		int count = 0;

		while (count < 10) {
			System.out.println("While: " + count);

			count++;
		}

		count = 0;

		// Sempre sera executado pelo menos uma vez
		do {
			System.out.println("Do While: " + count);

			count++;
		} while (count < 10);

		for (int i = 0; i < 10; i++) {
			System.out.println("For: " + i);
		}
	}

}
