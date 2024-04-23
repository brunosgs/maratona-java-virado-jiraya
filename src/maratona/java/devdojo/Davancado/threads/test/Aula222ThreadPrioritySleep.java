package maratona.java.devdojo.Davancado.threads.test;

import maratona.java.devdojo.Davancado.threads.dominio.ThreadExampleRunnable;

/**
 * - A threads tem prioridades que vai de 1 a 10;
 * <p>
 * - Com o 'Thread.sleep()' é possível fazer com que a thread fique 'dormindo'
 * por determinado tempo definido em milisegundos;
 */
public class Aula222ThreadPrioritySleep {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadExampleRunnable('A'), "T1A");
		Thread thread2 = new Thread(new ThreadExampleRunnable('B'), "T2B");
		Thread thread3 = new Thread(new ThreadExampleRunnable('C'), "T3C");
		Thread thread4 = new Thread(new ThreadExampleRunnable('D'), "T4D");

		thread4.setPriority(Thread.MAX_PRIORITY);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		System.out.println("\n\nThread name: " + Thread.currentThread()
				.getName());
	}

}
