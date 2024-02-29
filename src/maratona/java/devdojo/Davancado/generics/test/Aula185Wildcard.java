package maratona.java.devdojo.Davancado.generics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * - O wildcard é o '?', ponto de interrogação;
 * <p>
 * - Crio métodos que recebem uma lista de algo que eu sei, mas essas listas
 * podem ser de subtipos (e como não sei qual é o subtipo exatamente, eu não
 * posso incluir nada ali dentro). Quando você assina o contrato, por exemplo:
 * '? extends Animal', esta definido que vai receber uma lista de objetos que
 * extendem de 'Animal', sendo assim não é possível adicionar mais itens a essa
 * lista, ela fica só como leitura;
 * <p>
 * -
 */
public class Aula185Wildcard {

	public static void main(String[] args) {
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		List<Animal> animais = new ArrayList<>();

		printConsulta(cachorros);
		printConsulta(gatos);

		printConsultaAnimalCachorro(cachorros);
		printConsultaAnimalCachorro(animais);

		printConsultaAnimal(animais);
	}

	private static void printConsulta(List<? extends Animal> animais) {
		for (Animal animal : animais) {
			animal.consulta();
		}
	}

	/**
	 * Recebe uma lista de Object, Animal ou Cachorro, é preciso subir na hierarquia
	 * até chegar no topo para identificar qual o tipo do objeto;
	 */
	private static void printConsultaAnimalCachorro(List<? super Cachorro> animais) {
		for (Object object : animais) {
			if (object instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) object;

				System.out.println(cachorro);
			}
		}
	}

	/**
	 * Esse método me permite adicionar qualquer uma das subclasses que estende de
	 * Animal, porque passa na regra do é um do polimorfismo, onde a classe pai é um
	 * Animal.
	 */
	private static void printConsultaAnimal(List<? super Animal> animais) {
		animais.add(new Cachorro());
		animais.add(new Gato());

		for (Object object : animais) {
			System.out.println(object);
		}
	}

}
