package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * - Diferente do método 'createDirectory' o 'createDirectories' não lança
 * exceções caso já exista os diretórios. Da mesma forma o 'createFile', não
 * lança a exceção caso já estiva o arquivo;
 */
public class Aula145Files {

	public static void main(String[] args) {
		System.out.println("CRIA PASTAS");
		Path path = Paths.get("nio_pasta_files");
		Path subPath = Paths.get("nio_sub_pastas_files/sub_path/sub_path_2");

		try {
			if (Files.notExists(path)) {
				Files.createDirectory(path);
			}

			Files.createDirectories(subPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("CRIA ARQUIVOS");
		Path subPath2 = Paths.get("nio_sub_pastas_files/sub_path/sub_path_3");
		Path filePath = Paths.get(subPath2.toString(), "files.txt");

		try {
			Files.createDirectories(subPath2);

			if (Files.notExists(filePath)) {
				Files.createFile(filePath);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("COPIADO ARQUIVOS");
		Path subPath3 = Paths.get("nio_sub_pastas_files/sub_path/sub_path_4");
		Path filePath1 = Paths.get(subPath3.toString(), "files.txt");
		Path source = filePath1;
		Path target = Paths.get(filePath1.getParent().toString(), "file_renamed.txt");

		try {
			Files.createDirectories(subPath3);

			if (Files.notExists(filePath1)) {
				Files.createFile(filePath1);
			}

			/*
			 * Adicionando a opção de REPLACE_EXISTING, ele faz o replace ao criar a cópia
			 * do conteúdo do arquivo.
			 */
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
