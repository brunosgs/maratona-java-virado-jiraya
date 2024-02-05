package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

/**
 * - Para esse exemplo, caso utilizado em um ambiente windows o mesmo dispara
 * uma exception: java.lang.UnsupportedOperationException, só sendo utilizado em
 * ambientes linux;
 * <p>
 * - Ao alterar as permissões é preciso passar uma collection de 'Set' para
 * alterar as permissões do arquivo ou diretório;
 */
public class Aula152PosixFileAttributes {

	public static void main(String[] args) {
		Path path = Paths.get("/home/teste/dev/file_posix.txt");

		try {
			PosixFileAttributes posixAttributes = Files.readAttributes(path, PosixFileAttributes.class);

			System.out.println(posixAttributes);

			PosixFileAttributeView posixAttributesView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
			Set<PosixFilePermission> posixFilePermission = PosixFilePermissions.fromString("rw-rw-rw");

			posixAttributesView.setPermissions(posixFilePermission);

			System.out.println(posixAttributesView.readAttributes().permissions());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
