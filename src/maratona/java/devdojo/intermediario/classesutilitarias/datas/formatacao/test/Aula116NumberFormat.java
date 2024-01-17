package maratona.java.devdojo.intermediario.classesutilitarias.datas.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Exemplos de números utilizando o Locale, para formatação local
 * <p>
 * - Para alguns Locale, é possível definir a localização como no exemplo: 'Locale.CANADA'
 * <p>
 * - Com o método 'getMaximumFractionDigits()' é possível verificar a quantidade máxima de retorno
 * de um número fracionário (quantas casas depois da ',' ele vai retornar). Já com o 'setMaximumFractionDigits()' é
 * possível alterar o valor da quantidade de decimais depois da ',';
 */
public class Aula116NumberFormat {

	public static void main(String[] args) {
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALIAN;


		NumberFormat[] nf = new NumberFormat[4];

		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getInstance(localeJP);
		nf[2] = NumberFormat.getInstance(localeBR);
		nf[3] = NumberFormat.getInstance(localeIT);

		double valor = 10_000_000.2130;

		for (NumberFormat numberFormat : nf) {
			System.out.println(numberFormat.getMaximumFractionDigits());

			numberFormat.setMaximumFractionDigits(2);

			System.out.println(numberFormat.format(valor));
		}

		String valorString = "1000,2130";

		// Executa um parse de um string para um numero;
		try {
			System.out.println(nf[0].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
