package maratona.java.devdojo.Bbasico.orientacaoobjetos.enumeracao.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.enumeracao.dominio.Cliente02;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.enumeracao.enums.TipoCliente;

public class Aula81EnumeracaoConstrutoresAtributos {

	public static void main(String[] args) {
		Cliente02 cliente01 = new Cliente02("Roberto", TipoCliente.PESSOA_FISICA, Cliente02.TipoPagamento.DEBITO);
		Cliente02 cliente02 = new Cliente02("Maria", TipoCliente.PESSOA_JURIDICA, Cliente02.TipoPagamento.CREDITO);

		Cliente02[] clientes = { cliente01, cliente02 };

		for (Cliente02 cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
