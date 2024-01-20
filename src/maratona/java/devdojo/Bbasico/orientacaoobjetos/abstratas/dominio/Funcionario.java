package maratona.java.devdojo.Bbasico.orientacaoobjetos.abstratas.dominio;

/*
	- A classe abstrata serve como um modelo para outras classes;
	- Uma classe abstrata não pode ser mais instanciada, só pode ser herdada;
	- Uma classe abstrata não pode ter um objeto criado a partir de instanciação;
	- Não é possível existir um método abstrato em uma classe concreta;
	- Em uma classe abstrata é possível ter ambos métodos abstratos e concretos;
	- Quando definido um método abstrato, as classes que herdarem deve implementar
	o método.
	- Caso um classe abstrata estenda de uma outra classe abstrata, não é obrigatorio
	implentar os métodos, mas caso implemente, sera implementado uma única vez.
*/
public abstract class Funcionario extends Pessoa {
	protected String nome;
	protected double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}

	public abstract void calculaBonus();

	@Override
	public void imprime() {
		System.out.println("Imprimindo..." + this);
	}



}
