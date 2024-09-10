package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import maratona.java.devdojo.Davancado.concorrencia.dominio.MapReadWrite;

/**
 * - Gerando duas threads para leitura e escrita;
 */
public class Aula232ReentrantReadWriteLock {

	public static void main(String[] args) {
		ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();
		MapReadWrite mapReadWrite = new MapReadWrite(rrwl);

		Runnable writer = () -> {
			for (int i = 0; i < 20; i++) {
				mapReadWrite.put(String.valueOf(i), String.valueOf(i));
			}
		};

		Runnable reader = () -> {
			if (rrwl.isWriteLocked()) {
				System.out.println("WRITE LOCKED!" + Thread.currentThread()
						.getName());
			} else {
				rrwl.readLock()
						.lock();

				System.out.println("FINALLY I GOT THE DAMN LOCK");

				try {
					System.out.println(Thread.currentThread()
							.getName() + " " + mapReadWrite.allKeys() + " \n");
				} finally {
					rrwl.readLock()
							.unlock();
				}
			}

		};

		Thread thread1 = new Thread(writer, "Thread A");
		Thread thread2 = new Thread(reader, "Thread B");
		Thread thread3 = new Thread(reader, "Thread C");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
