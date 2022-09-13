package maratona.java.devdojo.orientacaoobjetos.estaticos.modificadorstatic.dominio;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	/*
	 * Os atributos estáticos de uma classe são compartilhados por todas as
	 * instâncias dessa classe
	 */
	public static double velocidadeLimite = 250;

	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void imprime() {
		System.out.println("-----------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
	}
}
