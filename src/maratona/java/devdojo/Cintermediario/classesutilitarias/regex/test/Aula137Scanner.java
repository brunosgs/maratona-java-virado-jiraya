package maratona.java.devdojo.Cintermediario.classesutilitarias.regex.test;

import java.util.Scanner;

/**
 * - Com a utilização do Scanner foi definido um novo delimitador para ele,
 * sendo que o padrão é o espaço. Depois foi adicionado a string um inteiro,
 * esse que foi localizado ao percorrer a string e verificado se existia um
 * inteiro na mesma;
 */
public class Aula137Scanner {

	public static void main(String[] args) {
		String texto = "Pedro,João,Maria,200";

		try (Scanner scan = new Scanner(texto)) {
			scan.useDelimiter(",");

			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					int nextInt = scan.nextInt();

					System.out.println("Int: " + nextInt);
				} else if (scan.hasNextBoolean()) {
					boolean nextBoolean = scan.nextBoolean();

					System.out.println("Boolean: " + nextBoolean);
				} else {
					System.out.println(scan.next());
				}
			}
		}
	}

}
