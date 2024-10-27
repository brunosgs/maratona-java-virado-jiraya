package maratona.java.devdojo.Davancado.designpatterns.factory.examples.factories;

import maratona.java.devdojo.Davancado.designpatterns.factory.examples.components.buttons.WindowsButton;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.components.checkboxes.WindowsCheckbox;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Button;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Checkbox;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.GUIFactory;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
