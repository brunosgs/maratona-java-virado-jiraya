package maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.factory;

import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.dominio.WinMenu;
import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.interfaces.GUIFactory;
import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.interfaces.Menu;

public class WinFactory implements GUIFactory {

	@Override
	public Menu createMenu() {
		return new WinMenu();
	}

}
