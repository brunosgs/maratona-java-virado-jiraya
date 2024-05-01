package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Para que uma transação seja atômica, ela deve fazer do início ao fim sem
 * interrupções;
 * <p>
 * - O 'AtomicInteger' garante que seja atômica uma operação feita em um integer
 * baseado em seus métodos, isso quando se esta em um ambiente de concorrência,
 * onde duas threads acessam a mesma variável;
 * <p>
 * - Pode se usar o synchronized para fazer com que a concorrência seja evitada,
 * mas com a utilização vem a queda de desempenho, pois estou permitindo que uma
 * thread faça todo seu processo antes que outra continue.
 */

public class Aula229AtomicInteger {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Runnable r = () -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		};

		Thread thread = new Thread(r);
		Thread thread2 = new Thread(r);

		thread.start();
		thread2.start();
		thread.join();
		thread2.join();

		System.out.println(counter.getCount());
		System.out.println(counter.getAtomicInteger());
	}

}

class Counter {
	private int count;
	private AtomicInteger atomicInteger = new AtomicInteger();

	void increment() {
		count++;
		atomicInteger.incrementAndGet();
	}

	public int getCount() {
		return count;
	}

	public AtomicInteger getAtomicInteger() {
		return atomicInteger;
	}

}