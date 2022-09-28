package maratona.java.devdojo.orientacaoobjetos.polimorfismo.dominio;

public class Tomate extends Produto {
	public static final double IMPOSTO = 0.06;
	private String dataValidade;

	public Tomate(String nome, double valor) {
		super(nome, valor);
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do tomate...");

		return this.valor * IMPOSTO;
	}

}
