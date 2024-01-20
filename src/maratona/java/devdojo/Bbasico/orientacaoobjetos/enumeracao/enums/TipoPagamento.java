package maratona.java.devdojo.Bbasico.orientacaoobjetos.enumeracao.enums;

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

	// Ao definir como 'abstract', é definido que deve ser sobrescrito o método
	public abstract double calcularDesconto(double valor);
}