package maratona.java.devdojo.Davancado.generics.service;

import java.util.List;

/**
 * - Algumas das abreviações para os genéricos tem um motivo, como por exemplo o
 * T = tipo (type), E = elemento (element).'
 */
public class RentalService<T> {
	private List<T> objetosDisponiveis;

	public RentalService(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
	}

	public T buscarObjetoDisponivel() {
		System.out.println("Buscando objeto disponível...");

		T type = objetosDisponiveis.remove(0);

		System.out.println("Alugando objeto: " + type);
		System.out.println("Objetos disponíveis para alugar: ");
		System.out.println(objetosDisponiveis);

		return type;
	}

	public void retornarObjetoAlugado(T type) {
		System.out.println("Devolvedo objeto: " + type);

		objetosDisponiveis.add(type);

		System.out.println("Objetos disponíveis para alugar: ");
		System.out.println(objetosDisponiveis);
	}
}
