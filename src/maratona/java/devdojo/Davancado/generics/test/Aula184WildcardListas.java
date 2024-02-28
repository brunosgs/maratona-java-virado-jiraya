package maratona.java.devdojo.Davancado.generics.test;

import java.util.List;

/**
 * - Ao tentar passa a lista de cachorros utilizando o método 'printConsulta()'
 * é mostrado um erro de compilação, isso se causa porque uma vez compilado o
 * Java não sabe qual o tipo de lista que esta sendo passada como argumento por
 * causa do type erasure.
 * <p>
 * - O tipo da lista que é definido no método é o qual deve receber como
 * argumento da chamada.
 */
public class Aula184WildcardListas {

	public static void main(String[] args) {
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());

		// printConsulta(cachorros);
	}

	private static void printConsulta(List<Animal> animais) {
		for (Animal animal : animais) {
			animal.consulta();
		}

		animais.add(new Cachorro());
	}

}
