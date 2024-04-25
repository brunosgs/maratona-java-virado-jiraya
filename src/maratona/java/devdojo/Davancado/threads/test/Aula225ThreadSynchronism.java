package maratona.java.devdojo.Davancado.threads.test;

import maratona.java.devdojo.Davancado.threads.service.ThreadDrawalSynchornizedService;

/**
 * - Com o synchronized definido na assinatura do método withDrawal() dentro da
 * classe 'ThreadDrawalSynchornizedService', o código aplica um lock para que no
 * momento que duas threads executarem o mesmo método tenha uma trava, onde cada
 * uma execute por completo o código sem interromper antes de ceder espaço para
 * outra thread, conforme o scheduler defini;
 */
public class Aula225ThreadSynchronism {

	public static void main(String[] args) {
		ThreadDrawalSynchornizedService threadDrawal = new ThreadDrawalSynchornizedService();

		Thread threadDrawal1 = new Thread(threadDrawal, "Hestia");
		Thread threadDrawal2 = new Thread(threadDrawal, "Bell Cranel");

		threadDrawal1.start();
		threadDrawal2.start();
	}

}
