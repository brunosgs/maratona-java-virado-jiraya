package maratona.java.devdojo.Cintermediario.classesutilitarias.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * - Para criar um arquivo em um lugar específico, quando se instancia o 'File'
 * se passa o caminho absoluto;
 * <p>
 * - Para que a classe 'File' crie o arquivo, é so utilizar o 'createNewFile()',
 * caso o arquivo já tenha criado ele não cria novamente;
 * <p>
 * - Para deletar o arquivo criado, utiliza o método 'delete()', tem o mesmo
 * padrão quando cria, se não acha não deleta nada;
 * <p>
 * - Para verificar se o arquivo existe, utiliza o 'exists()';
 */
public class Aula138File {

	public static void main(String[] args) {
		File file = new File("file.txt");

		try {
			boolean isNewFile = file.createNewFile();
			boolean exists = file.exists();

			System.out.println("CREATE FILE: " + isNewFile);
			System.out.println("PATH: " + file.getPath());
			System.out.println("ABSOLUTE PATH: " + file.getAbsolutePath());
			System.out.println("IS DIRECTORY: " + file.isDirectory());
			System.out.println("IS FILE: " + file.isFile());
			System.out.println("IS HIDDEN: " + file.isHidden());

			LocalDateTime lastModified = LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()),
					ZoneId.systemDefault());

			ZonedDateTime lastModified2 = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault());

			Date lastModified3 = new Date(file.lastModified());

			System.out.println("LAST MODIFIED (LocalDateTime): " + lastModified);
			System.out.println("LAST MODIFIED (ZonedDateTime): " + lastModified2);
			System.out.println("LAST MODIFIED (Date): " + lastModified3);

			if (exists) {
				boolean isDelete = file.delete();

				System.out.println("DELETE: " + isDelete);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
