package maratona.java.devdojo.orientacaoobjetos.heranca.test;

import maratona.java.devdojo.orientacaoobjetos.heranca.dominio.Funcionario03;

/*
	Sequência da construção de um objeto com herança:

	1. Bloco de inicialização static da super classe é executado quando a JVM carregar a classe pai;
	2. Bloco de inicialização static da sub-classe é executado quando a JVM carregar a classe filha;
	3. Alocado espaço em memória para o objeto da classe pai;
	4. Cada atributo da classe pai é criado e inicializado com valores default ou o que for atribuído a	ele;
	5. Bloco(s) de inicialização da super classe é executado na ordem em que foi declarado;
	6. Construtor da super classe é inicializado e executado.
	7. Alocado espaço em memória para o objeto da subclasse;
	8. Cada atributo da subclasse é criado e inicializado com valores default ou o que for atribuído a ele ou
	pela classe pai;
	9. Bloco(s) de inicialização da sub-classe é executado na ordem que foi declarado;
	10. Construtor da sub-classe é inicializado e executado.

*/
public class Aula75HerancaSequenciaInicializacao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Funcionario03 funcionario = new Funcionario03("Roberto");
	}

}
