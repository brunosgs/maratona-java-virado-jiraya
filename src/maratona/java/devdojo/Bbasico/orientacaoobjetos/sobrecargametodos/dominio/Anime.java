package maratona.java.devdojo.Bbasico.orientacaoobjetos.sobrecargametodos.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;

	/*
	 * Sobrecarga de métodos é quando o nome do método é igual, mas o tipo ou a
	 * quantidade de paramentros é diferente.
	 */
	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
	}

	public void init(String nome, String tipo, int episodios, String genero) {
		this.init(nome, tipo, episodios);
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
	}

}
