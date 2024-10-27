package maratona.java.devdojo.Davancado.designpatterns.factory.test;

import maratona.java.devdojo.Davancado.designpatterns.factory.dominio.CurrencyFactory;
import maratona.java.devdojo.Davancado.designpatterns.factory.enums.Country;
import maratona.java.devdojo.Davancado.designpatterns.factory.interfaces.Currency;

/**
 * - O Abstract Factory é um padrão de projeto criacional que permite que você
 * produza famílias de objetos relacionados sem ter que especificar suas classes
 * concretas.
 * <p>
 * - O Abstract Factory define uma interface para criar todos os produtos
 * distintos, mas deixa a criação real do produto para classes fábrica
 * concretas. Cada tipo de fábrica corresponde a uma determinada variedade de
 * produtos.
 */
public class Aula247Factory {

	public static void main(String[] args) {
		Currency newCurrency = CurrencyFactory.newCurrency(Country.USA);

		System.out.println(newCurrency.getSymbol());
	}

}
