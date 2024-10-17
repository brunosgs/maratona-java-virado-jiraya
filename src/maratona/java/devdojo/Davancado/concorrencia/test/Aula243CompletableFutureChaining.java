package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.List;

import maratona.java.devdojo.Davancado.concorrencia.dominio.Quote;
import maratona.java.devdojo.Davancado.concorrencia.service.StoreWithDiscountService;

/**
 * -
 */
public class Aula243CompletableFutureChaining {

	public static void main(String[] args) {
		StoreWithDiscountService storeWithDiscountService = new StoreWithDiscountService();
		searchPricesWithDiscountSync(storeWithDiscountService);
	}

	private static void searchPricesWithDiscountSync(StoreWithDiscountService storeWithDiscountService) {
		long start = System.currentTimeMillis();

		List<String> stores = List.of("Stores 1", "Stores 2", "Stores 3", "Stores 4");

		stores.stream()
				.map(storeWithDiscountService::getPriceSync)
				.map(Quote::newQuote)
				.map(storeWithDiscountService::applyDiscount)
				.forEach(System.out::println);

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceswithDiscount %d seconds %n", ((end - start) / 1000));
	}

}
