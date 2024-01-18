package maratona.java.devdojo.intermediario.classesutilitarias.datas.data.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * - Os exemplos mostram uma forma de se utilizar o 'ChronoUnit' diretamente
 * para buscar periodos de datas, horas, meses, anos;
 */
public class Aula125ChronoUnit {

	public static void main(String[] args) {
		LocalDateTime ofBirthday = LocalDateTime.of(1994, Month.FEBRUARY, 9, 16, 47, 12);
		LocalDateTime now = LocalDateTime.now();

		long betweenDays = ChronoUnit.DAYS.between(ofBirthday, now);
		long betweenWeeks = ChronoUnit.WEEKS.between(ofBirthday, now);
		long betweenMonths = ChronoUnit.MONTHS.between(ofBirthday, now);
		long betweenYears = ChronoUnit.YEARS.between(ofBirthday, now);

		System.out.println("Dias da data atual até 12/02/1994 - 16:47:12: " + betweenDays + " dias");
		System.out.println("Semanas da data atual até 12/02/1994 - 16:47:12: " + betweenWeeks + " semanas");
		System.out.println("Meses da data atual até 12/02/1994 - 16:47:12: " + betweenMonths + " meses");
		System.out.println("Anos da data atual até 12/02/1994 - 16:47:12: " + betweenYears + " anos");
	}

}
