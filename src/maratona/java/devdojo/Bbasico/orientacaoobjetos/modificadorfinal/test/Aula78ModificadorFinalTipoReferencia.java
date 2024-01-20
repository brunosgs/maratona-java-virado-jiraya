package maratona.java.devdojo.Bbasico.orientacaoobjetos.modificadorfinal.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.modificadorfinal.dominio.Produto;

/*
	OBS: Quando definido 'final' para um tipo referência não é possível alterar
	a referência com o objeto criado, mas o valores do objeto podem ser alterados.
*/
public class Aula78ModificadorFinalTipoReferencia {

	public static void main(String[] args) {
		Produto produto = new Produto();

		System.out.println(produto.COMPRADOR);

		produto.COMPRADOR.setNome("Pedro");

		System.out.println(produto.COMPRADOR);
	}

}
