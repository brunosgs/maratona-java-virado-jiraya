package maratona.java.devdojo.intermediario.classesutilitarias.datas.data.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * - É possível trabalhar com a quantidade de tempo, com intervalos de datas;
 * <p>
 * - Ela é baseada e segundos e nano segundos;
 * <p>
 * - Ela utiliza da ISO 8601, onde faz a separação do tempo em horas,
 * minutos, segundos, nanosegundos, exemplo: PT17544H8M;
 * <p>
 * - A Duration não aceita LocalDate, porque ela não trabalha com segundos;
 */
public class Aula123Duration {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);

		LocalTime timeNow = LocalTime.now();
		LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

		Duration betweenYears = Duration.between(now, nowAfterTwoYears);
		Duration betweenTime = Duration.between(timeNow, timeMinus7Hours);
		Duration betweenInstantSeconds = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
		Duration parseDuration = Duration.parse("PT17544M");
		Duration durationOfDays = Duration.ofDays(20);
		Duration durationOfMinutes = Duration.ofMinutes(3);
		Duration durationOf = Duration.of(3, ChronoUnit.HOURS);

		/*
		 * Gera erro por não conter os segundos Duration betweenLocalDateError =
		 * Duration.between(LocalDate.now(), LocalDate.now().plusYears(2));
		 */

		System.out.println("Período em anos: " + betweenYears);
		System.out.println("Período em minutos: " + betweenTime);
		System.out.println("Período em Instant de segundos: " + betweenInstantSeconds);
		System.out.println("Duração de dias: " + durationOfDays);
		System.out.println("Duração em minutos: " + durationOfMinutes);
		System.out.println("Duração em: " + durationOf);
		System.out.println("Parse do período em minutos para duração: " + parseDuration);
	}

}
