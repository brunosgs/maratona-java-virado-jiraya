package maratona.java.devdojo.orientacaoobjetos.heranca.dominio;

/*
 	OBSERVAÇÕES:
 	- Todas classes do java são filhas de 'Object';

 	- Quando o atributo estiver com o modificador de acesso 'protected', as sub-classes
 	vão visualizar esse atributo e as classes que estiverem dentro do mesmo pacote;

 	- Quando inserido um novo contrutor na classe pai, esse contrutores vão ter que ser
 	inseridos nas seus filhos (sub-classes), classes que extendem.
*/
public class Pessoa03 {
	private String nome;
	private String cpf;
	private Endereco endereco;
	protected String rg;

	static {
		System.out.println("Dentro do bloco de inicialização estático Pessoa03");
	}

	{
		System.out.println("Dentro do bloco de inicialização 1 de Pessoa03");
	}

	{
		System.out.println("Dentro do bloco de inicialização 2 de Pessoa03");
	}

	public Pessoa03(String nome) {
		System.out.println("Dentro do construtor de Pessoa03");
		this.nome = nome;
	}

	public Pessoa03(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}

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
