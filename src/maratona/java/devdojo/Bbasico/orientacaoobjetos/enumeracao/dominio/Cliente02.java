package maratona.java.devdojo.Bbasico.orientacaoobjetos.enumeracao.dominio;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.enumeracao.enums.TipoCliente;

/*
	- É possível declarar enum dentro da propria classe, mas o ideal é que seja
	feito em uma classe separada do tipo enum.
*/
public class Cliente02 {
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	public enum TipoPagamento {
		DEBITO,
		CREDITO
	}

	public Cliente02(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
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
