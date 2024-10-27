package maratona.java.devdojo.Davancado.designpatterns.factory.examples.components.buttons;

import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.Button;

public class MacOSButton implements Button {

	@Override
	public void paint() {
		System.out.println("You have created MacOSButton.");
	}

}
