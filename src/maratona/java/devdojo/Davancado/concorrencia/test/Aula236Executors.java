package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import maratona.java.devdojo.Davancado.concorrencia.service.PrinterService;

/**
 * - Com o 'ExecutorService' é possível criar pools de Threads;
 * <p>
 * - 'Executors.newFixedThreadPool()' cria um pool de threads baseado na
 * quantidade passada pelo parâmetro, onde essas executam as tarefas que estiver
 * na fila;
 * <p>
 * - 'Executors.newSingleThreadExecutor()' cria uma unica thread que sera
 * reponsável por todas as tarefas.
 * <p>
 * - 'Executors.newCachedThreadPool()' cria threads conforme demanda, as threads
 * que foram criadas e são liberadas vão ser reutilizadas.
 */
public class Aula236Executors {

	public static void main(String[] args) {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);

		newFixedThreadPool.execute(new PrinterService(1));
		newFixedThreadPool.execute(new PrinterService(2));
		newFixedThreadPool.execute(new PrinterService(3));
		newFixedThreadPool.execute(new PrinterService(4));
		newFixedThreadPool.execute(new PrinterService(5));
		newFixedThreadPool.execute(new PrinterService(6));

		/**
		 * Finaliza as threads mas só quando todas terminam seu trabalhos. Inicia um
		 * encerramento ordenado no qual as tarefas enviadas anteriormente são
		 * executadas, mas nenhuma nova tarefa será aceita.
		 */
		newFixedThreadPool.shutdown();

		while (!newFixedThreadPool.isTerminated()) {
			try {
				TimeUnit.SECONDS.sleep(1);

				if (newFixedThreadPool.isTerminated()) {
					System.out.println("Programa finalizado!");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
