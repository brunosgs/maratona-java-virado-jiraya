package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * - Na versão 1.7 do Java, foi adicionado uma forma de trabalhar com os
 * diretórios e arquivos que seria a substituta da classe 'File' que são as
 * classes: Path, Paths e Files;
 * <p>
 * - Para criar um 'Path' se utiliza o 'Paths', e os métodos que existiam na
 * classe 'File', foram movidos para classe 'Files';
 * <p>
 * - Com o método get(), da classe 'Paths', é possóvel passar um varargs;
 */
public class Aula144PathPaths {

	public static void main(String[] args) {
		Path path = Paths
				.get("C:\\Users\\bruno\\Documents\\CURSOS\\workspace\\ws-devdojo-jiraya\\MaratonaJavaJiraya\\file.txt");

		Path path1 = Paths.get("C:\\Users\\bruno\\Documents\\CURSOS\\workspace\\ws-devdojo-jiraya\\MaratonaJavaJiraya",
				"file.txt");

		Path path2 = Paths.get("C", "Users\\bruno\\Documents\\CURSOS\\workspace\\ws-devdojo-jiraya\\MaratonaJavaJiraya",
				"file.txt");

		Path path3 = Paths.get("C", "Users", "bruno", "Documents", "CURSOS", "workspace", "ws-devdojo-jiraya",
				"MaratonaJavaJiraya", "file.txt");

		System.out.println(path.getFileName());
		System.out.println(path1.getFileName());
		System.out.println(path2.getFileName());
		System.out.println(path3.getFileName());
	}

}
