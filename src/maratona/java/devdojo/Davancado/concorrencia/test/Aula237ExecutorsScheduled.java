package maratona.java.devdojo.Davancado.concorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * - Com o 'ScheduledExecutorService' posso agendar a execução do serviço
 * definindo o tempo de delay;
 * <p>
 * - O '.schedule()' posso executar passando a tarefa, o delay e a unidade de
 * medida do delay;
 * <p>
 * - O '.scheduleAtFixedRate()' posso executar passando a tarefa, delay inicial,
 * delay e unidade de medida do delay. Caso a tarefa esta dormindo com um tempo
 * maior do que foi definido, ele aguarda liberar para que com a primeira
 * oportunidade execute;
 * <p>
 * - O '.scheduleWithFixedDelay()' posso executar passando a tarefa, delay
 * inicial, delay e unidade de medida do delay. Caso a tarefa esta dormindo ele
 * aguarda ser liberada e inicia sua job no momento que foi liberado, sendo esse
 * somado ao tempo em que ficou dormindo;
 */
public class Aula237ExecutorsScheduled {
	private static final ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	private static void beeperAtFixed() {
		Runnable r = () -> {
			try {
				System.out.println(formatter.format(LocalTime.now()) + " Beep");
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		ScheduledFuture<?> scheduleAtFixed = newScheduledThreadPool.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);

		/**
		 * Para que seja finalizado o scheduleAtFixed, é preciso criar outro scheduler
		 * para finalizar.
		 */
		newScheduledThreadPool.schedule(() -> {
			System.out.println("Cancelando o scheduleAtFixedRate");
			scheduleAtFixed.cancel(false); // Cancela mas passa como false para que finalize suas tarefas em progresso.
			newScheduledThreadPool.shutdown();
		}, 25, TimeUnit.SECONDS);
	}

	private static void beeperWithFixed() {
		Runnable r = () -> {
			try {
				System.out.println(formatter.format(LocalTime.now()) + " Beep");
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		ScheduledFuture<?> scheduleWithFixed = newScheduledThreadPool.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);

		/**
		 * Para que seja finalizado o scheduleWithFixed, é preciso criar outro scheduler
		 * para finalizar.
		 */
		newScheduledThreadPool.schedule(() -> {
			System.out.println("Cancelando o scheduleWithFixedDelay");
			scheduleWithFixed.cancel(false); // Cancela mas passa como false para que finalize suas tarefas em progresso.
			newScheduledThreadPool.shutdown();
		}, 25, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		System.out.println(formatter.format(LocalTime.now()));
		beeperAtFixed();
		beeperWithFixed();
	}

}
