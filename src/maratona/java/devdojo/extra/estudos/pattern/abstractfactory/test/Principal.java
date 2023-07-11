package maratona.java.devdojo.extra.estudos.pattern.abstractfactory.test;

import maratona.java.devdojo.extra.estudos.pattern.abstractfactory.factory.LinuxFactory;
import maratona.java.devdojo.extra.estudos.pattern.abstractfactory.factory.WinFactory;
import maratona.java.devdojo.extra.estudos.pattern.abstractfactory.service.Aplicacao;

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
