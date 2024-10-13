package maratona.java.devdojo.Davancado.concorrencia.dominio;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		int num = ThreadLocalRandom.current()
				.nextInt(1, 11);

		for (int i = 0; i < num; i++) {
			System.out.printf("%s executando uma tarefa callable... %n", Thread.currentThread()
					.getName());
		}

		String format = String.format("%s finished and the random number is %d", Thread.currentThread()
				.getName(), num);

		return format;
	}

}
