package maratona.java.devdojo.Davancado.generics.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.generics.dominio.Barco;
import maratona.java.devdojo.Davancado.generics.dominio.Carro;
import maratona.java.devdojo.Davancado.generics.service.RentalService;

/**
 * - Com a utilização do 'Generics' para situações especificas fica mais
 * reutilizável, mas uma observação é, muitas implementações de 'Generics' podem
 * fazer o código ficar complexo e difícil de ler, então usar com sabedoria!
 */
public class Aula187ClassesGenericas {

	public static void main(String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

		RentalService<Carro> rentalCarroService = new RentalService<>(carrosDisponiveis);

		Carro carroDisponivel = rentalCarroService.buscarObjetoDisponivel();
		System.out.println("Usando carro por um mes... ");

		rentalCarroService.retornarObjetoAlugado(carroDisponivel);

		System.out.println("\n------------- x ------------ x ------------\n");

		RentalService<Barco> rentalBarcoService = new RentalService<>(barcosDisponiveis);

		Barco barcoDisponivel = rentalBarcoService.buscarObjetoDisponivel();
		System.out.println("Usando barco por um mes...");

		rentalBarcoService.retornarObjetoAlugado(barcoDisponivel);
	}

}
