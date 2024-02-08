package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * - O objetivo da classe 'PathMatcher' é facilitar a busca por arquivos e
 * diretórios;
 * <p>
 */
public class Aula156PathMatcher {

	public static void main(String[] args) {
		Path path = Paths.get("pasta_diretorio/sub_pasta/file.bkp");
		Path path2 = Paths.get("pasta_diretorio/sub_pasta/file.txt");
		Path path3 = Paths.get("pasta_diretorio/sub_pasta/file.java");

		matches(path, "glob:*.bkp");
		matches(path, "glob:**.bkp"); // Leva em consideração os diretórios
		matches(path, "glob:**/*.bkp");
		matches(path, "glob:**.{bkp,java,txt}"); // Remover os espaços dentro do {}
		matches(path, "glob:**.???"); // '?' é a quantidade de letras
		matches(path3, "glob:**.???");
	}

	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);

		System.out.println(glob + ": " + matcher.matches(path));
	}

}
