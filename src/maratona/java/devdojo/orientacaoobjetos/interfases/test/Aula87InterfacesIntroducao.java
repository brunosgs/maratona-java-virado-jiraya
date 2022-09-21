package maratona.java.devdojo.orientacaoobjetos.interfases.test;

import maratona.java.devdojo.orientacaoobjetos.interfases.dominio.DatabaseLoader;
import maratona.java.devdojo.orientacaoobjetos.interfases.dominio.FileLoader;

public class Aula87InterfacesIntroducao {

	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();

		databaseLoader.load();
		fileLoader.load();
	}

}
