package maratona.java.devdojo.Aintroducao.estruturasrepeticao;

// Imprima todos os número pares até 0 até 1000000
public class Aula28ExercicioFor {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000000; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
