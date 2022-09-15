package maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.test;

import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.dominio.Aluno;
import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.dominio.Local;
import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.dominio.Professor;
import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.dominio.Seminario;
import maratona.java.devdojo.orientacaoobjetos.associacao.exercicio.util.Relatorio;

/*
  Crie um sistema que gerencie seminários

  O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado

  - Um aluno poderá estar apenas em um seminário;
  - Um seminário poderá ter nenhum ou vários alunos;
  - Um professor poderá ministrar vários seminários;
  - Um seminário deve ter um local.

  Campos básicos (excluindo relacionamento)
  - seminário: titulo
  - aluno: nome e idade
  - professor: nome, especialidade
  - local: endereço
*/
public class Aula70ExercicioAssociacao {

	public static void main(String[] args) {
		Local local = new Local("Av. José Pedro Teste");

		Aluno aluno01 = new Aluno("Pedro", 20);
		Aluno aluno02 = new Aluno("Maria", 23);
		Aluno[] alunos = { aluno01, aluno02 };

		Professor professor01 = new Professor("José", "Programador");

		Seminario seminario01 = new Seminario("Programação Java", local);
		Seminario seminario02 = new Seminario("Programação Python", local);
		Seminario[] seminarios = { seminario01, seminario02 };

		Relatorio relatorio = new Relatorio();

		aluno01.setSeminario(seminario01);
		aluno02.setSeminario(seminario01);
		seminario01.setAlunos(alunos);
		professor01.setSeminarios(seminarios);

		relatorio.imprimeAluno(aluno01);
		relatorio.imprimeProfessor(professor01);
		relatorio.imprimeSeminarios(seminario01);
	}

}
