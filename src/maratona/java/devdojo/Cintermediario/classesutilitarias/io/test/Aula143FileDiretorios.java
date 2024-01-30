package maratona.java.devdojo.Cintermediario.classesutilitarias.io.test;

import java.io.File;
import java.io.IOException;

/**
 * - Cria um diretório utilizando a classe 'File': 'mkdir()';
 */
public class Aula143FileDiretorios {

	public static void main(String[] args) {
		File fileDirectory = new File("pasta_diretorio"); // Se a pasta existir ele tem a referência;
		File fileInDirectory = new File(fileDirectory, "teste.txt");

		/**
		 * Para testar isolado só comentar a linha e verificar o método criado para
		 * testes
		 */
		AuxCreated.createdPathOrFile(fileDirectory, fileInDirectory);
		AuxCreated.renamingFile("teste2", "teste4");
		AuxCreated.renamingPath("pasta_diretorio", "teste3");
	}

}

class AuxCreated {
	/**
	 * Método para criar diretorio e arquivo, separado para melhor visualização dos
	 * estudos.
	 *
	 * @param fileDirectory   Diretório do arquivo
	 * @param fileInDirectory Arquivo que vai ser criado
	 */
	public static void createdPathOrFile(File fileDirectory, File fileInDirectory) {
		System.out.println("CRIA PASTA DE DIRETÓRIO E ARQUIVO!");

		boolean mkdir = fileDirectory.mkdir(); // Cria o diretório
		boolean exists = fileInDirectory.exists();
		boolean isCreated = false;

		if (mkdir) {
			try {
				isCreated = fileInDirectory.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			if (exists) {
				try {
					isCreated = fileInDirectory.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Diretório criado?: " + mkdir);
		System.out.println("Arquivo criado?: " + isCreated);
	}

	/**
	 * Método para renomear o nome do arquivo, separado para melhor visualização dos
	 * estudos.
	 *
	 * @param name    Nome atual do arquivo
	 * @param renamed Novo nome que o arquivo deve assumir
	 */
	public static void renamingFile(String name, String renamed) {
		System.out.println("RENOMEIA ARQUIVOS!");

		File fileDirectory = new File("pasta_diretorio"); // Se a pasta existir ele tem a referência;
		File fileInDirectory = new File(fileDirectory, name + ".txt");
		boolean renameTo = false;

		if (fileInDirectory.exists()) {
			File fileRenamed = new File(fileDirectory, renamed + ".txt");
			renameTo = fileInDirectory.renameTo(fileRenamed);
		} else {
			System.out.println("Arquivo com o nome de " + name + " não existe!");
		}

		System.out.println("Arquivo renomeado?: " + renameTo);
	}

	/**
	 * Método para renomear o nome do diretório, separado para melhor visualização
	 * dos estudos.
	 *
	 * @param name    Nome atual do diretório
	 * @param renamed Novo nome que o diretório vai assumir
	 */
	public static void renamingPath(String name, String renamed) {
		System.out.println("RENOMEIA DIRETÓRIOS!");

		File fileDirectory = new File(name); // Se a pasta existir ele tem a referência;
		File fileRenamedDirectory = new File(renamed);
		boolean renameToPath = false;

		if (fileDirectory.exists()) {
			renameToPath = fileDirectory.renameTo(fileRenamedDirectory);
		} else {
			System.out.println("Diretório com o nome de " + name + " não existe!");
		}

		System.out.println("Diretório renomeado?: " + renameToPath);
	}
}
