package maratona.java.devdojo.intermediario.classesutilitarias.datas.test;

import java.util.Date;

/**
 * - A classe Date existe desde de a versão 1.0 do Java, nos dias atuais não se deve utilizar ela
 * pois varios métodos dela já estão depreciados. Existem outros classes na API Java que podem
 * ser utilizadas para datas;
 * <p>
 * - Date trabalha em milisegundos = long, com data desde 01/01/1970;
 * <p>
 * - Um dos motivos de Date ter muitos métodos depreciados, é a parte de internacionalização.
 * O que o Java precisa é disponibilizar ele em varios sistemas operacionas, e isso estava ficarando
 * ruim com a utilização da classe Date para datas;
 */
public class Aula112Date {

	public static void main(String[] args) {
		Date date = new Date(1000000000000L);
		Date dateNow = new Date();

		System.out.println(date);
		System.out.println(dateNow.getTime()); // Retorna os milisegundos
		System.out.println(dateNow);


		date.setTime(date.getTime() + 3_600_000L);

		System.out.println(date);
	}

}
