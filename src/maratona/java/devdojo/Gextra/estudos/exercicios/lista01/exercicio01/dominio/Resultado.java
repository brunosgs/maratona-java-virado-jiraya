package maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio01.dominio;

public class Resultado {
	private String nomeEspecie;
	private int quantidade;

	public Resultado(String nomeEspecie, int quantidade) {
		this.nomeEspecie = nomeEspecie;
		this.quantidade = quantidade;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public int getQuantidade() {
		return quantidade;
	}


}