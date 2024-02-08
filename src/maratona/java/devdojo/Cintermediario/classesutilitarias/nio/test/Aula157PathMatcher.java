package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * - Exemplo utilizando o 'SimpleFileVisitor' para localizar todos os arquivos
 * dentro do path e com 'PathMatcher' fazer o match conforme foi passado no
 * glob;
 */
public class Aula157PathMatcher {

	public static void main(String[] args) {
		Path root = Paths.get(".");

		try {
			Files.walkFileTree(root, new FindListFiles());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class FindListFiles extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		String glob = "glob:**Date*.{java,class}";

		if (matches(file, glob)) {
			System.out.println(file.getFileName());
		}

		return FileVisitResult.CONTINUE;
	}

	private static boolean matches(Path path, String glob) {
		PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);

		return pathMatcher.matches(path);
	}
}