package maratona.java.devdojo.introducao.operadores;

public class Aula19Atribuicao {

	public static void main(String[] args) {
		// Operadores de atribuição(=, +=, -=, *=, /=, %=)

		double bonus = 1800;

		bonus += 1000; // Significa a mesma coisa se fosse: bonus = bonus + 1000;

		System.out.println(bonus);

		// Operadores unários(++, --)
		int contador = 0;

		contador++; // Executa primeiro o contator depois incrementa
		++contador; // Incrementa primeiro depois executa o contador.

		System.out.println(contador);
	}

}
