package maratona.java.devdojo.orientacaoobjetos.enumeracao.test;

import maratona.java.devdojo.orientacaoobjetos.enumeracao.dominio.Cliente03;
import maratona.java.devdojo.orientacaoobjetos.enumeracao.enums.TipoCliente;
import maratona.java.devdojo.orientacaoobjetos.enumeracao.enums.TipoPagamento;

public class Aula82EnumeracaoSobrescritaMetodos {

	public static void main(String[] args) {
		Cliente03 cliente01 = new Cliente03("Roberto", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
		Cliente03 cliente02 = new Cliente03("Maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

		Cliente03[] clientes = { cliente01, cliente02 };

		for (Cliente03 cliente : clientes) {
			System.out.println(cliente);
		}

		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
	}

}
