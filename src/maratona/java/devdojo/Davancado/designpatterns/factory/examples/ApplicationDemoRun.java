package maratona.java.devdojo.Davancado.designpatterns.factory.examples;

import maratona.java.devdojo.Davancado.designpatterns.factory.examples.app.Application;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.factories.MacOSFactory;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.factories.WindowsFactory;
import maratona.java.devdojo.Davancado.designpatterns.factory.examples.interfaces.GUIFactory;

public class ApplicationDemoRun {

	public static void main(String[] args) {
		Application app = configureApplication();

		app.paint();
	}

	private static Application configureApplication() {
		Application app;
		GUIFactory factory;

		String OSName = System.getProperty("os.name")
				.toLowerCase();

		factory = OSName.contains("mac") ? new MacOSFactory() : new WindowsFactory();

		app = new Application(factory);

		return app;
	}

}
