package maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.test;

import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.factory.LinuxFactory;
import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.factory.WinFactory;
import maratona.java.devdojo.Gextra.estudos.pattern.abstractfactory.service.Aplicacao;

public class Principal {

	public static void main(String[] args) {
		int tipoDeMenu = 0;

		if (tipoDeMenu == 0) {
			new Aplicacao(new WinFactory());
		} else {
			new Aplicacao(new LinuxFactory());
		}
	}

}
