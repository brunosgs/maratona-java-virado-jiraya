package maratona.java.devdojo.Davancado.threads.service;

import maratona.java.devdojo.Davancado.threads.dominio.Account;

public class ThreadDrawalService implements Runnable {
	private Account acc = new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withDrawal(10);

			if (acc.getBalance() < 0) {
				System.out.println("SALDO NEGATIVO " + acc.getBalance());
			}
		}

	}

	private void withDrawal(int amount) {
		if (acc.getBalance() >= amount) {
			System.out.println(getThreadName() + " está indo sacar dinheiro...");

			acc.withDrawal(amount);

			System.out.println(getThreadName() + " completou o saque, valor atual da conta é " + acc.getBalance());
		} else {
			System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + acc.getBalance());
		}
	}

	private String getThreadName() {
		return Thread.currentThread()
				.getName();
	}

}
