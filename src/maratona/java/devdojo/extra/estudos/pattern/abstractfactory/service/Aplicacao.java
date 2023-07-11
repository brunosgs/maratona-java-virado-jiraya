package maratona.java.devdojo.extra.estudos.pattern.abstractfactory.service;

import maratona.java.devdojo.extra.estudos.pattern.abstractfactory.interfaces.GUIFactory;
import maratona.java.devdojo.extra.estudos.pattern.abstractfactory.interfaces.Menu;

public class Aplicacao {
	public Aplicacao(GUIFactory factory) {
		Menu menu = factory.createMenu();

		menu.paint();
	}
}
