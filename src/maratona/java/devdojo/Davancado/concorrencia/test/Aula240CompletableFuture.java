package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import maratona.java.devdojo.Davancado.concorrencia.service.StoreService;

/**
 * - Com o 'CompletableFuture' não é necessário fazer o shuntdown();
 */
public class Aula240CompletableFuture {

	public static void main(String[] args) {
		StoreService storeService = new StoreService();

		searchPriceSync(storeService);
		searchPricesAsyncFuture(storeService);
		searchPricesAsyncCompletableFuture(storeService);
	}

	// Método síncrono
	private static void searchPriceSync(StoreService storeService) {
		long start = System.currentTimeMillis();

		System.out.println(storeService.getPriceSync("Store 1 - Sync"));
		System.out.println(storeService.getPriceSync("Store 2 - Sync"));
		System.out.println(storeService.getPriceSync("Store 3 - Sync"));
		System.out.println(storeService.getPriceSync("Store 4 - Sync"));

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceSync %d seconds %n", ((end - start) / 1000));
	}

	// Método assíncrono Future
	private static void searchPricesAsyncFuture(StoreService storeService) {
		long start = System.currentTimeMillis();

		Future<Double> pricesAsyncFuture = storeService.getPricesAsyncFuture("Store 1 - Async Future");
		Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Store 2 - Async Future");
		Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Store 3 - Async Future");
		Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("Store 4 - Async Future");

		try {
			System.out.println(pricesAsyncFuture.get());
			System.out.println(pricesAsyncFuture2.get());
			System.out.println(pricesAsyncFuture3.get());
			System.out.println(pricesAsyncFuture4.get());

			StoreService.shutdownExecutors();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceSync %d seconds %n", ((end - start) / 1000));
	}

	// Método assíncrono CompletableFuture
	private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
		long start = System.currentTimeMillis();

		CompletableFuture<Double> pricesAsyncCompletableFuture = storeService
				.getPricesAsyncCompletableFuture("Store 1 - Async CompletableFuture");
		CompletableFuture<Double> pricesAsyncCompletableFuture2 = storeService
				.getPricesAsyncCompletableFuture("Store 2 - Async CompletableFuture");
		CompletableFuture<Double> pricesAsyncCompletableFuture3 = storeService
				.getPricesAsyncCompletableFuture("Store 3 - Async CompletableFuture");
		CompletableFuture<Double> pricesAsyncCompletableFuture4 = storeService
				.getPricesAsyncCompletableFuture("Store 4 - Async CompletableFuture");

		System.out.println(pricesAsyncCompletableFuture.join());
		System.out.println(pricesAsyncCompletableFuture2.join());
		System.out.println(pricesAsyncCompletableFuture3.join());
		System.out.println(pricesAsyncCompletableFuture4.join());

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceSync %d seconds %n", ((end - start) / 1000));
	}
}
