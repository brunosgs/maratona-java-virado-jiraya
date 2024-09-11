package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ExampleReadWriteLock {
	private static int i = -1;
	private static ReadWriteLock lock = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		Runnable r1 = () -> {
			lock.writeLock()
					.lock();

			String nameThread = Thread.currentThread()
					.getName();

			System.out.println(nameThread + " escrevendo: " + i);
			i++;
			System.out.println(nameThread + " escrito: " + i);

			lock.writeLock()
					.unlock();
		};

		Runnable r2 = () -> {
			lock.readLock().lock();
			String nameThread = Thread.currentThread()
					.getName();

			System.out.println(nameThread + " lendo: " + i);
			System.out.println(nameThread + " lido: " + i);

			lock.readLock().unlock();
		};

		for (int i = 0; i < 15; i++) {
			executor.execute(r1);
			executor.execute(r2);
		}

		executor.shutdown();
	}

}
