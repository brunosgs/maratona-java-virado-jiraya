package maratona.java.devdojo.orientacaoobjetos.enumeracao.dominio;

import maratona.java.devdojo.orientacaoobjetos.enumeracao.enums.TipoCliente;

public class Cliente {
	private String nome;
	private TipoCliente tipoCliente; // Relação tem um (Has-a)

	public Cliente(String nome, TipoCliente tipoCliente) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente + "]";
	}

}
