package maratona.java.devdojo.orientacaoobjetos.leituraconsole;

import java.util.Scanner;

public class Aula68DadosPorConsole {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine(); // O nextLine() captura a String inteira

		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();

		System.out.print("Digite M ou F para seu sexo: ");
		char sexo = scan.next().charAt(0);

		System.out.println("-------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);

		scan.close();
	}

}
