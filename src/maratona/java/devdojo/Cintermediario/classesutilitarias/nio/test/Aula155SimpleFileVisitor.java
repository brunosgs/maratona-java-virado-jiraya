package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * - O método sobrescrito 'preVisitDirectory' acessa as pastas previamente e
 * imprime os nomes das pastas e arquivos, mas ele não tem um comportamento
 * garantido, pode ser que imprima antes o nome do arquivos que são executados
 * no método sobrescrito 'visitFile';
 * <p>
 * - Se o método 'preVisitDirectory' estiver com o retorno de 'SKIP_SUBTREE' o
 * método não vai visitar as outras subpastas dentro da pasta, pulando as
 * subpastas;
 * <p>
 * - Se o método 'visitFile' estiver com o retorno de 'SKIP_SIBLINGS' ele le o
 * primeiro arquivo e ignora o restante dentro das pastas e subpastas;
 * <p>
 * - O método 'postVisitDirectory' tem o mesmo sentido do 'preVisitDirectory',
 * quando sai da pasta ele faz alguma ação na pasta, no exemplo ele imprime o
 * nome. Caso os retornos do método é 'SKIP_SUBTREE' ou 'SKIP_SIBLINGS' não
 * terão efeito nele. Caso não haja visita em todos os diretórios ele não faz a
 * execução;
 */
public class Aula155SimpleFileVisitor {

	public static void main(String[] args) {
		Path root = Paths.get("pasta_diretorio");

		try {
			Files.walkFileTree(root, new listAllFiles());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class listAllFiles extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println(file.getFileName());

		return FileVisitResult.SKIP_SIBLINGS;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("Pre Visit: " + dir.getFileName());

		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// Quando houver falha ao ler um arquivo
		return super.visitFileFailed(file, exc);
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Post Visit: " + dir.getFileName());

		return FileVisitResult.CONTINUE;
	}

}
