package maratona.java.devdojo.orientacaoobjetos.construtores.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;

	/*
	 * O construtor é sempre inicializado primero do que os métodos. Caso não exista
	 * o construtor, é adicionado um construtor default. Também é possível fazer a
	 * sobrecarga de construtores, existindo mais opções quando for contruido o
	 * objeto.
	 */
	public Anime() {
		System.out.println("TESTE: Denstro do contrutor DEFAULT");
	}

	public Anime(String nome, String tipo, int episodios, String genero) {
		this(); // 'this()' sempre deve ser declarado no início do construtor

		System.out.println("TESTE: Denstro do contrutor 1");
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}

	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome, tipo, episodios, genero);

		System.out.println("TESTE: Denstro do contrutor 2");
		this.estudio = estudio;
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

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
		System.out.println(this.estudio);
	}

}
