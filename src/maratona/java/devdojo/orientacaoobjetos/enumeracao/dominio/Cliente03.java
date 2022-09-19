package maratona.java.devdojo.orientacaoobjetos.enumeracao.dominio;

import maratona.java.devdojo.orientacaoobjetos.enumeracao.enums.TipoCliente;
import maratona.java.devdojo.orientacaoobjetos.enumeracao.enums.TipoPagamento;

public class Cliente03 {
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	public Cliente03(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente02 [nome=" + nome + ", tipoCliente=" + tipoCliente + ", tipoCliente=" + tipoCliente.getValor()
				+ ", tipoPagamento=" + tipoPagamento + "]";
	}

}
