package maratona.java.devdojo.orientacaoobjetos.modificadorfinal.dominio;

/*
	- Quando denifido um método como final, as classes que herdam (estendida)
	não conseguem sobrescrever o método.
*/
public class Carro03 {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public final void imprime() {
		System.out.println(this.nome);
	}

}
