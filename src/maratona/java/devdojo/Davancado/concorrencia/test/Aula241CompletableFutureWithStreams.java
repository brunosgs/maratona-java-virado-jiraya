package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import maratona.java.devdojo.Davancado.concorrencia.service.StoreService;

/**
 * - Com o método assícrono, teve que se separar em duas lista de strems, uma
 * para buscar o valor e outra com o join para que não seja feita operação um
 * por vez em sincronismo.
 */
public class Aula241CompletableFutureWithStreams {

	public static void main(String[] args) {
		StoreService storeService = new StoreService();

		searchPricesAsyncCompletableFuture(storeService);
		searchPricesSyncCompletableFuture(storeService);
	}

	private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
		long start = System.currentTimeMillis();

		List<String> stores = List.of("Stores 1", "Stores 2", "Stores 3", "Stores 4");

		List<CompletableFuture<Double>> listCompletableFuture = stores.stream()
				.map(storeService::getPricesAsyncCompletableFuture)
				.collect(Collectors.toList());

		List<Double> listPrices = listCompletableFuture.stream()
				.map(CompletableFuture::join)
				.collect(Collectors.toList());

		System.out.println(listPrices);

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceSync %d seconds %n", ((end - start) / 1000));
	}

	private static void searchPricesSyncCompletableFuture(StoreService storeService) {
		long start = System.currentTimeMillis();

		List<String> stores = List.of("Stores 1", "Stores 2", "Stores 3", "Stores 4");

		List<Double> listPrices = stores.stream()
				.map(storeService::getPricesAsyncCompletableFuture)
				.map(CompletableFuture::join)
				.collect(Collectors.toList());

		System.out.println(listPrices);

		long end = System.currentTimeMillis();

		System.out.printf("%nTime passed to searchPriceSync %d seconds %n", ((end - start) / 1000));
	}

}
