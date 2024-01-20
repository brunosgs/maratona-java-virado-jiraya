package maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.metodos.dominio.Funcionario;

/*
  Crie uma classe Funcionário com os seguintes atributos
	nome
	idade
	salario - três salários devem ser guardados

  Crie dois métodos
   -> Para imprimir os dados
   -> Para tirar a média dos salários e imprimir o resultado
*/
public class Aula53MetodosExercicio {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		funcionario.nome = "João";
		funcionario.idade = 30;
		funcionario.salarios = new double[] { 1200, 1600, 2772.69 };

		funcionario.imprime();
	}

}
