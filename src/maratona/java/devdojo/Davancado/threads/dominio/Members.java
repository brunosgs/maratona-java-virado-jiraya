package maratona.java.devdojo.Davancado.threads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
	private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	private boolean open = true;

	public boolean isOpen() {
		return open;
	}

	public int pendingEmails() {
		synchronized (emails) {
			return emails.size();
		}
	}

	public void addMemberEmail(String email) {
		synchronized (emails) {
			System.out.println(getThreadName() + " adicionou email a lista!");
			emails.add(email);
			emails.notifyAll(); // Notifica todas as threads que esta esperando;
		}
	}

	public String retrieveEmail() {
		System.out.println(getThreadName() + " checking if there are emails!");

		synchronized (emails) {
			while (emails.size() == 0) {
				if (!open) {
					return null;
				}

				System.out.println(getThreadName() + " não existe email disponivel na lista, entrando em modo de espera!");

				try {
					System.out.println(getThreadName() + " aguardando...");
					emails.wait(); // Faz com que a thread espere até ser notificada ou interrompida;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			return emails.poll();
		}
	}

	public void close() {
		open = false;

		synchronized (emails) {
			System.out.println(getThreadName() + " notificando todo mundo que não estamos mais pegando emails!");
			emails.notifyAll();
		}
	}

	private String getThreadName() {
		return Thread.currentThread()
				.getName();
	}
}
