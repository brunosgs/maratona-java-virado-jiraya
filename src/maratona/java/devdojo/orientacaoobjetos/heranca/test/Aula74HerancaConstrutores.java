package maratona.java.devdojo.orientacaoobjetos.heranca.test;

import maratona.java.devdojo.orientacaoobjetos.heranca.dominio.Endereco;
import maratona.java.devdojo.orientacaoobjetos.heranca.dominio.Funcionario02;

public class Aula74HerancaConstrutores {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();

		endereco.setRua("Rua 8");
		endereco.setCep("88749-137");

		Funcionario02 funcionario = new Funcionario02("João");

		funcionario.setCpf("379.352.012-00");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);
		funcionario.setRg("365896-6");

		funcionario.imprime();

	}

}
