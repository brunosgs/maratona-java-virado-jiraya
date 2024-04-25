package maratona.java.devdojo.Davancado.threads.test;

import maratona.java.devdojo.Davancado.threads.service.ThreadDrawalService;

/**
 * - Não existe um sincronismo exato com a utilização das Threads como no
 * exemplo. Para o exemplo, duas threads acessando a mesma conta podem existir
 * bloqueios onde a thread em execução libera para que outra faça
 * processamentos, sendo que, a em execução anterior para em determinada parte
 * do código onde não finalizou por completo o processo.
 */
public class Aula224ThreadSynchronism {

	public static void main(String[] args) {
		ThreadDrawalService threadDrawal = new ThreadDrawalService();

		Thread threadDrawal1 = new Thread(threadDrawal, "Hestia");
		Thread threadDrawal2 = new Thread(threadDrawal, "Bell Cranel");

		threadDrawal1.start();
		threadDrawal2.start();
	}

}
