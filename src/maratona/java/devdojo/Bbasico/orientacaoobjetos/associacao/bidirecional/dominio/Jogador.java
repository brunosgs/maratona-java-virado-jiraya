package maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.bidirecional.dominio;

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
		System.out.println(" -- JOGADOR --");
		System.out.println(this.nome);

		if (this.time == null) {
			return;
		}

		System.out.println("Time: " + this.time.getNome() + "\n");
	}

}
