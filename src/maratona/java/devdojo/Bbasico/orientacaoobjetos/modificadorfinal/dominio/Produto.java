package maratona.java.devdojo.Bbasico.orientacaoobjetos.modificadorfinal.dominio;

/*
 	- Ao definir uma variável do tipo referência como 'final', a mesma nunca vai
 	alterar sua referência com o objeto criado.
 */
public class Produto {
	private String nome;
	public final Comprador COMPRADOR = new Comprador();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
