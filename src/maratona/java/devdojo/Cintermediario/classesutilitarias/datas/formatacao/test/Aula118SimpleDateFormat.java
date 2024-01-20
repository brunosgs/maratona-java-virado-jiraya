package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * - Utilizando das aspas simples, o SimpleDateFormat ignora, para que seja possível utilizar o pattern definido;
 * <p>
 * - É possível fazer o parse, mas o parse tem que ser o mesmo que foi passado como no pattern e obteve no retorno,
 * ao executar o parse corretamente ele retornara um Date;
 */
public class Aula118SimpleDateFormat {

	public static void main(String[] args) {
		String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
		String pattern2 = "'Cidade' dd 'de' MMMMM 'de' yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);

		System.out.println("Exemplo1: " + sdf.format(new Date()));
		System.out.println("Exemplo2: " + sdf2.format(new Date()));

		try {
			System.out.println("Parse exemplo1: " + sdf.parse("2024.01.16 d.C. at 08:18:06 BRT"));
			System.out.println("Parse exemplo2: " + sdf2.parse("Cidade 16 de janeiro de 2024"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
