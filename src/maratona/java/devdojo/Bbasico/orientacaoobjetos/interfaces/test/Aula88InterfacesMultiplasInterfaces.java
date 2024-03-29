package maratona.java.devdojo.Bbasico.orientacaoobjetos.interfaces.test;

import maratona.java.devdojo.Bbasico.orientacaoobjetos.interfaces.dominio.DatabaseLoader;
import maratona.java.devdojo.Bbasico.orientacaoobjetos.interfaces.dominio.FileLoader;

public class Aula88InterfacesMultiplasInterfaces {

	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();

		databaseLoader.load();
		fileLoader.load();

		databaseLoader.remove();
		fileLoader.remove();

		databaseLoader.checkPermission();
		fileLoader.checkPermission();
	}

}
