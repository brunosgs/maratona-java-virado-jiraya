package maratona.java.devdojo.Davancado.classesinternas.test;

/**
 * - Classes anonimas vão surgir em um pequeno período no código e não poderão
 * ser utilizadas em nenhum outro lugar;
 * <p>
 * - Ao definir chaves depois a instanciação da classe é criado uma classe
 * anônima, esse possui as regras de uma subclasse;
 */
public class Aula191AnonymousClasses {

	public static void main(String[] args) {
		// Definição de classe anônima
		Animal animal = new Animal() {

			@Override
			public void walk() {
				System.out.println("Anonymous: Walking in the shadows...");
			}

		};

		animal.walk();
	}

}

class Animal {
	public void walk() {
		System.out.println("Animal walking...");
	}
}
