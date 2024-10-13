package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * - Criando uma requisição com o Future para obter uma resposta;
 * <p>
 * - Cuidar para não criar um bloqueio, sempre colocar timeout para que não
 * deixe a thread ficar bloqueada com erro;
 */

public class Aula239Future {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService newSingleThreadExecutorService = Executors.newSingleThreadExecutor();

		Future<Double> futureRequest = newSingleThreadExecutorService.submit(() -> {
			TimeUnit.SECONDS.sleep(15);

			return 4.35D;
		});

		System.out.println(doSomething());
		Double dollarResponse = futureRequest.get(3, TimeUnit.SECONDS);

		System.out.println("Dollar: " + dollarResponse);

		newSingleThreadExecutorService.shutdown();
	}

	private static long doSomething() {
		System.out.println(Thread.currentThread()
				.getName());

		long sum = 0;

		for (int i = 0; i < 1_000_000; i++) {
			sum += i;
		}

		return sum;
	}

}
