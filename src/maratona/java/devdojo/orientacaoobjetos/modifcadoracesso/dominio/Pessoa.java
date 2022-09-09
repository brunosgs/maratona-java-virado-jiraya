package maratona.java.devdojo.orientacaoobjetos.modifcadoracesso.dominio;

// Modificador de acessos: private, get e set
public class Pessoa {
	// Modicador de acesso private permite acesso aos atributos só pelo objeto.
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Idade inválida!");

			return;
		}

		this.idade = idade;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
	}
}
