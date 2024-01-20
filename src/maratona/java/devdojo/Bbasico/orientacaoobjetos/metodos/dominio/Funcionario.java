package maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.dominio;

public class Funcionario {
	public String nome;
	public int idade;
	public double[] salarios;

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

		double media = 0;

		for (double salario : salarios) {
			media += salario;
		}

		media /= salarios.length;

		System.out.println("\nMédia de salários é: R$" + media);
	}
}
