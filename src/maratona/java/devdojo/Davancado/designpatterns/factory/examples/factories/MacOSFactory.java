package maratona.java.devdojo.Davancado.designpatterns.factory.examples.factories;

import maratona.java.devdojo.Davancado.designpatterns.factory.examples.components.buttons.MacOSButton;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.components.checkboxes.MacOSCheckbox;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Button;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Checkbox;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.GUIFactory;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
