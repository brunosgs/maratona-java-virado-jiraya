package extra.estudos.pattern.abstractfactory.factory;

import extra.estudos.pattern.abstractfactory.dominio.LinuxMenu;
import extra.estudos.pattern.abstractfactory.interfaces.GUIFactory;
import extra.estudos.pattern.abstractfactory.interfaces.Menu;

public class LinuxFactory implements GUIFactory {

	@Override
	public Menu createMenu() {
		return new LinuxMenu();
	}

}
