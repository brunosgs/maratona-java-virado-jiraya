package maratona.java.devdojo.intermediario.classesutilitarias.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * - A 'LocalDateTime' é a junção de LocalDate + LocalTime, onde é possível trabalhar com
 * data e hora;
 */
public class Aula121LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
		LocalDate dateParse = LocalDate.parse("2022-08-06");

		LocalTime time = LocalTime.of(9, 45, 21);
		LocalTime timeParse = LocalTime.parse("24:55:00");

		// 'atTime' faz a junção da data com hora
		LocalDateTime atTime = date.atTime(time);

		System.out.println("Data e hora agora: " + localDateTime);
		System.out.println("Data em parse: " + dateParse);
		System.out.println("Horas em pase: " + timeParse);
		System.out.println("Data e hora junção: " + atTime);
	}

}
