package maratona.java.devdojo.Aintroducao.estruturasrepeticao;

// Imprima os primeiros 25 números de um dado valor, por exemplo: 50
public class Aula29Break {

	public static void main(String[] args) {
		int valorMax = 50;

		for (int i = 0; i < valorMax; i++) {
			if (i > 25) {
				break; // break deve esta dentro de um switch ou loop
			}

			System.out.println(i);
		}
	}

}
