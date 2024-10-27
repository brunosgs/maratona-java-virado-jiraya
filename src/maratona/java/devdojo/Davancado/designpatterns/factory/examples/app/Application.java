package maratona.java.devdojo.Davancado.designpatterns.factory.examples.app;

import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Button;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Checkbox;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.GUIFactory;

/**
 * O Application só sabe qual o tipo de objeto sera criado quando ele receber um
 * argumento via construtor de qual factory ele vai construir seus objetos;
 *
 **/
public class Application {
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
