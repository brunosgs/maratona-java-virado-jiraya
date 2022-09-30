package extra.estudos.pattern.abstractfactory.factory;

import extra.estudos.pattern.abstractfactory.dominio.WinMenu;
import extra.estudos.pattern.abstractfactory.interfaces.GUIFactory;
import extra.estudos.pattern.abstractfactory.interfaces.Menu;

public class WinFactory implements GUIFactory {

	@Override
	public Menu createMenu() {
		return new WinMenu();
	}

}
