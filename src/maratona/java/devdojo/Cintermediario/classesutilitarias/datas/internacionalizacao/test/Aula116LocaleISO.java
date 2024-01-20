package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.internacionalizacao.test;

import java.util.Locale;

/**
 * - Para visualizar todas as ISO's suportadas, no Locale existem os métodos 'getISOCountries()' e 'getISOLanguages()';
 */
public class Aula116LocaleISO {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());

		String[] isoCountries = Locale.getISOCountries();
		String[] isoLanguages = Locale.getISOLanguages();

		System.out.println("Countries: ");

		for (String countries : isoCountries) {
			System.out.print(countries + " ");
		}

		System.out.println("\n\nLanguages: ");
		for (String languages : isoLanguages) {
			System.out.print(languages + " ");
		}
	}

}
