package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * - A partir da interface BasicFileAttibutes é possível modificar atributos de
 * arquivos;
 */
public class Aula149BasicFileAttributes {

	public static void main(String[] args) {
		// ALTERA ATRIBUTOS DO ARQUIVO COM FILE
		File file = new File("pasta_diretorio/teste_alt_atributo.txt");
		LocalDateTime date = LocalDateTime.now().minusDays(10);

		try {
			file.createNewFile();
			file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ALTERA ATRIBUTOS DO ARQUIVO COM PATH E FILES
		Path path = Paths.get("pasta_diretorio/teste_alt_atributo2.txt");
		FileTime fileTimeFrom = FileTime.from(date.toInstant(ZoneOffset.UTC));

		try {
			if (Files.notExists(path)) {
				Files.createFile(path);
				Files.setLastModifiedTime(path, fileTimeFrom);
			}

			boolean writable = Files.isWritable(path);
			boolean readable = Files.isReadable(path);
			boolean executable = Files.isExecutable(path);

			System.out.println("Writable? (" + path + "): " + writable);
			System.out.println("Readable? (" + path + "): " + readable);
			System.out.println("Executable? (" + path + "): " + executable);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
