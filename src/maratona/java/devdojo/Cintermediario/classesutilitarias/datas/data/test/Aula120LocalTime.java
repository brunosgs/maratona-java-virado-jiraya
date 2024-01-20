package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.data.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * - LocalTime trabalhar só com as horas, diferente da LocalDate que trabalhar só com a data;
 */
public class Aula120LocalTime {

	public static void main(String[] args) {
		LocalTime ofTime = LocalTime.of(23, 32, 12);
		LocalTime timeNow = LocalTime.now();

		System.out.println("Hora personalizada: " + ofTime);
		System.out.println("Hora atual: " + timeNow);
		System.out.println("Horas: " + timeNow.getHour());
		System.out.println("Minutos: " + timeNow.getMinute());
		System.out.println("Segundos: : " + timeNow.getSecond());
		System.out.println("Nano segundos: " + timeNow.get(ChronoField.NANO_OF_SECOND));
		System.out.println("Hora miníma do dia: " + LocalTime.MIN);
		System.out.println("Hora maxíma do dia: " + LocalTime.MAX);
	}

}
