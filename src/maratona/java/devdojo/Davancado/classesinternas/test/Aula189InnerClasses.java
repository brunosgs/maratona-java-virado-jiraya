package maratona.java.devdojo.Davancado.classesinternas.test;

/**
 * - Para chamar um classe dentro de outra classe se utilizar 'new Classe().new
 * OutraClasse();';
 * <p>
 * - Quando se chama o 'this', ele vai sempre se referenciar ao contexto da
 * classe que ele esta sendo chamado;
 */
public class Aula189InnerClasses {
	private String name = "Monkey D. Luffy";

	class Inner {
		public void printOuterClassAttributes() {
			System.out.println(name);
			System.out.println(this);
			System.out.println(Aula189InnerClasses.this);
		}
	}

	public static void main(String[] args) {
		Aula189InnerClasses aula189 = new Aula189InnerClasses();
		Inner outer = aula189.new Inner();

		Inner outer2 = new Aula189InnerClasses().new Inner();

		outer.printOuterClassAttributes();
		outer2.printOuterClassAttributes();
	}

}
