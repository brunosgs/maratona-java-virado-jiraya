package maratona.java.devdojo.Davancado.concorrencia.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import maratona.java.devdojo.Davancado.concorrencia.dominio.RandomNumberCallable;

/**
 * - Quando estiver usando o Executors para criar um pool de threads, evitar
 * usar o wait e notify. Como esta sendo feito o desacoplamento da submissão,
 * não se sabe como as threads vão ser executadas, assim travando a execução e
 * tirando o controle do framework;
 */
public class Aula238ExecutorsCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
		ExecutorService newFixedThreadPoolService = Executors.newFixedThreadPool(2);

		/**
		 * Um Future representa o resultado de uma computação assíncrona. São fornecidos
		 * métodos para verificar se o cálculo está completo, para aguardar sua
		 * conclusão e para recuperar o resultado do cálculo. O resultado só pode ser
		 * recuperado usando o método get quando o cálculo for concluído, bloqueando se
		 * necessário até que esteja pronto. O cancelamento é realizado pelo método
		 * cancel. Métodos adicionais são fornecidos para determinar se a tarefa foi
		 * concluída normalmente ou foi cancelada. Depois que um cálculo for concluído,
		 * ele não poderá ser cancelado. Se você quiser usar um Future para fins de
		 * cancelamento, mas não fornecer um resultado utilizável, poderá declarar tipos
		 * no formato Future<?> e retornar nulo como resultado da tarefa subjacente.
		 */
		Future<String> future = newFixedThreadPoolService.submit(randomNumberCallable);
		String resultFuture = future.get();

		System.out.printf("Program finished %s", resultFuture);
		newFixedThreadPoolService.shutdown();
	}

}
