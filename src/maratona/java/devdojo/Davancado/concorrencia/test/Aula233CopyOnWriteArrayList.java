package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * - Trabalhando com copias de arrays
 */
public class Aula233CopyOnWriteArrayList {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new CopyOnWriteArrayList<>();

		for (int i = 0; i < 2000; i++) {
			list.add(i);
		}

		Runnable runnableInterator = () -> {
			Iterator<Integer> iterator = list.iterator();
			iterator.forEachRemaining(System.out::println);

			try {
				TimeUnit.SECONDS.sleep(3);

				System.out.println("Nova interação");
				/**
				 * A pegar novamente o iterator "iterator = list.iterator();" é possível
				 * visualizar o estado atualizado da lista.
				 */
				iterator = list.iterator();
				iterator.forEachRemaining(System.out::println);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		// Remove o elemento sequencialmente
		Runnable runnableRemoverSequencial = () -> {
			for (int i = 0; i < 500; i++) {
				Integer elementToRemove = list.get(0); // Obtem o elemento a ser removido

				list.remove(elementToRemove);
				System.out.printf("%s removendo elemento %d%n", Thread.currentThread()
						.getName(), elementToRemove);
			}
		};

		/**
		 * Remove o elemento, mas baseado no index, como existe uma copia sempre que ele
		 * intera novamente, o elemento muda conforme o index passado, mesmo o index
		 * sendo sequencial de 0 a 499
		 */
		Runnable runnableRemover = () -> {
			for (int i = 0; i < 500; i++) {
				list.remove(i);
				System.out.printf("%s removed %d%n", Thread.currentThread()
						.getName(), i);
			}
		};

		new Thread(runnableInterator).start();
		new Thread(runnableRemover).start();
		new Thread(runnableRemoverSequencial).start();
	}

}
