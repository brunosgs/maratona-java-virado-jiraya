package maratona.java.devdojo.Davancado.threads.service;

import maratona.java.devdojo.Davancado.threads.dominio.Account;

/**
 * - Blocos de código ou métodos que precisam ser executados de forma atômica,
 * se utiliza o synchronized
 */
public class ThreadDrawalSynchornizedService implements Runnable {
	private final Account acc = new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withDrawalSyncACC(5);

			if (acc.getBalance() < 0) {
				System.out.println("SALDO NEGATIVO " + acc.getBalance());
			}
		}

	}

	/**
	 * Para não ter problemas de concorrência entre threads e exista paradas onde a
	 * execução não seja finaliza, o bloco de código precisa ter um lock, onde
	 * define que esse trecho de código será executado por completo. Para que isso
	 * seja possível se utiliza o synchronized, onde ele faz a trava e executa o
	 * código em sincronismo, assim não existindo paralelismo.
	 */
	@SuppressWarnings("unused")
	private synchronized void withDrawal(int amount) {
		System.out.println(getThreadName() + " ---- METHOD synchronized ----");

		if (acc.getBalance() >= amount) {
			System.out.println(getThreadName() + " está indo sacar dinheiro...");

			acc.withDrawal(amount);

			System.out.println(getThreadName() + " completou o saque, valor atual da conta é " + acc.getBalance());
		} else {
			System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + acc.getBalance());
		}
	}

	/**
	 * É possível pegar o lock de um objeto, como, por exemplo, feito o synchronized
	 * de 'Account', mas para que isso funcione corretamente o objeto tem que estar
	 * como final, porque pode ser que o objeto seja criado novamente em outro
	 * momento e a identificação do lock dele não funciona corretamente;
	 */
	private void withDrawalSyncACC(int amount) {
		System.out.println(getThreadName() + " ###### fora do synchronized(acc)...");

		synchronized (acc) {
			System.out.println(getThreadName() + " ***** dentro do synchronized(acc)...");

			if (acc.getBalance() >= amount) {
				System.out.println(getThreadName() + " está indo sacar dinheiro...");

				acc.withDrawal(amount);

				System.out.println(getThreadName() + " completou o saque, valor atual da conta é " + acc.getBalance());
			} else {
				System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + acc.getBalance());
			}

			System.out.println(getThreadName() + " ***** finalizado do synchronized(acc)...\n");
		}
	}

	private String getThreadName() {
		return Thread.currentThread()
				.getName();
	}

}
