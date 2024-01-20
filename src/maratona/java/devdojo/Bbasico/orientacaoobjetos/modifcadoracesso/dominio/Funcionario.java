package maratona.java.devdojo.Bbasico.orientacaoobjetos.modifcadoracesso.dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double[] salarios;
	private double media;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public void imprime() {
		System.out.println("----- Funcionário -----");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);

		if (salarios == null) {
			return;
		}

		System.out.println("Salarios: ");

		for (double salario : salarios) {
			System.out.print("R$" + salario + " ");
		}

		imprimeMediaSalarios();
	}

	public void imprimeMediaSalarios() {
		if (salarios == null) {
			return;
		}

		for (double salario : salarios) {
			media += salario;
		}

		media /= salarios.length;

		System.out.println("\nMédia de salários é: R$" + media);
	}
}
