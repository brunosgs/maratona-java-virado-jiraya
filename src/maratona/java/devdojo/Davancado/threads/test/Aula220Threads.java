package maratona.java.devdojo.Davancado.threads.test;

/**
 * - Definições: Pode ser um objeto ou um processo;
 * <p>
 * - Existem dois tipos de Threads, 'daemon' e 'user'. A 'user' o programa java
 * é encerrado quando todas são finalizadas, a 'daemon' não, caso existam
 * threads daemon ainda rodando e todas as threads user são finalizadas a daemon
 * é encerrada independente se ela esta rodando ainda, a thread que executa o
 * GC(garbage collection) é 'daemon'.
 * <p>
 * - Quando um programa chama o método start(), uma nova thread é criada e o
 * método run() é executado. Mas se chamarmos diretamente o método run() ,
 * nenhuma nova thread será criada e o método run() será executado como uma
 * chamada de método normal na própria thread de chamada atual (nenhum
 * multi-thread ocorrerá)
 */
public class Aula220Threads {

	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample('A');
		ThreadExample t2 = new ThreadExample('B');
		ThreadExample t3 = new ThreadExample('C');
		ThreadExample t4 = new ThreadExample('D');

		Thread thread1 = new Thread(new ThreadExampleRunnable('A'));
		Thread thread2 = new Thread(new ThreadExampleRunnable('B'));
		Thread thread3 = new Thread(new ThreadExampleRunnable('C'));
		Thread thread4 = new Thread(new ThreadExampleRunnable('D'));

		// Só executa o objeto e não cria;
		t1.run();
		t2.run();
		t3.run();
		t4.run();

		// Cria novos objetos, novas threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}

class ThreadExample extends Thread {
	private char c;

	public ThreadExample(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println("\n\nThread Example name: " + Thread.currentThread()
				.getName());

		for (int i = 0; i < 200; i++) {
			System.out.print(c + "" + i + " ");

			if (i % 100 == 0) {
				System.out.println();
			}
		}
	}

}

// O correto de se trabalhar com threads seria utilizando interfaces
class ThreadExampleRunnable implements Runnable {
	private char c;

	public ThreadExampleRunnable(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println("\n\nThread Example Runnable name: " + Thread.currentThread()
				.getName());

		for (int i = 0; i < 200; i++) {
			System.out.print(c + "" + i + " ");

			if (i % 100 == 0) {
				System.out.println();
			}
		}
	}
}
