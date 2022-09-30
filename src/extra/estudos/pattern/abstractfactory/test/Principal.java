package extra.estudos.pattern.abstractfactory.test;

import extra.estudos.pattern.abstractfactory.factory.LinuxFactory;
import extra.estudos.pattern.abstractfactory.factory.WinFactory;
import extra.estudos.pattern.abstractfactory.service.Aplicacao;

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
