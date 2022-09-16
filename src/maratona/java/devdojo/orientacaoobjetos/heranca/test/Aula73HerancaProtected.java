package maratona.java.devdojo.orientacaoobjetos.heranca.test;

import maratona.java.devdojo.orientacaoobjetos.heranca.dominio.Endereco;
import maratona.java.devdojo.orientacaoobjetos.heranca.dominio.Funcionario;

public class Aula73HerancaProtected {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();

		endereco.setRua("Rua 8");
		endereco.setCep("88749-137");

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("João");
		funcionario.setCpf("379.352.012-00");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);
		funcionario.setRg("325698-8");

		funcionario.relatorioPagamento();
	}

}
