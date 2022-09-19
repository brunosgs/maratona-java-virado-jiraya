package maratona.java.devdojo.orientacaoobjetos.enumeracao.enums;

public enum TipoPagamento {
	DEBITO {
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.1;
		}
	},
	CREDITO {
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.05;
		}
	};

	// Ao definir como 'abstract', é denifio que deve ser sobrescrito o método
	public abstract double calcularDesconto(double valor);
}