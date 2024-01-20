package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.data.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

/**
 * - Date e Calendar são formas de trabalhar com data que se encontra em sistemas legados, a partir do
 * Java 8 foi adicionando o pacote java.time, criando novas classes para trabalhar com datas. Esse pacote é
 * foi baseado na jodatime, então pode haver coisas que se assemelham com a jodatime;
 * <p>
 * - Com a LocalDate é possível só trabalhar com a data e não com a hora;
 * <p>
 * - Nessa clsse não existe mas a limitação de data máxima e mínima;
 * <p>
 * - Ela é imutável, significa que todas a vezes que tentar alterar ela não será alterada, só se associar o
 * resultado a uma variável de referência ou a ela mesma, ela também é thread-safe, evita problemas com concorrência;
 */
public class Aula119LocalDate {

	public static void main(String[] args) {
		// Formas de trabalhar com data antes do Java 8
		System.out.println("Ante do Java 8");
		System.out.println(new Date());
		System.out.println(Calendar.getInstance());

		// Formas de trabalhar com data a partir do Java 8
		System.out.println("\nA partir do Java 8");
		LocalDate localDate = LocalDate.of(2024, Month.JANUARY, 27);
		LocalDate now = LocalDate.now();

		System.out.println("Ano: " + localDate.getYear());
		System.out.println("Mês: " + localDate.getMonth());
		System.out.println("Número do mês: " + localDate.getMonthValue());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek());
		System.out.println("Dia do mês: " + localDate.getDayOfMonth());
		System.out.println("Quantidade de dias do mês: " + localDate.lengthOfMonth());
		System.out.println("O anos é bisexto?: " + localDate.isLeapYear());

		System.out.println(localDate.get(ChronoField.YEAR));
		System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

		System.out.println(localDate);
		System.out.println(now);

		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
	}

}
