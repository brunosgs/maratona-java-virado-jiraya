package maratona.java.devdojo.Davancado.threads.test;

import maratona.java.devdojo.Davancado.threads.dominio.ThreadExampleRunnable;

/**
 * - A mesma thread não pode ser feito o '.start()' duas vezes, ele lançara um
 * exception: 'IllegalThreadStateException';
 * <p>
 * - O main executa linha por linha até chega em outro start de uma thread onde
 * essa pode executar ou não no momento, vai depender do scheduler (agendador).
 * O scheduler pode definir que o main espere para a nova thread executar ou
 * finalize, ele vai coordenar como elas vão ser executadas e quem vai ficar
 * executando enquanto existe espera ou não.
 * <p>
 * - Estados que a thread pode ter são: New -> Runnable <-> Running ->
 * Waiting/Blocked -> Runnable <-> Running -> Dead
 * <p>
 * - Uma thread não pode interferir em outra, quando a thread esta dormindo foi
 * por decisão dela e quando um thread morre (dead) não é possível recuper o
 * objeto, tem que se criar outro;
 */
public class Aula221ThreadState {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadExampleRunnable('A'));
		Thread thread2 = new Thread(new ThreadExampleRunnable('B'));
		Thread thread3 = new Thread(new ThreadExampleRunnable('C'));
		Thread thread4 = new Thread(new ThreadExampleRunnable('D'));

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		System.out.println("\n\nThread name: " + Thread.currentThread()
				.getName());
	}

}
