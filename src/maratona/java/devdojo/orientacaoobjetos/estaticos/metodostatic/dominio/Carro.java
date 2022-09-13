package maratona.java.devdojo.orientacaoobjetos.estaticos.metodostatic.dominio;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	/*
	 * Os atributos estáticos de uma classe são compartilhados por todas as
	 * instâncias dessa classe
	 */
	private static double velocidadeLimite = 250;

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

	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	/*
	 * Os métodos static ou métodos da classe são funções que não dependem de
	 * nenhuma variável de instância, quando invocados executam uma função sem a
	 * dependência do conteúdo de um objeto ou a execução da instância de uma classe
	 */
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}

	public void imprime() {
		System.out.println("-----------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
	}
}
