package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.data.exercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Aula127TemporalAdjustersExercicio {

	public static void main(String[] args) {
		// Meu exemplo:

		LocalDate now = LocalDate.now();
		// Testando os dias
		// now = now.plusDays(7);

		switch (now.getDayOfWeek()) {
		case THURSDAY:
			now = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		case FRIDAY:
			now = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			break;
		case SUNDAY:
			now = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			break;
		default:
			now = now.plusDays(1);
		}

		System.out.println(now);

		LocalDate withNowExemploProfessor = LocalDate.now().with(new Aula127ExemploProfessor());

		System.out.println(withNowExemploProfessor);
	}

}

class Aula127ExemploProfessor implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
		int addDays = 1;

		switch (dayOfWeek) {
		case THURSDAY:
			addDays = 4;
			break;
		case FRIDAY:
			addDays = 3;
			break;
		case SATURDAY:
			addDays = 2;
			break;
		default:
			addDays = 1;
			break;
		}

		return temporal.plus(addDays, ChronoUnit.DAYS);
	}

}
