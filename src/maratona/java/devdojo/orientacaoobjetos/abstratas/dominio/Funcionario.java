package maratona.java.devdojo.orientacaoobjetos.abstratas.dominio;

/*
	- A classe abstrata serve como um modelo para outras classes;
	- Uma classe abstrata não pode ser mais instanciada, só pode ser herdada;
	- Uma classe abstrata não pode ter um objeto criado a partir de instanciação.
*/
public abstract class Funcionario {
	protected String nome;
	protected double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

}
