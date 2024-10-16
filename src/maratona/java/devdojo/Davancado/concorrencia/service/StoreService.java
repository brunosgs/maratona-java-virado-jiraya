package maratona.java.devdojo.Davancado.concorrencia.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * - Com o 'CompletableFuture' não é mais necessario utilizar o ExecutorService,
 * o mesmo se utiliza do 'CompletableFuture.supplyAsync()' que tutiliza o
 * 'ForkJoinPool'.
 */
public class StoreService {
	private static final ExecutorService executorService = Executors.newCachedThreadPool();

	public double getPriceSync(String storeName) {
		System.out.printf("Getting prices sync for store %s%n", storeName);

		return priceGenerator();
	}

	public Future<Double> getPricesAsyncFuture(String storeName) {
		System.out.printf("Getting prices sync for store %s%n", storeName);

		return executorService.submit(this::priceGenerator);
	}

	public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
		System.out.printf("Getting prices sync for store %s%n", storeName);

		return CompletableFuture.supplyAsync(this::priceGenerator);
	}

	private double priceGenerator() {
		System.out.printf("%s generating price %n", Thread.currentThread()
				.getName());

		delay();

		return ThreadLocalRandom.current()
				.nextInt(1, 500) * 10;
	}

	private void delay() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void shutdownExecutors() {
		executorService.shutdown();
	}
}
