package maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.util;

import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.dominio.Aluno;
import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.dominio.Professor;
import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.dominio.Seminario;

public class Relatorio {
	public void imprimeAluno(Aluno aluno) {
		System.out.println("-- ALUNO --");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade:" + aluno.getIdade());
		System.out.println("Seminário matriculado: " + aluno.getSeminario().getTitulo());
		System.out.print("\n");
	}

	public void imprimeProfessor(Professor professor) {
		System.out.println("-- PROFESSOR --");
		System.out.println("Nome: " + professor.getNome());
		System.out.println("Especialidade: " + professor.getEspecialidade());

		if (professor.getSeminarios() == null || professor.getSeminarios().length == 0) {
			System.out.print("\n");

			return;
		}

		System.out.println("Seminários ministrados:");

		for (Seminario seminario : professor.getSeminarios()) {
			System.out.println("Título: " + seminario.getTitulo());
		}

		System.out.print("\n");
	}

	public void imprimeSeminarios(Seminario seminario) {
		System.out.println("-- SEMINÁRIO --");
		System.out.println("Título: " + seminario.getTitulo());

		if (seminario.getLocal() == null) {
			System.out.print("\n");

			return;
		}

		System.out.println("Local: " + seminario.getLocal().getEndereco());

		if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
			System.out.print("\n");

			return;
		}

		System.out.println("Alunos participantes:");

		for (Aluno aluno : seminario.getAlunos()) {
			imprimeAluno(aluno);
		}

		System.out.print("\n");
	}
}
