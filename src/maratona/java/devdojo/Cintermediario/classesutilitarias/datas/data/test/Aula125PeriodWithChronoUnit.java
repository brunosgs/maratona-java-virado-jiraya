package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.data.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * - A classe 'LocalDate' possui o método until, onde o mesmo tem em uma das
 * suas assinaturas a forma de retornar: dias, meses, anos, eras... utilizando o
 * 'ChronoUnit';
 */
public class Aula125PeriodWithChronoUnit {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		Period periodOfWeeks = Period.ofWeeks(58);

		int months = Period.between(now, now.plusDays(periodOfWeeks.getDays())).getMonths();
		long untilMonths = now.until(now.plusDays(periodOfWeeks.getDays()), ChronoUnit.MONTHS);
		long untilYears = now.until(now.plusDays(500), ChronoUnit.YEARS);

		System.out.println("Meses não normalizados: " + months);
		System.out.println("Meses: " + untilMonths);
		System.out.println("Anos: " + untilYears);
	}

}
