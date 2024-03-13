package maratona.java.devdojo.Davancado.classesinternas.test;

/**
 * - Classes locais geralmente são criadas dentro do corpo de um método ou de um
 * bloco de inicialização estático;
 * <p>
 * - Para que seja possível utilizar um classe local, ela deve ser instanciada
 * dentro do método que contém ela;
 * <p>
 * - Atributos do método podem ser utilizados pela classe local, mas não podem
 * ser modificados porque dentro do escopo elas tem que ser final ou
 * efetivamente final. Essa regra serve também para os pârametros, ele deve ser
 * final ou efetivamente final;
 */
public class Aula190OuterClasses {
	private String name = "Midoriya";

	void print(String params) {
		String lastName = "Izuku";

		// Modificadores de acesso são: abstract e final
		class LocalClass {
			public void printLocal() {
				System.out.println(params);
				System.out.println(name + " " + lastName);
			}
		}

		LocalClass localClass = new LocalClass();

		localClass.printLocal();
	}

	public static void main(String[] args) {
		new Aula190OuterClasses().print("Teste");
	}

}
