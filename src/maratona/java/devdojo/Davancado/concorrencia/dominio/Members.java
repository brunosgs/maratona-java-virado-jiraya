package maratona.java.devdojo.Davancado.concorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
	private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private boolean open = true;

	public boolean isOpen() {
		return open;
	}

	public int pendingEmails() {
		lock.lock();

		try {
			return emails.size();
		} finally {
			lock.unlock();
		}
	}

	public void addMemberEmail(String email) {
		lock.lock();

		try {
			System.out.println(getThreadName() + " adicionou email a lista!");
			emails.add(email);
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public String retrieveEmail() {
		System.out.println(getThreadName() + " checking if there are emails!");

		lock.lock();

		try {
			while (emails.size() == 0) {
				if (!open) {
					return null;
				}

				System.out.println(getThreadName() + " não existe email disponivel na lista, entrando em modo de espera!");

				try {
					System.out.println(getThreadName() + " aguardando...");
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			return emails.poll();
		} finally {
			lock.unlock();
		}
	}

	public void close() {
		open = false;

		lock.lock();

		try {
			System.out.println(getThreadName() + " notificando todo mundo que não estamos mais pegando emails!");
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	private String getThreadName() {
		return Thread.currentThread()
				.getName();
	}
}
