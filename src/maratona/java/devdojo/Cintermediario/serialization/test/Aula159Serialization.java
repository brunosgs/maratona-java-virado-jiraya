package maratona.java.devdojo.Cintermediario.serialization.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import maratona.java.devdojo.Cintermediario.serialization.dominio.Aluno;

/**
 * - Muitos frameworks utilizam esse conceito;
 * <p>
 * - Quando se esta utilizando a serialização, esta transformando o objeto em um
 * array de bytes;
 */
public class Aula159Serialization {

	public static void main(String[] args) {
		// Aluno aluno = new Aluno(100L, "Teste nome", "!$#%$#VGgfdsf");

		// serializar(aluno);
		deserializar();
	}

	private static void serializar(Aluno aluno) {
		Path fileSerialization = Paths.get("pasta_diretorio/aluno.ser");

		try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(fileSerialization))) {
			oos.writeObject(aluno);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static void deserializar() {
		Path fileSerialization = Paths.get("pasta_diretorio/aluno.ser");

		try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(fileSerialization))) {

			Aluno aluno = (Aluno) ois.readObject();

			System.out.println(aluno);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
