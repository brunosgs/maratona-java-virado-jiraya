package maratona.java.devdojo.Davancado.concorrencia.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import maratona.java.devdojo.Davancado.concorrencia.dominio.Discount;
import maratona.java.devdojo.Davancado.concorrencia.dominio.Discount.Code;
import maratona.java.devdojo.Davancado.concorrencia.dominio.Quote;

public class StoreWithDiscountService {

	/**
	 * Método que gera o preço, gera randomicamente o código do disconto e retorna
	 * no padrão (storeName:price:discountCode) um string
	 *
	 * @param storeName
	 * @return
	 */
	public String getPriceSync(String storeName) {
		double price = priceGenerator();
		Code discountCode = Discount.Code.values()[ThreadLocalRandom.current()
				.nextInt(Discount.Code.values().length)];

		return String.format("%s:%.2f:%s", storeName, price, discountCode);
	}

	private double priceGenerator() {
		delay();

		return ThreadLocalRandom.current()
				.nextInt(1, 500) * 10;
	}

	/**
	 * Aplica o desconto ao uma Quote e depois retorna a string formatada.
	 *
	 * @param quote
	 * @return
	 */
	public String applyDiscount(Quote quote) {
		delay();

		double discountValue = quote.getPrice() * (100 - quote.getDicountCode()
				.getPercentage()) / 100;

		return String.format("'%s' original price: '%.2f'. Apllying discount code '%s'. Final price: '%.2f'", quote.getStore(),
				quote.getPrice(), quote.getDicountCode(), discountValue);
	}

	private void delay() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
