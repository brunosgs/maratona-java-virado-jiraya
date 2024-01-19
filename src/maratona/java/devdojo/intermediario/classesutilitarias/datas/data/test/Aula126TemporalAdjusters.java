package maratona.java.devdojo.intermediario.classesutilitarias.datas.data.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * - A 'TemporalAdjusters' é uma clase utilitária onde os métodos são estáticos
 * e que serve para ajustes no tempo;
 * <p>
 */
public class Aula126TemporalAdjusters {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate plusDays = now.plusDays(18);
		LocalDate withDayOfMonth = now.withDayOfMonth(20);
		LocalDate withMonth = now.withMonth(6);
		LocalDate withChronoField = now.with(ChronoField.DAY_OF_MONTH, 10);

		System.out.println("Data atual: " + now);
		System.out.println("Adiciona 18 dias para data atual: " + plusDays);
		System.out.println("Busca o dia da semana: " + plusDays.getDayOfWeek());
		System.out.println("Altera o dia da data atual: " + withDayOfMonth);
		System.out.println("Altera o dia da data atual com ChronoField: " + withChronoField);
		System.out.println("Altera o mês da data atual: " + withMonth);

		// TemporalAdjusters
		LocalDate withNextOrSame = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		LocalDate withNext = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		LocalDate withPrevius = now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		LocalDate withFirstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate withLastDAy = now.with(TemporalAdjusters.lastDayOfMonth());
		LocalDate withFirstDayOfNextYear = now.with(TemporalAdjusters.firstDayOfNextYear());

		System.out.println("\nRetorna a data do dia ou a próxima: " + withNextOrSame);
		System.out.println("Retorna a próxima data: " + withNext);
		System.out.println("Retorna a data anterior: " + withPrevius);
		System.out.println("Primeiro dia do mês: " + withFirstDayOfMonth);
		System.out.println("Último dia do mês: " + withLastDAy);
		System.out.println("Primeiro dia do próximo ano: " + withFirstDayOfNextYear);
	}

}