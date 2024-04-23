package maratona.java.devdojo.Davancado.threads.dominio;

// O correto de se trabalhar com threads seria utilizando interfaces
public class ThreadExampleRunnable implements Runnable {
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

			try {
				// Espera 2 segundos antes de continuar
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}