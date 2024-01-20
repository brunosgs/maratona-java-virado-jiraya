package maratona.java.devdojo.Bbasico.orientacaoobjetos.heranca.dominio;

// Pessoa é a classe mais genérica.
public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;

	/*
	 * Quando o atributo estiver com o modificador de acesso 'protected', as
	 * sub-classes vão visualizar esse atributo e as classes que estiverem dentro do
	 * mesmo pacote de 'Pessoa'.
	 */
	protected String rg;

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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco.getRua() + " / " + this.endereco.getCep());
	}

}
