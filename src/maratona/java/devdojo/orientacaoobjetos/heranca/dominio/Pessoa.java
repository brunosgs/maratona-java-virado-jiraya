package maratona.java.devdojo.orientacaoobjetos.heranca.dominio;

// Pessoa seria a classe mais genérica.
public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco.getRua() + " / " + this.endereco.getCep());
	}

}
