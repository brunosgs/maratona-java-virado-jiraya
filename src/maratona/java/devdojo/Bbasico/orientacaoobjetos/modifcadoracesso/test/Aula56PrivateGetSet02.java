package maratona.java.devdojo.Bbasico.orientacaoobjetos.modifcadoracesso.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.modifcadoracesso.dominio.Funcionario;

public class Aula56PrivateGetSet02 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		funcionario.setNome("João");
		funcionario.setIdade(30);
		funcionario.setSalarios(new double[] { 1200, 1600, 2772.69 });

		funcionario.imprime();
	}

}
