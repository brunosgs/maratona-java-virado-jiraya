package maratona.java.devdojo.orientacaoobjetos.enumeracao.test;

import maratona.java.devdojo.orientacaoobjetos.enumeracao.dominio.Cliente;
import maratona.java.devdojo.orientacaoobjetos.enumeracao.enums.TipoCliente;

public class Aula80EnumeracaoIntroducao {

	public static void main(String[] args) {
		Cliente cliente01 = new Cliente("Roberto", TipoCliente.PESSOA_FISICA);
		Cliente cliente02 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente03 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA);
		Cliente cliente04 = new Cliente("Leonardo", TipoCliente.PESSOA_JURIDICA);

		Cliente[] clientes = { cliente01, cliente02, cliente03, cliente04 };

		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
