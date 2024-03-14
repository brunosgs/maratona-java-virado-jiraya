package maratona.java.devdojo.Davancado.classesinternas.test;

/**
 * - Para fazer a chamada da classe aninhada estática é preciso criar o objeto,
 * mesmo ela sendo estática;
 */
public class Aula192OuterStaticClasses {
	private String name = "Teste";

	static class Nested {
		private String lastName = "Teste2";

		void print() {
			System.out.println(new Aula192OuterStaticClasses().name + " " + lastName);
		}
	}

	public static void main(String[] args) {
		// Formas de criar o objeto e chamar a classe aninhada estática
		new Aula192OuterStaticClasses.Nested().print();
		new Nested().print();
	}

}
