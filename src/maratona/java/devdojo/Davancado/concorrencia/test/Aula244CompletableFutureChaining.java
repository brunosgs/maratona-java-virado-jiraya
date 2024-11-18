package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.concorrencia.dominio.Quote;
import maratona.java.devdojo.Davancado.concorrencia.service.StoreWithDiscountService;

/**
 * -
 */
public class Aula244CompletableFutureChaining {

	public static void main(String[] args) {
		StoreWithDiscountService storeWithDiscountService = new StoreWithDiscountService();
		searchPricesWithDiscountSync(storeWithDiscountService);
		searchPricesWithDiscountAsync(storeWithDiscountService);
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

	private static void searchPricesWithDiscountAsync(StoreWithDiscountService storeWithDiscountService) {
		long start = System.currentTimeMillis();

		List<String> stores = List.of("Stores 1", "Stores 2", "Stores 3", "Stores 4");

		List<CompletableFuture<String>> completableFutureStrings = stores.stream()
				// Getting the price async storeName:price:discountCode
				.map(s -> CompletableFuture.supplyAsync(() -> storeWithDiscountService.getPriceSync(s)))
				// Instantiating a new Quote from the string generated by getPriceSync
				.map(cf -> cf.thenApply(Quote::newQuote))
				// Composing the first completable future
				.map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> storeWithDiscountService.applyDiscount(quote))))
				.collect(Collectors.toList());

		completableFutureStrings.stream()
				.map(CompletableFuture::join)
				.forEach(System.out::println);

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceswithDiscount %d seconds %n", ((end - start) / 1000));
	}

}