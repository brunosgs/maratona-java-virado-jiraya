package maratona.java.devdojo.orientacaoobjetos.modificadorfinal.dominio;

/*
 	- Ao definir o 'final' para uma variável de tipo primitivo e atribuir valor, o
 	mesmo não sera alterado até a finalização do programa;

 	- Deve se seguir uma convesão ao declarar, onde deve ser escrito em Uppercase e
 	caso exista mais de uma palavra, separar com o underscore.

 	OBS: é comum ver o atributo 'final' vir antes o 'static', mas não é uma regra,
 	depende da utilização.
*/
public class Carro {
	private String nome;
	public static final double VELOCIDADE_LIMITE = 250; // Constante inicializada
	public static final double VELOCIDADE_LIMITE_BLOCO_INICIALIZACAO_STATIC;
	public final double VELOCIDADE_LIMITE_BLOCO_INICIALIZACAO;

	static {
		// Constante inicializada pelo bloco de inicialização static
		VELOCIDADE_LIMITE_BLOCO_INICIALIZACAO_STATIC = 200;
	}

	{
		// Constante inicializada pelo bloco de inicialização
		VELOCIDADE_LIMITE_BLOCO_INICIALIZACAO = 180;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
