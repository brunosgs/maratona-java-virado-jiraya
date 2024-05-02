package maratona.java.devdojo.Davancado.concorrencia.dominio;

import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
	private String name;
	private ReentrantLock lock;

	public Worker(String name, ReentrantLock lock) {
		this.name = name;
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.lock();

		try {
			System.out.printf("Thread %s entrou em uma sessão crítica%n", name);
			System.out.printf("%d threads esperando na fila%n", lock.getQueueLength());
			System.out.printf("Thread %s vai esperar 2s%n", name);
			Thread.sleep(2000);
			System.out.printf("Thread %s finalizou a espera%n", name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
