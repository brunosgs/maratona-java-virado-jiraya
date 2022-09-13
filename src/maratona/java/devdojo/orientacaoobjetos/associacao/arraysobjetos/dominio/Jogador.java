package maratona.java.devdojo.orientacaoobjetos.associacao.arraysobjetos.dominio;

public class Jogador {
	private String nome;

	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprime() {
		System.out.println("Jogador: " + this.nome);
	}

}
