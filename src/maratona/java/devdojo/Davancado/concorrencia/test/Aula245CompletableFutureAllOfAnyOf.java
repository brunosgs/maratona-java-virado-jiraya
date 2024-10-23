package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import maratona.java.devdojo.Davancado.concorrencia.dominio.Quote;
import maratona.java.devdojo.Davancado.concorrencia.service.StoreWithDiscountService;

/**
 * - 'CompletableFuture.allOf()' retorna um novo 'CompletableFuture' quando
 * todos os CompletableFutures estiverem concluídos. Se obtiver exceção em
 * alguns dos Completable, retornara uma exceção;
 * <p>
 * - 'CompletableFuture.anyOf()' retorna um novo CompletableFuture que é
 * concluído quando qualquer um dos CompletableFutures fornecidos é concluído,
 * com o mesmo resultado.
 */
public class Aula245CompletableFutureAllOfAnyOf {

	public static void main(String[] args) {
		StoreWithDiscountService storeWithDiscountService = new StoreWithDiscountService();

		searchPricesWithDiscountAsync(storeWithDiscountService);
	}

	private static void searchPricesWithDiscountAsync(StoreWithDiscountService storeWithDiscountService) {
		long start = System.currentTimeMillis();

		List<String> stores = List.of("Stores 1", "Stores 2", "Stores 3", "Stores 4");

		var completableFutures = stores.stream()
				.map(s -> CompletableFuture.supplyAsync(() -> storeWithDiscountService.getPriceSync(s)))
				.map(cf -> cf.thenApply(Quote::newQuote))
				.map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> storeWithDiscountService.applyDiscount(quote))))
				.map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d seconds%n", store,
						((System.currentTimeMillis() - start) / 1000))))
				.toArray(CompletableFuture[]::new);

//		CompletableFuture<Void> returnOf = CompletableFuture.allOf(completableFutures);
		CompletableFuture<Object> returnOf = CompletableFuture.anyOf(completableFutures);

		returnOf.join();
		System.out.printf("Finished? %b%n", returnOf.isDone());

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceswithDiscount %d seconds %n", ((end - start) / 1000));
	}

}
