package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * -
 */
public class Aula154SimpleFileVisitor {

	public static void main(String[] args) {
		Path root = Paths.get(".");

		try {
			System.out.println("Busca com Regex");
			Files.walkFileTree(root, new ListAllFilesRegex());

			System.out.println(" ---------------------------------------------- ");
			System.out.println("Busca .java");
			Files.walkFileTree(root, new ListAllFilesRegex());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class ListAllFilesRegex extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		String regex = "\\w+\\.java";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(file.getFileName().toString());

		while (matcher.find()) {
			System.out.print(matcher.group() + "\n");
		}

		return FileVisitResult.CONTINUE;
	}
}

class ListAllFiles extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (file.getFileName().toString().endsWith(".java")) {
			System.out.println(file.getFileName());
		}

		return FileVisitResult.CONTINUE;
	}
}
