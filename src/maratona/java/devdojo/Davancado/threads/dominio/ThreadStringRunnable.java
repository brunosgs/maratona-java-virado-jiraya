package maratona.java.devdojo.Davancado.threads.dominio;

// O correto de se trabalhar com threads seria utilizando interfaces
public class ThreadStringRunnable implements Runnable {
	private String c;

	public ThreadStringRunnable(String c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println("\n\nThread String Runnable name: " + Thread.currentThread()
				.getName());

		for (int i = 0; i < 200; i++) {
			System.out.print(c + "" + i + " ");

			if (i % 100 == 0) {
				System.out.println();
			}

			/**
			 * O yield da uma dica para o escalonador de que o thread atual está disposto a
			 * ceder o uso atual de um processador. O escalonador é livre para ignorar este
			 * ponto.
			 */
			Thread.yield();

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}