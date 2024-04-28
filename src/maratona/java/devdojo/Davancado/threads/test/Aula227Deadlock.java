package maratona.java.devdojo.Davancado.threads.test;

/**
 * - Exemplo de como um deadlock é criado! Quando se executa threads acessando o
 * mesmo objeto em paralelo, onde o objeto já possue um lock em uma das
 * chamadas. Pode haver uma trava onde o objeto não é liberado por estar
 * esperando a liberação dele mesmo em outro ponto. Quando isso acontece o
 * sistema trava porque esta esperando um processo finalizar para que o outro
 * continue.
 */
public class Aula227Deadlock {

	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();

		Runnable r = () -> {
			synchronized (lock1) {
				System.out.println("Thread1: Segurando lock 1");
				System.out.println("Thread1: Esperando lock 2");

				synchronized (lock2) {
					System.out.println("Thread1: Segurando lock 2");
				}
			}
		};

		Runnable r2 = () -> {
			synchronized (lock2) {
				System.out.println("Thread2: Segurando lock 2");
				System.out.println("Thread2: Esperando lock 1");

				synchronized (lock1) {
					System.out.println("Thread2: Segurando lock 1");
				}
			}
		};

		new Thread(r).start();
		new Thread(r2).start();
	}

}
