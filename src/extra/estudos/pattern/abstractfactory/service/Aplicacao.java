package extra.estudos.pattern.abstractfactory.service;

import extra.estudos.pattern.abstractfactory.interfaces.GUIFactory;
import extra.estudos.pattern.abstractfactory.interfaces.Menu;

public class Aplicacao {
	public Aplicacao(GUIFactory factory) {
		Menu menu = factory.createMenu();

		menu.paint();
	}
}
