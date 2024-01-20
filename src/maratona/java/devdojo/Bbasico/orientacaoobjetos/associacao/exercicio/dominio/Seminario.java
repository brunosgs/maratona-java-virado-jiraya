package maratona.java.devdojo.Bbasico.orientacaoobjetos.associacao.exercicio.dominio;

public class Seminario {
	private String titulo;
	private Local local;
	private Aluno[] alunos;

	public Seminario(String titulo, Local local) {
		this.titulo = titulo;
		this.local = local;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

}
