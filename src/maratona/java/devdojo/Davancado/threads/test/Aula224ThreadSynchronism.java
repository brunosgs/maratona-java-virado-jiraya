package maratona.java.devdojo.Davancado.threads.test;

import maratona.java.devdojo.Davancado.threads.service.ThreadDrawalService;

public class Aula224ThreadSynchronism {

	public static void main(String[] args) {
		ThreadDrawalService threadDrawal = new ThreadDrawalService();

		Thread threadDrawal1 = new Thread(threadDrawal, "Hestia");
		Thread threadDrawal2 = new Thread(threadDrawal, "Bell Cranel");

		threadDrawal1.start();
		threadDrawal2.start();
	}

}
