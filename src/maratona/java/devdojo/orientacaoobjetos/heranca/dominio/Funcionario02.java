package maratona.java.devdojo.orientacaoobjetos.heranca.dominio;

public class Funcionario02 extends Pessoa02 {
	private double salario;

	public Funcionario02(String nome) {
		super(nome);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Salario: " + this.salario);
	}

	public void relatorioPagamento() {
		System.out.println("O RG é " + this.rg);
	}
}
