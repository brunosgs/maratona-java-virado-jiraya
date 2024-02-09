package maratona.java.devdojo.Cintermediario.classesutilitarias.nio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * - A classe 'ZipOutputStream' é uma classe que implementa 'Closeable', então
 * por isso ela deve ser fechada ao final da sua execução, por isso ela é
 * colocada dentro de um try_cath_resources;
 * <p>
 * - Para zipar um ou mais arquivos, primeiro precisa preparar o arquivo zip a
 * ser criado com o 'ZipOutputStream' criando um 'OutputStream'. Depois e para
 * inserir os arquivos é usado o 'ZipEntry" passando o nome do arquivo no
 * construtor que vai dentro do arquivo zip, onde basicamente esta construindo o
 * esqueleto do arquivo zip. Utilizando o método 'putNextEntry' é inserido a
 * entrada do nome arquivo dentro do zip. Depois para inserir o conteúdo dos
 * arquivos é utilizando o 'Files.copy()';
 */
public class Aula158ZipOutputStream {

	public static void main(String[] args) {
		Path pathFileZip = Paths.get("pasta_diretorio/arquivo.zip");
		Path pathOfFilesToZip = Paths.get("pasta_diretorio/sub_pasta1/sub_sub_pasta1");

		zip(pathFileZip, pathOfFilesToZip);
	}

	private static void zip(Path fileZip, Path filesToZip) {
		try (ZipOutputStream zipOutput = new ZipOutputStream(Files.newOutputStream(fileZip));
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)) {
			for (Path fileStream : directoryStream) {
				ZipEntry zipEntryFileName = new ZipEntry(fileStream.getFileName().toString());

				zipOutput.putNextEntry(zipEntryFileName);
				Files.copy(fileStream, zipOutput);
				zipOutput.closeEntry();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
