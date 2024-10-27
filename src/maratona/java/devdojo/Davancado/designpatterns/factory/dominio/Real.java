package maratona.java.devdojo.Davancado.designpatterns.factory.dominio;

import maratona.java.devdojo.Davancado.designpatterns.factory.interfaces.Currency;

public class Real implements Currency {

	@Override
	public String getSymbol() {
		return "R$";
	}

}
