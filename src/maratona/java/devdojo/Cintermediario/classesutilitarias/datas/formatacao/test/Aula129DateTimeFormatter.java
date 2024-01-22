package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * - Como alguns países possuem datas em formatos/padrões diferentes, ai será
 * preciso formatar com um padrão específico: dd/MM/yyyy, MM/dd/yyyy, yyyy/MM/dd
 * e etc;
 */
public class Aula129DateTimeFormatter {

	public static void main(String[] args) {
		/* ------------- FORMAT/PARSE LocalDate ------------- */
		LocalDate localDate = LocalDate.now();
		String formatISOBasic = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
		String formatISODate = localDate.format(DateTimeFormatter.ISO_DATE);
		String formatISODateLocal = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

		LocalDate localDateParseISOBasic = LocalDate.parse("20240122", DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate localDateParseISODate = LocalDate.parse("2024-01-22+05:00", DateTimeFormatter.ISO_DATE);

		/**
		 * Inserir a string para fazer o parse "yyyy-mm-dd" já é o padrão, então
		 * 'DateTimeFormatter' é opcional adicionar ou não
		 */
		LocalDate localDateParseISODateLocal = LocalDate.parse("2024-01-22");

		System.out.println("ISO Basic: " + formatISOBasic);
		System.out.println("ISO Date: " + formatISODate);
		System.out.println("ISO Local Date: " + formatISODateLocal);
		System.out.println("Parse ISO Basic: " + localDateParseISOBasic);
		System.out.println("Parse ISO Date: " + localDateParseISODate);
		System.out.println("Parse ISO Local Date: " + localDateParseISODateLocal);

		/* ------------- FORMAT/PARSE LocalDateTime ------------- */
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		String formatISOBasicTime = localDateTimeNow.format(DateTimeFormatter.ISO_DATE_TIME);
		LocalDateTime localDateTime = LocalDateTime.parse("2024-01-22T09:16:01.5869198");

		System.out.println("ISO Basic Time: " + formatISOBasicTime);

		/**
		 * Inserir a string para fazer o parse "yyyy-mm-ddThh:mm:ss.nano" já é o padrão,
		 * então 'DateTimeFormatter' é opcional adicionar ou não
		 */
		System.out.println("Parse ISO Time Local Date: " + localDateTime);

		/* ------------- FORMAT/PARSE DateTimeFormatter ------------- */
		DateTimeFormatter ofPatternBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ofPatternLocaleGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);

		String formatLocalDateBR = localDate.format(ofPatternBR);
		LocalDate parseLocalDateBR = LocalDate.parse("25/01/2024", ofPatternBR);

		String formatLocalDateGR = localDate.format(ofPatternLocaleGR);
		LocalDate parseLocalDateGR = LocalDate.parse("22.Januar.2024", ofPatternLocaleGR);

		System.out.println("Formatação BR: " + formatLocalDateBR);
		System.out.println("Parse BR: " + parseLocalDateBR);
		System.out.println("Formatação GR : " + formatLocalDateGR);
		System.out.println("Parse GR: " + parseLocalDateGR);
	}
}
