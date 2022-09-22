package maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio;

public class Tomate extends Produto {
	public static final double IMPOSTO = 0.06;

	public Tomate(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do tomate...");

		return this.valor * IMPOSTO;
	}

}
