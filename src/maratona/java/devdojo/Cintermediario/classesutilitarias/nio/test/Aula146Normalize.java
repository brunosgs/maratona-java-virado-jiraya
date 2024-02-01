package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * - A definição precisa desse método 'normalize()' depende da implementação e
 * deriva um caminho que não contém elementos de nome redundantes. Em muitos
 * sistemas de arquivos, o “.” e “..” são nomes especiais que indicam o
 * diretório atual e o diretório pai. Nesses casos, todas as ocorrências de “.”
 * são considerados redundantes e se um “..” for precedido por um nome diferente
 * de “..”, ambos os nomes são considerados redundantes.
 */
public class Aula146Normalize {

	public static void main(String[] args) {
		String dir = "home/teste/dev";
		String dir2 = "/home/./teste/./dev/";
		String arquivoTxt = "../../arquivo.txt";

		Path path = Paths.get(dir, arquivoTxt);
		Path path2 = Paths.get(dir2);

		System.out.println("Diretório 1 não normalizado: " + path);
		System.out.println("Diretório 2 não normalizado: " + path2);

		System.out.println("Diretório Normalizado: " + path.normalize());
		System.out.println("Diretório Normalizado: " + path2.normalize());
	}

}
