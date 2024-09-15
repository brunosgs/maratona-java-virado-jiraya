package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * - A ArrayBlockingQueue espera um bound, um limite. Caso insira um valor para
 * ela a thread fica bloqueada.
 * <p>
 * - take(), remove o primeiro elemento da fila ou espera até outro elemento ser
 * adicionado.
 */
public class Aula234ArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);

		bq.put("Bruno");

		System.out.printf("%s added the value %s%n", Thread.currentThread()
				.getName(), bq.peek());

		System.out.println("Trying to add another value");
		new Thread(new RemoveFromQueue(bq)).start();

		bq.put("Suane");

		System.out.printf("%s added the value %s%n", Thread.currentThread()
				.getName(), bq.peek());
	}

	static class RemoveFromQueue implements Runnable {
		private final BlockingQueue<String> bq;

		public RemoveFromQueue(BlockingQueue<String> bq) {
			this.bq = bq;
		}

		@Override
		public void run() {
			System.out.printf("%s going to sleep for 5s %n", Thread.currentThread()
					.getName());

			try {
				TimeUnit.SECONDS.sleep(5);
				System.out.printf("%s remove value from queue %s%n", Thread.currentThread()
						.getName(), bq.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
