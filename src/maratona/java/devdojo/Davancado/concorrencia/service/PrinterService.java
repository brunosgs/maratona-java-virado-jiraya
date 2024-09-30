package maratona.java.devdojo.Davancado.concorrencia.service;

import java.util.concurrent.TimeUnit;

public class PrinterService implements Runnable {
	private final int num;

	public PrinterService(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		System.out.printf("%s iniciou %d%n", Thread.currentThread()
				.getName(), num);

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.printf("%s finalizou%n", Thread.currentThread()
				.getName());
	}

}
