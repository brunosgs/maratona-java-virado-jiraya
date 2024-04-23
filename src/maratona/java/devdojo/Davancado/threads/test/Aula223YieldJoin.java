package maratona.java.devdojo.Davancado.threads.test;

import maratona.java.devdojo.Davancado.threads.dominio.ThreadStringRunnable;

/**
 * - O método join() de uma instância de Thread é usado para unir o início da
 * execução de um thread ao final da execução de outro thread, de modo que um
 * thread não comece a ser executado até que outro thread termine. Se join() for
 * chamado em uma instância de Thread, o thread atualmente em execução será
 * bloqueado até que a instância de Thread termine de ser executada.
 */
public class Aula223YieldJoin {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadStringRunnable("Ka"));
		Thread t2 = new Thread(new ThreadStringRunnable("Me"));

		t1.start();
		t1.join(); // Thread 'main' é bloqueada até que a instância da Thread t1 sejá finalizada.
		t2.start();
	}

}
