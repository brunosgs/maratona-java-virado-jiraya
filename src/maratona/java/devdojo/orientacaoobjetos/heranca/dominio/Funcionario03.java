package maratona.java.devdojo.orientacaoobjetos.heranca.dominio;

public class Funcionario03 extends Pessoa03 {
	private double salario;

	static {
		System.out.println("Dentro do bloco de inicialização estático Funcionario03");
	}

	{
		System.out.println("Dentro do bloco de inicialização 1 de Funcionario03");
	}

	{
		System.out.println("Dentro do bloco de inicialização 2 de Funcionario03");
	}

	public Funcionario03(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de Funcionario03");
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
