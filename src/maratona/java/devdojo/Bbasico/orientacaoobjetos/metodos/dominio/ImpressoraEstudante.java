package maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.dominio;

public class ImpressoraEstudante {
	// 'estudante' é a referencia do objeto que foi enviado a esse método
	public void imprime(Estudante estudante) {
		System.out.println("-----------------------");

		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
	}

	/*
	 * Nessa situação, método 'imprimeAlterandoObjeto', esta fazendo uma alteração
	 * no objeto referenciado, mudando o estado do objeto.
	 *
	 * OBSERVAÇÃO: As boas praticas dizem que se deve retornar um novo objeto, caso
	 * deseje fazer alteração.
	 */
	public void imprimeAlterandoObjeto(Estudante estudante) {
		System.out.println("-----------------------");

		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);

		estudante.nome = "Nome Teste";
	}
}
