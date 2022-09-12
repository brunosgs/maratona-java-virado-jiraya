package maratona.java.devdojo.orientacaoobjetos.blocoinicializacao.dominio;

/*
 	Sequência da construção de um objeto:

 	1. Alocado espaço em memória para o objeto;
 	2. Cada atributo de classe é criado e inicializado com valores default ou o que for atribuido a eles;
 	3. Bloco de inicialização é executado;
 	4. Construtor é inicializado e executado.

 	OBS: Pode haver mundanças na sequência quando entrar em temas como Herança e blocos estáticos.
*/
public class Anime {
	private String nome;
	private int[] episodios;

	/*
	 * Blocos não-estáticos ou blocos de inicialização de instância são usados
	 * quando se quer acrescentar um comportamento a ser executado por todos os
	 * construtores dessa classe. Um bloco de inicialização de instância roda toda
	 * vez que uma nova instância = objeto da classe é criada.
	 */
	{
		System.out.println("BLOCO DE INICIALIZAÇÃO");

		this.episodios = new int[100];

		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}

	public Anime() {
		for (int episodio : this.episodios) {
			System.out.print(episodio + " ");
		}
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}

}
