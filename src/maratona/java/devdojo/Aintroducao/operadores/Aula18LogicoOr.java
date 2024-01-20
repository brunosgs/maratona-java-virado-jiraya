package maratona.java.devdojo.Aintroducao.operadores;

public class Aula18LogicoOr {

	public static void main(String[] args) {
		// Operadores lógicos: AND(&&), OR(||) e NOT (!)

		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;

		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
				|| valorTotalContaPoupanca > valorPlaystation;

		System.out.println("Comprar playstation cinco?: " + isPlaystationCincoCompravel);
	}

}
