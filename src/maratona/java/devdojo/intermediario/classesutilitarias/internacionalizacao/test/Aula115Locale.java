package maratona.java.devdojo.intermediario.classesutilitarias.internacionalizacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * - A classe Locale foi criada para trabalhar com a internacionalização. Ela serve
 * para formatação de datas, moedas e números. Ela se baseia na localização da JVM do
 * usuário;
 * - A classe segue o padrão das ISO's. ISO 639 que define a lingua, exemplo: 'pt' e
 * a ISO 3166 que define o país, exemplo: 'BR', sendo a junção das duas: 'pt-BR'
 */
public class Aula115Locale {

	public static void main(String[] args) {
		// Locale com a língua e o país
		Locale localeItaly = new Locale("it", "IT");
		Locale localeSwitzerland= new Locale("it", "CH");
		Locale localeIndia = new Locale("hi", "IN");
		Locale localeJapan = new Locale("ja", "JP");
		Locale localeNetherlands = new Locale("nl", "NL");

		Calendar calendar = Calendar.getInstance();

		DateFormat dfItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
		DateFormat dfSwitzerland = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
		DateFormat dfIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
		DateFormat dfJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
		DateFormat dfNetherlands = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

		System.out.println("Itália: " + dfItaly.format(calendar.getTime()));
		System.out.println("Suiça: " + dfSwitzerland.format(calendar.getTime()));
		System.out.println("Índia: " + dfIndia.format(calendar.getTime()));
		System.out.println("Japão: " + dfJapan.format(calendar.getTime()));
		System.out.println("Holanda: " + dfNetherlands.format(calendar.getTime()));

		// Se não passar um argumento com o Locale, ele busca o atual do sistema operacional
		System.out.println(localeItaly.getDisplayCountry());
		System.out.println(localeItaly.getDisplayLanguage());

		// Passando o agumento com o Locale
		System.out.println(localeSwitzerland.getDisplayCountry(localeJapan));
		System.out.println(localeSwitzerland.getDisplayLanguage(localeJapan));
	}

}
