package maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.factory;

import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.dominio.LinuxMenu;
import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.interfaces.GUIFactory;
import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.interfaces.Menu;

public class LinuxFactory implements GUIFactory {

	@Override
	public Menu createMenu() {
		return new LinuxMenu();
	}

}
