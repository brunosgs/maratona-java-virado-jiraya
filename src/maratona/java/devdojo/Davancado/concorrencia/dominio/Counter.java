package maratona.java.devdojo.Davancado.concorrencia.dominio;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * - Diferenças entre o synchronized e a classe 'ReentrantLock':
 * <p>
 * - Com synchronized não se tem muito controle sobre o Lock da thread;
 * <p>
 * - Com a 'ReentrantLock' existe o conceito de fair, que caso fair seja true
 * ele tenta passar para a thread que esta esperando há mais tempo. É possível
 * também obter o lock, com o tryLock(), onde caso ele não obtenha ele prossegue
 * na execução. É possível também interromper a thread que esta trabalhando. Mas
 * existe um ponto negativo que é a verbosidade que o código com o
 * 'ReentrantLock' possue, é possível fazer com synchronized e assim não deixar
 * o código complexo para o mesmo objetivo;
 */
public class Counter {
	private int count;
	private AtomicInteger atomicInteger = new AtomicInteger();
	private Lock lock = new ReentrantLock(true);

	public void increment() {
		lock.lock();

		try {
			count++;
			atomicInteger.incrementAndGet();
		} finally {
			lock.unlock();
		}
	}

	public int getCount() {
		return count;
	}

	public AtomicInteger getAtomicInteger() {
		return atomicInteger;
	}

}
