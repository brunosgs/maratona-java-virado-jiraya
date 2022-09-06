package maratona.java.devdojo.orientacaoobjetos.metodos.test;

import maratona.java.devdojo.orientacaoobjetos.metodos.dominio.Estudante;
import maratona.java.devdojo.orientacaoobjetos.metodos.dominio.ImpressoraEstudante;

public class Aula49MetodosParametrosTipoReferencia01 {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();

		estudante1.nome = "Maria";
		estudante1.idade = 20;
		estudante1.sexo = 'F';

		estudante2.nome = "João";
		estudante2.idade = 18;
		estudante2.sexo = 'M';

		// Ao passar objetos do tipo de referência para o método, o método recebe o
		// objeto referenciado.

		impressora.imprime(estudante1);

		impressora.imprime(estudante2);
	}

}
