package maratona.java.devdojo.Davancado.generics.test;

/**
 * - Ao tentar fazer um 'printConsulta' do objetos 'Cachorros' de uma lista,
 * onde o método tenta adicionar um objeto 'Gato', o mesmo gera erro pois o Java
 * sabe que esta tentando imprimir um tipo de objeto 'Cachorro';
 */
public class Aula184Wildcard {

	public static void main(String[] args) {
		Cachorro[] cachorros = { new Cachorro(), new Cachorro() };
		Gato[] gatos = { new Gato(), new Gato() };

		printConsulta(cachorros);
		printConsulta(gatos);
	}

	private static void printConsulta(Animal[] animais) {
		for (Animal animal : animais) {
			animal.consulta();
		}

		animais[1] = new Gato();
	}

}

abstract class Animal {
	public abstract void consulta();
}

class Cachorro extends Animal {

	@Override
	public void consulta() {
		System.out.println("Consulta cachorro");
	}

}

class Gato extends Animal {

	@Override
	public void consulta() {
		System.out.println("Consulta gato");
	}

}
