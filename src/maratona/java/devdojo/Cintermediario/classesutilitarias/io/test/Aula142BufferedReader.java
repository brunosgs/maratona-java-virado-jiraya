package maratona.java.devdojo.Cintermediario.classesutilitarias.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * - O método readLine(), ele lê linha, caso não encontre mais linhas ele
 * retorna null;
 */
public class Aula142BufferedReader {

	public static void main(String[] args) {
		File file = new File("file.txt");

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
