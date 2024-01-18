package maratona.java.devdojo.intermediario.classesutilitarias.datas.data.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * - A classe 'Period' diferente da 'Duration' trabalha com a quantidade de
 * datas;
 * <p>
 * - Ela se utiliza da ISO 8601;
 */
public class Aula124Period {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfaterTwoYears = LocalDateTime.now().plusYears(2).plusDays(7);

		Period periodBetween = Period.between(now.toLocalDate(), nowAfaterTwoYears.toLocalDate());
		Period peridoOfDays = Period.ofDays(10);
		Period periodOfWeeks = Period.ofWeeks(58);
		Period periodOfMonths = Period.ofMonths(3);
		Period periodOfYears = Period.ofYears(3);

		System.out.println(periodBetween);
		System.out.println(peridoOfDays);
		System.out.println(periodOfWeeks);
		System.out.println(periodOfMonths);
		System.out.println(periodOfYears);

		/*
		 * Existe diferença em 15 meses para 1 ano e 3 meses, o retorno de 'getMonths()'
		 * seria 1, verificar a documentação
		 */
		System.out.println(
				Period.between(LocalDate.now(), LocalDate.now().plusDays(periodOfWeeks.getDays())).getMonths());
	}

}
