package maratona.java.devdojo.Davancado.designpatterns.factory.examples.components.checkboxes;

import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Checkbox;

public class MacOSCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("You have created MacOSCheckbox.");
	}

}