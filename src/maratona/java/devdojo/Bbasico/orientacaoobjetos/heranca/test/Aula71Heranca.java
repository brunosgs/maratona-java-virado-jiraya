package maratona.java.devdojo.Bbasico.orientacaoobjetos.heranca.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.heranca.dominio.Endereco;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.heranca.dominio.Funcionario;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.heranca.dominio.Pessoa;

/* Quando existe heraça é defindo como 'é um' (Is-A). A herança é
   utilizado quando se precisa extender as funcionalidades de uma classe, tendo um
   relacionamento entre elas. Com a utilização da herança acaba existindo um acoplamento forte
   no código.

   OBS: Evitar de utilizar em todo o código, para que o acoplamento não seja alto.
*/
public class Aula71Heranca {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();

		endereco.setRua("Rua 8");
		endereco.setCep("88749-137");

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Pedrão da massa");
		pessoa.setCpf("000.369.321-14");
		pessoa.setEndereco(endereco);

		System.out.println("--------------");
		pessoa.imprime();

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("João");
		funcionario.setCpf("379.352.012-00");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);

		System.out.println("--------------");
		funcionario.imprime();
	}

}
