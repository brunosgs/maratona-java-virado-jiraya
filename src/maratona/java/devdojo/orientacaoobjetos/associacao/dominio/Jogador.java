package maratona.java.devdojo.orientacaoobjetos.associacao.dominio;

public class Jogador {
	private String nome;
	private Time time;

	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public void imprime() {
		System.out.println("Jogador: " + this.nome);

		if (this.time != null) {
			System.out.println("Time: " + this.time.getNome());
		}
	}

}
