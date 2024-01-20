package maratona.java.devdojo.Bbasico.orientacaoobjetos.introducaoclasses.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.introducaoclasses.dominio.Estudante;

public class Aula39EstudanteTest {

	public static void main(String[] args) {
		/*
		 * Declarado uma variável de referência do tipo 'Estudante estudante' que cria
		 * um objeto 'new Estudante()';
		 */
		Estudante estudante = new Estudante();

		estudante.nome = "Ichigo";
		estudante.idade = 21;
		estudante.sexo = 'M';

		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
	}

}
