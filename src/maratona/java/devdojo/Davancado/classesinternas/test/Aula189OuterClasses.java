package maratona.java.devdojo.Davancado.classesinternas.test;

/**
 * - Para chamar um classe dentro de outra classe se utilizar 'new Classe().new
 * OutraClasse();';
 * <p>
 * - Quando se chama o 'this', ele vai sempre se referenciar ao contexto da
 * classe que ele esta sendo chamado;
 */
public class Aula189OuterClasses {
	private String name = "Monkey D. Luffy";

	// Nested
	class Inner {
		public void printOuterClassAttributes() {
			System.out.println(name);
			System.out.println(this);
			System.out.println(Aula189OuterClasses.this);
		}
	}

	public static void main(String[] args) {
		Aula189OuterClasses aula189 = new Aula189OuterClasses();
		Inner outer = aula189.new Inner();

		Inner outer2 = new Aula189OuterClasses().new Inner();

		outer.printOuterClassAttributes();
		outer2.printOuterClassAttributes();
	}

}
