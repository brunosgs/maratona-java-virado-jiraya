package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * - Quando não é adicionado o '/' na frente do caminho, ele é um caminho
 * relativo, caso contrario é um caminho absoluto;
 * <p>
 * - Quando a tentativas de resolver path que já sejam absolutos a partir de um
 * path relativo, ele retorna o absoluto;
 */
public class Aula147ResolvendoPaths {

	public static void main(String[] args) {
		Path relativeDir = Paths.get("home/teste");
		Path relativeFilePath = Paths.get("dev/arquivo.txt");
		Path pathResolve = relativeDir.resolve(relativeFilePath);

		System.out.println("Caminho relativo resolvido: " + pathResolve);

		Path absoluteDir = Paths.get("/home/teste");
		Path relativeDir2 = Paths.get("dev");
		Path relativeFile = Paths.get("file.txt");

		// Caminho absoluto
		System.out.println("1: " + absoluteDir.resolve(relativeDir2));
		System.out.println("2: " + absoluteDir.resolve(relativeFile));

		// Caminho relativo
		System.out.println("3: " + relativeDir2.resolve(absoluteDir));
		System.out.println("4: " + relativeDir2.resolve(relativeFile));

		// Caminho relativo de um arquivo
		System.out.println("5: " + relativeFile.resolve(absoluteDir));
		System.out.println("6: " + relativeFile.resolve(relativeDir2));
	}

}
