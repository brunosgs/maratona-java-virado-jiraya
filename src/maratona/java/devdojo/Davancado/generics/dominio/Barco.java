package maratona.java.devdojo.Davancado.generics.dominio;

public class Barco {
	private String nome;

	public Barco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Barco [nome=" + nome + "]";
	}

}
