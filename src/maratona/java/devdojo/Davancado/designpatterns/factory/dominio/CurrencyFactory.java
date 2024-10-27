package maratona.java.devdojo.Davancado.designpatterns.factory.dominio;

import maratona.java.devdojo.Davancado.designpatterns.factory.enums.Country;
import maratona.java.devdojo.Davancado.designpatterns.factory.interfaces.Currency;

public class CurrencyFactory {
	public static Currency newCurrency(Country country) {
		switch (country) {
		case USA:
			return new UsDolar();
		case BRAZIL:
			return new Real();
		default:
			throw new IllegalArgumentException("No currency found for this country");
		}
	}
}
