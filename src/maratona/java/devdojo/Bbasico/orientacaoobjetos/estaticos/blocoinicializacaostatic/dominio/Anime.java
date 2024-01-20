package maratona.java.devdojo.Bbasico.orientacaoobjetos.estaticos.blocoinicializacaostatic.dominio;

/*
 	Sequência da construção de um objeto:

	1. Bloco de inicialização static é executado quando a JVM carregar a classe;
 	2. Alocado espaço em memória para o objeto;
 	3. Cada atributo de classe é criado e inicializado com valores default ou o que for atribuído a eles;
 	4. Bloco de inicialização é executado;
 	5. Construtor é inicializado e executado.
*/
public class Anime {
	private String nome;
	private static int[] episodios;

	{
		System.out.println("BLOCO DE INICIALIZAÇÃO");
	}

	static {
		System.out.println("\nBLOCO DE INICIALIZAÇÃO STATIC");

		episodios = new int[100];

		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}

	static {
		System.out.println("BLOCO DE INICIALIZAÇÃO STATIC 02");

		episodios = new int[100];

		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}

	public Anime() {
		for (int episodio : Anime.episodios) {
			System.out.print(episodio + " ");
		}

		System.out.println("");
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

}
