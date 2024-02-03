package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class Aula151DosFileAttribute {

	public static void main(String[] args) {
		Path path = Paths.get("pasta_diretorio/teste_dos_attribute.txt");

		try {
			System.out.println("DosFileAttributes: ");
			// Alterar se é leitura ou escrita e se é oculto;
			if (Files.notExists(path)) {
				Files.createFile(path);
			}

			Files.setAttribute(path, "dos:hidden", true);
			Files.setAttribute(path, "dos:readonly", true);

			DosFileAttributes dosAttributes = Files.readAttributes(path, DosFileAttributes.class);

			System.out.println("Is Hidden?: " + dosAttributes.isHidden());
			System.out.println("Is Read-Only?: " + dosAttributes.isReadOnly());

			// Alterar se é leitura ou escrita e se é oculto com o View;
			System.out.println("\nDosFileAttributeView: ");
			DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

			dosFileAttributeView.setHidden(false);
			dosFileAttributeView.setReadOnly(false);

			System.out.println("Is Hidden?: " + dosFileAttributeView.readAttributes().isHidden());
			System.out.println("Is Read-Only?: " + dosFileAttributeView.readAttributes().isReadOnly());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
