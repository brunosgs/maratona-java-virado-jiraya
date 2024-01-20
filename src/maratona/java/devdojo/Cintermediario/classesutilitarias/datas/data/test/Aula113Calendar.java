package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.data.test;

import java.util.Calendar;
import java.util.Date;

/**
 * - A classe Calendar foi criada para resolver o problema de internacionalização da classe Date,
 * ela é uma classe abstrata, então não é possível estanciar um objeto com 'new Object()';
 * <p>
 * - Cuidar ao utilizar o método add() no Calendar, dependendo do valor utilizado ele pode virar,
 * o dia, mês ou ano;
 * <p>
 * - Para que não vire os dias, meses ou anos, no caso existe o método roll();
 * <p>
 * - Para sistemas legados existe ainda muito a utilização dessas classes: Date e Calendar;
 */
public class Aula113Calendar {

	public static void main(String[] args) {
		Calendar calendarDate = Calendar.getInstance();
		Date date = calendarDate.getTime();

		// Verificando se é domingo
		if (calendarDate.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domingo é o primeiro dia da semana\n");
		}

		// Buscado os dias da semana, mês, ano e dia da semana no mês, todas baseado na data atual
		System.out.println("Dia da semana: " + calendarDate.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia da mês: " + calendarDate.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do ano: " + calendarDate.get(Calendar.DAY_OF_YEAR));
		System.out.println("Dia da semana no mês: " + calendarDate.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		calendarDate.roll(Calendar.HOUR, 24);

		date = calendarDate.getTime();

		System.out.println("Método roll(): " + date);

		// Adicionando dias e horas a uma data
		calendarDate = Calendar.getInstance();

		calendarDate.add(Calendar.DAY_OF_MONTH, 2);
		calendarDate.add(Calendar.HOUR, 2);

		date = calendarDate.getTime();

		System.out.println("Método add(): " + date);

	}

}
