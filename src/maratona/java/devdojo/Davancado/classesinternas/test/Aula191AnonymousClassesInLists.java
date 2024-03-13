package maratona.java.devdojo.Davancado.classesinternas.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import maratona.java.devdojo.Davancado.generics.dominio.Barco;

/**
 * - Classes anonimas vão surgir em um pequeno período no código e não poderão
 * ser utilizadas em nenhum outro lugar;
 * <p>
 * - Ao definir chaves depois a instanciação da classe é criado uma classe
 * anônima, esse possui as regras de uma subclasse;
 */
public class Aula191AnonymousClassesInLists {

	public static void main(String[] args) {
		List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

		barcoList.sort(new Comparator<Barco>() {

			@Override
			public int compare(Barco barco, Barco otherBarco) {
				return barco.getNome().compareTo(otherBarco.getNome());
			}

		});

		System.out.println(barcoList);

	}

}
