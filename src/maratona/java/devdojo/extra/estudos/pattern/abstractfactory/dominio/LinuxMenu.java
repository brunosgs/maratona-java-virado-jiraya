package maratona.java.devdojo.extra.estudos.pattern.abstractfactory.dominio;

import maratona.java.devdojo.extra.estudos.pattern.abstractfactory.interfaces.Menu;

public class LinuxMenu implements Menu {

	@Override
	public void paint() {
		System.out.println("Eu sou um WinMenu");
	}

}
