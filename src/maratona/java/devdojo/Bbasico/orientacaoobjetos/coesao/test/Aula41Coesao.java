package maratona.java.devdojo.Bbasico.orientacaoobjetos.coesao.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.coesao.dominio.Estudante;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.coesao.dominio.Professor;

public class Aula41Coesao {

	public static void main(String[] args) {
		/*
		 * Uma classe altamente coesa tem responsabilidades e propósitos claros e bem
		 * definidos, enquanto uma classe com baixa coesão tem muitas responsabilidades
		 * diferentes e pouco relacionadas. OBS: Alta coesão significa otima definição
		 * de cada classe, nunca deixar classes pouco ou não coesas.
		 */
		Professor professor = new Professor();
		Estudante estudante = new Estudante();

		professor.nome = "Metre Kami";
		professor.idade = 150;
		professor.sexo = 'M';

		estudante.nome = "Goku";
		estudante.idade = 25;
		estudante.sexo = 'M';

		System.out.println("Professor: " + professor.nome + " / " + professor.idade + " / " + professor.sexo);
		System.out.println("Estudante: " + estudante.nome + " / " + estudante.idade + " / " + estudante.sexo);
	}

}
