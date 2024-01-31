package maratona.java.devdojo.Cintermediario.classesutilitarias.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * - A classe 'FileWriter', serve para fazer escrita em arquivos, mesmo sendo
 * lowlevel o que ela faz é trabalhar só com a escrita;
 * <p>
 * - Antes de fechar um arquivo, é uma boa prática utilizar o flush(), mesmo que
 * ele seja chamando implicitamente. O que esse método vai fazer é só finalizar
 * o buffer antes do close ser invocado para fechar o arquivo;
 * <p>
 * - Caso queira que o arquivo não seja sobrescrito e sim sempre ir adicionado
 * ao final dele, no construtor do 'FileWriter' deve ser colocar um true para
 * que ele faça o append, exemplo: new FileWriter(file, true);
 */
public class Aula139FileWriter {

	public static void main(String[] args) {
		File file = new File("file.txt");

		try (FileWriter fw = new FileWriter(file, true)) {
			fw.write("Teste de escrita em arquivos 'txt'\n");
			fw.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("Última modificação: " + new Date(file.lastModified()));
	}

}
