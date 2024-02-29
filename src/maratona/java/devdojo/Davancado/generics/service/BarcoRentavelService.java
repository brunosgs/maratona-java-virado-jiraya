package maratona.java.devdojo.Davancado.generics.service;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.generics.dominio.Barco;

public class BarcoRentavelService {
	private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

	public Barco buscarBarcoDisponivel() {
		System.out.println("Buscando barco disponível...");

		Barco barcoRemove = barcosDisponiveis.remove(0);

		System.out.println("Alugando barco: " + barcoRemove);
		System.out.println("Barcos disponíveis para alugar: ");
		System.out.println(barcosDisponiveis);

		return barcoRemove;
	}

	public void retornarBarcoAlugado(Barco barco) {
		System.out.println("Devolvedo barco: " + barco);

		barcosDisponiveis.add(barco);

		System.out.println("Barcos disponíveis para alugar: ");
		System.out.println(barcosDisponiveis);
	}
}
