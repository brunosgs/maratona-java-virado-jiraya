package maratona.java.devdojo.Cintermediario.classesutilitarias.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * - O método read(), ele traz o código ASCII do primeiro caracter encontrado no
 * arquivo. Quando ele chega no final do arquivo ele retorna -1, para que seja
 * possível ler o arquivo é preciso interar sobre ele;
 */
public class Aula140FileReader {

	public static void main(String[] args) {
		File file = new File("file.txt");

		try (FileReader fr = new FileReader(file)) {
			int iAux;

			while ((iAux = fr.read()) != -1) {
				System.out.print((char) iAux);
			}

			/*
			 * - OBS: Quando foi criado o new char[], e passado ao método read() ele
			 * utilizou como buffer. Depois ao fazer o for foi possível ler o arquivo mas
			 * tudo dependendo do tamanho que foi passado ao new char[], isso não se aplica
			 * caso não tenha o tamanho do arquivo exato.
			 *
			 * char[] in = new char[1000];
			 *
			 * fr.read(in);
			 *
			 * for (char c : in) { System.out.print(c); }
			 */
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
