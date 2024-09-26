package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 * - Junção de alguns tipos de lista: ConcurrentLinkedQueue, SynchronousQueue,
 * LinkedBlockingQueue;
 */
public class Aula235LinkedTransferQueue {

	public static void main(String[] args) throws InterruptedException {
		TransferQueue<Object> tq = new LinkedTransferQueue<>();

		/**
		 * 'add()' adiciona a fila caso seja possível fazer retornando verdadeiro, caso
		 * contrario retorna erro "IllegalStateException" se não tiver espaço
		 * disponível.
		 */
		System.out.println("add: " + tq.add("Nome"));

		/**
		 * 'offer()' adiciona a fila caso seja possível fazer retornando verdadeiro,
		 * caso contrario retorna falso se não tiver espaço disponível.
		 */
		System.out.println("offer: " + tq.offer("Nome 2"));

		/**
		 * 'offer(E e, long timeout, TimeUnit unit);' adiciona a fila aguardando o tempo
		 * estipulado, caso seja possível fazer a adição ele retorna verdadeiro, caso
		 * contrario retorna falso se não tiver espaço disponível.
		 */
		System.out.println("offer(params): " + tq.offer("Nome 3", 10, TimeUnit.SECONDS));

		/**
		 * 'put()' adiciona a fila aguardando até que tenha espaço disponível na lista.
		 */
		tq.put("Nome 4");

		/**
		 * 'transfer()' transfere o elemento para um consumidor, aguardando se
		 * necessário.
		 */

		if (tq.hasWaitingConsumer()) {
			tq.transfer("Nome 5");
		}

		/**
		 * 'tryTransfer()' mais precisamente, transfere o elemento especificado
		 * imediatamente se já existir um consumidor esperando para recebê-lo, caso
		 * contrário, retorna falso sem enfileirar o elemento.
		 */
		System.out.println("tryTransfer: " + tq.tryTransfer("Nome 6"));

		/**
		 * 'element()' busca o primeiro elemento da fila mas não remove, caso a fila
		 * esteja vazia ele lança exceção.
		 */
		System.out.println("element: " + tq.element());

		/**
		 * 'poll()' busca o primeiro elemento da fila e remove, caso a fila esteja vazia
		 * ele retorna null.
		 */
		System.out.println("element: " + tq.poll());

		/**
		 * 'remove()' busca o primeiro elemento da fila e remove, caso a fila esteja
		 * vazia ele retorna uma exceção.
		 */
		System.out.println("element: " + tq.remove());

		/**
		 * 'take()' busca o primeiro elemento da fila e remove, caso a fila esteja
		 * vazia ele retorna null.
		 */
		System.out.println("element: " + tq.take());

		System.out.println("remainingCapacity: " + tq.remainingCapacity());
	}

}
