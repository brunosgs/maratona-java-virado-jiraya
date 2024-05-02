package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

import maratona.java.devdojo.Davancado.concorrencia.dominio.Worker;

/**
 * - Passando o lock na chamada do worker para controlar e liberar a thread;
 */
public class Aula230LockAndReetrantLock {

	public static void main(String[] args) {
		ReentrantLock reentrantLock = new ReentrantLock(true);

		new Thread(new Worker("A", reentrantLock)).start();
		new Thread(new Worker("B", reentrantLock)).start();
		new Thread(new Worker("C", reentrantLock)).start();
		new Thread(new Worker("D", reentrantLock)).start();
		new Thread(new Worker("E", reentrantLock)).start();
		new Thread(new Worker("F", reentrantLock)).start();
		new Thread(new Worker("G", reentrantLock)).start();
	}

}