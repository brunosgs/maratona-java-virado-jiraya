package maratona.java.devdojo.Bbasico.orientacaoobjetos.modificadorfinal.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.modificadorfinal.dominio.Carro;

public class Aula77ModificadorFinalTipoPrimitivo {

	public static void main(String[] args) {
		Carro carro = new Carro();

		System.out.println(Carro.VELOCIDADE_LIMITE);
		System.out.println(Carro.VELOCIDADE_LIMITE_BLOCO_INICIALIZACAO_STATIC);
		System.out.println(carro.VELOCIDADE_LIMITE_BLOCO_INICIALIZACAO);
	}

}
