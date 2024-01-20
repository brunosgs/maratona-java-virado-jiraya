package maratona.java.devdojo.Bbasico.orientacaoobjetos.heranca.dominio;

/*
 	Quando a classe 'Funcionario' estende de 'Pessoa' ela fica
 	mais especializada.
*/
public class Funcionario extends Pessoa {
	private double salario;

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
