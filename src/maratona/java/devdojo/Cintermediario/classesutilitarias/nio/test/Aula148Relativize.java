package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * - Pode haver problemas relacionados a questões de paths relativos e absolutos
 * causando exceptions;
 */
public class Aula148Relativize {

	public static void main(String[] args) {
		Path diretoryPath = Paths.get("/home/teste");
		Path clazzPath = Paths.get("/home/teste/devdojo/OlaMundo.java");
		Path relativizePathToClazz = diretoryPath.relativize(clazzPath);

		System.out.println("relativize: " + relativizePathToClazz);

		Path absolutePath1 = Paths.get("/home/teste");
		Path absolutePath2 = Paths.get("/user/local");
		Path absolutePath3 = Paths.get("/home/teste/devdojo/OlaMundo.java");
		Path relativePath1 = Paths.get("temp");
		Path relativePath2 = Paths.get("temp/temp.234342");

		System.out.println("1 - " + absolutePath1.relativize(absolutePath3));
		System.out.println("2 - " + absolutePath3.relativize(absolutePath1));
		System.out.println("3 - " + absolutePath1.relativize(absolutePath2));
		System.out.println("4 - " + relativePath1.relativize(relativePath2));
		System.out.println("5 - " + relativePath2.relativize(relativePath1));
		System.out.println("6 - " + absolutePath1.relativize(relativePath1));
	}

}
