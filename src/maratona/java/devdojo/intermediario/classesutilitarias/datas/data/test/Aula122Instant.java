package maratona.java.devdojo.intermediario.classesutilitarias.datas.data.test;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * - A classe 'Instant' é parecida com a classe 'Date', que trabalha com
 * milisegundo e a partir da data de 01/01/1970, já a 'Instant' trabalha com
 * nano segundos;
 * <p>
 * - A representação do 'Instant' no console é, data: 2024-01-17 + separado de
 * tempo: T + horas: 11:03:41 + nano segundos: 833740600 + representação de zulo
 * time: Z, exemplo de como fica a representação final:
 * 2024-01-17T11:03:41.833740600Z
 */
public class Aula122Instant {

	public static void main(String[] args) {
		Instant instantNow = Instant.now();
		LocalDateTime localDateTimeNow = LocalDateTime.now();

		int nano = instantNow.getNano(); // 1 segundo = 1.000.000.000 nano segundos
		long epochSecond = instantNow.getEpochSecond();

		System.out.println("Instant now: " + instantNow);
		System.out.println("LocalDateTime now: " + localDateTimeNow);

		System.out.println("Nano: " + nano);
		System.out.println("EpochSecond: " + epochSecond);

		Instant ofEpochSecond = Instant.ofEpochSecond(458, 1_000_000_000);

		System.out.println(ofEpochSecond);
	}

}
