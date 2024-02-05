package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * - O 'DirectoryStream' se utiliza de 'Generics', significa que em tempo de
 * execução o java vai definir qual o tipo da classe que ele vai criar;
 */
public class Aula153DirectoryStream {

	public static void main(String[] args) {
		Path directory = Paths.get("."); // Utilizando o ponto ele referência o diretório atual;

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
