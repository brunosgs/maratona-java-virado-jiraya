package maratona.java.devdojo.Cintermediario.classesutilitarias.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * - O BufferedWriter contem um método que faz quebra de linhas no arquivo.
 * Dependendo do sistema operacional o \n não é uma boa escolha;
 */
public class Aula141BufferedWriter {

	public static void main(String[] args) {
		File file = new File("file.txt");

		try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Inserindo dados no arquivo pelo BufferedWriter");
			bw.newLine(); // Pula linha baseado no S.O
			bw.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
