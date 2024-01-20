package maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.unidirecional.dominio;

public class Escola {
	private String nome;
	private Professor[] professores;

	public Escola(String nome) {
		this.nome = nome;
	}

	public Escola(String nome, Professor[] professores) {
		this.nome = nome;
		this.professores = professores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}

	public void imprime() {
		System.out.println("Escola: " + this.nome);

		if (this.professores == null) {
			return;
		}

		System.out.println("Professores: ");

		for (Professor professor : professores) {

			System.out.println(professor.getNome());
		}
	}

}
