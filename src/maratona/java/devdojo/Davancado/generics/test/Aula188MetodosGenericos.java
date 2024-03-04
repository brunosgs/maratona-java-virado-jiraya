package maratona.java.devdojo.Davancado.generics.test;

import java.util.List;

import maratona.java.devdojo.Davancado.colecoes.dominio.Manga;
import maratona.java.devdojo.Davancado.generics.dominio.Barco;
import maratona.java.devdojo.Davancado.generics.dominio.Carro;

public class Aula188MetodosGenericos {

	public static void main(String[] args) {
		criarArrayComUmObjeto(new Barco("Canoa"));

		List<Carro> retornoLista = criarArrayRetornaLista(new Carro("VW"));
		System.out.println(retornoLista);

		List<Manga> retonaListaManga = criarArrayRetornaListaComparable(new Manga(3L, "Manga", 5.15));
		System.out.println(retonaListaManga);
	}

	/**
	 * - Definir o tipo genérico, depois dos modificadores de acesso e antes do tipo
	 * de retorno;
	 */
	private static <T> void criarArrayComUmObjeto(T type) {
		List<T> listType = List.of(type);

		System.out.println(listType);
	}

	/**
	 * - Modificado o retorno para que venha uma lista
	 */
	private static <T> List<T> criarArrayRetornaLista(T type) {
		return List.of(type);
	}

	/**
	 * Na declaração private static <T extends Comparable<T>> List<T>
	 * criarArrayRetornaListaComparable(T type), a palavra-chave extends é usada
	 * para indicar que o tipo genérico T deve ser um tipo que implementa a
	 * interface Comparable<T>.
	 *
	 * Em Java, a palavra-chave extends é usada tanto para classes como para
	 * interfaces quando estamos lidando com tipos genéricos. Isso pode ser um pouco
	 * confuso, porque em um contexto não genérico, extends é usado para indicar
	 * herança de classe, e implements é usado para implementação de interface.
	 *
	 * No entanto, quando se trata de tipos genéricos, extends é usado para ambos.
	 * Então, neste caso, T extends Comparable<T> significa que T deve ser um tipo
	 * que implementa Comparable<T>. Isso é necessário para garantir que os objetos
	 * do tipo T possam ser comparados entre si, o que é uma exigência para muitos
	 * algoritmos e estruturas de dados.
	 */
	private static <T extends Comparable<T>> List<T> criarArrayRetornaListaComparable(T type) {
		return List.of(type);
	}
}
