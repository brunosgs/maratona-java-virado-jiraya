package maratona.java.devdojo.Davancado.threads.dominio;

public class ThreadExample extends Thread {
	private char c;

	public ThreadExample(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println("\n\nThread Example name: " + Thread.currentThread()
				.getName());

		for (int i = 0; i < 200; i++) {
			System.out.print(c + "" + i + " ");

			if (i % 100 == 0) {
				System.out.println();
			}
		}
	}

}