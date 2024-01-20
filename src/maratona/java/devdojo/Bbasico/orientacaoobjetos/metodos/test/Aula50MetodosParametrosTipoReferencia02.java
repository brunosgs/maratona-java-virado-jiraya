package maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.dominio.Estudante;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.dominio.ImpressoraEstudante;

public class Aula50MetodosParametrosTipoReferencia02 {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();

		estudante.nome = "João";
		estudante.idade = 18;
		estudante.sexo = 'M';

		impressora.imprimeAlterandoObjeto(estudante);
		impressora.imprimeAlterandoObjeto(estudante);
	}

}
