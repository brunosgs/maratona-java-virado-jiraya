package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.concorrencia.service.StoreDeprecatedService;

/**
 * - Com o CompletableFuture.supplyAsync() é possível coloca uma camada para
 * executar métodos síncronos de forma assícrona.
 */
public class Aula242CompletableFuture {

	public static void main(String[] args) {
		StoreDeprecatedService storeDeprecatedService = new StoreDeprecatedService();

		searchPricesAsyncCompletableFuture(storeDeprecatedService);
	}

	private static void searchPricesAsyncCompletableFuture(StoreDeprecatedService storeDeprecatedService) {
		long start = System.currentTimeMillis();

		// Define como as thread tem que ser criadas
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10, r -> {
			Thread thread = new Thread(r);

			thread.setDaemon(true);

			return thread;
		});

		List<String> stores = List.of("Stores 1", "Stores 2", "Stores 3", "Stores 4");

		List<CompletableFuture<Double>> listCompletableFuture = stores.stream()
				.map(s -> CompletableFuture.supplyAsync(() -> storeDeprecatedService.getPriceSync(s), newFixedThreadPool))
				.collect(Collectors.toList());

		List<Double> listPrices = listCompletableFuture.stream()
				.map(CompletableFuture::join)
				.collect(Collectors.toList());

		System.out.println(listPrices);

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceSync %d seconds %n", ((end - start) / 1000));

		newFixedThreadPool.shutdown();
	}

}
