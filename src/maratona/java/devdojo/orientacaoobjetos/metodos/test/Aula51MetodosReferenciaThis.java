package maratona.java.devdojo.orientacaoobjetos.metodos.test;

import maratona.java.devdojo.orientacaoobjetos.metodos.dominio.Estudante;

public class Aula51MetodosReferenciaThis {

	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();

		estudante01.nome = "João";
		estudante01.idade = 18;
		estudante01.sexo = 'M';

		estudante02.nome = "Maria";
		estudante02.idade = 20;
		estudante02.sexo = 'F';

		estudante01.imprime();
		estudante02.imprime();
	}

}
