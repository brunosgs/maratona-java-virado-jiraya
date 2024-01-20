package maratona.java.devdojo.Bbasico.orientacaoobjetos.enumeracao.enums;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");

	private int valor;
	private String nomeRelatorio;

	private TipoCliente(int valor, String nomeRelatorio) {
		this.valor = valor;
		this.nomeRelatorio = nomeRelatorio;
	}

	public int getValor() {
		return valor;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

	public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio) {
		for (TipoCliente tipoCliente : values()) {
			if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipoCliente;
			}
		}

		return null;
	}



}
