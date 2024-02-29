package maratona.java.devdojo.Davancado.generics.test;

import maratona.java.devdojo.Davancado.generics.dominio.Barco;
import maratona.java.devdojo.Davancado.generics.dominio.Carro;
import maratona.java.devdojo.Davancado.generics.service.BarcoRentavelService;
import maratona.java.devdojo.Davancado.generics.service.CarroRentavelService;

/**
 * - Ao exemplificar os serviços eles são 'idênticos', o que muda é o objeto;
 */
public class Aula186ClassesGenericas {

	public static void main(String[] args) {
		CarroRentavelService carroRentalService = new CarroRentavelService();
		Carro buscarCarroDisponivel = carroRentalService.buscarCarroDisponivel();

		System.out.println("Usando carro por um mes... ");
		carroRentalService.retornarCarroAlugado(buscarCarroDisponivel);

		System.out.println(" ------------------------------------- ");

		BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
		Barco buscarBarcoDisponivel = barcoRentavelService.buscarBarcoDisponivel();

		System.out.println("\nUsando barco por um mes... ");
		barcoRentavelService.retornarBarcoAlugado(buscarBarcoDisponivel);
	}

}
