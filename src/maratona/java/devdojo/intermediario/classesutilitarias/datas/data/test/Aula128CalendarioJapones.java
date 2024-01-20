package maratona.java.devdojo.intermediario.classesutilitarias.datas.data.test;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class Aula128CalendarioJapones {

	public static void main(String[] args) {
		LocalDate localdateOf = LocalDate.of(1950, 1, 24);

		JapaneseDate japaneseFromDate = JapaneseDate.from(LocalDate.now());
		JapaneseDate japaneseFromDateOf = JapaneseDate.from(localdateOf);

		System.out.println("Era no calendário japonês agora: " + japaneseFromDate);
		System.out.println("Era no calendário japonês 1950: " + japaneseFromDateOf);

	}

}
