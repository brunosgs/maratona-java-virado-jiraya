package maratona.java.devdojo.Bbasico.orientacaoobjetos.modifcadoracesso.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.modifcadoracesso.dominio.Pessoa;

public class Aula54PrivateGetSet01 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Jiraya");
		pessoa.setIdade(70);;

		pessoa.imprime();

		System.out.println("---------------------");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}

}
