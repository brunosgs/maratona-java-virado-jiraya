package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * - Tudo que tiver view é utilizado para alteração dos atributos;
 */
public class Aula150BasicFileAttributes {

	public static void main(String[] args) {
		Path path = Paths.get("pasta_diretorio/new_file.txt");

		try {
			if (Files.notExists(path)) {
				Files.createFile(path);
			}

			// Atributos do arquivo
			BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

			FileTime creationTime = attributes.creationTime();
			FileTime lastModifiedTime = attributes.lastModifiedTime();
			FileTime lastAccessTime = attributes.lastAccessTime();

			System.out.println("creationTime: " + creationTime);
			System.out.println("lastModifiedTime: " + lastModifiedTime);
			System.out.println("lastAccessTime: " + lastAccessTime);
			System.out.println(" ----------------------------------- ");
			// Reescrever atributos do arquivo
			BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
			FileTime newAccessTime = FileTime.fromMillis(System.currentTimeMillis());

			fileAttributeView.setTimes(lastModifiedTime, newAccessTime, creationTime);

			creationTime = fileAttributeView.readAttributes().creationTime();
			lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
			lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

			System.out.println("creationTime: " + creationTime);
			System.out.println("lastModifiedTime: " + lastModifiedTime);
			System.out.println("lastAccessTime: " + lastAccessTime);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
