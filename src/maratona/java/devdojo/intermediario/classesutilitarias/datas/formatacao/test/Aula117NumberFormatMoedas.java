package maratona.java.devdojo.intermediario.classesutilitarias.datas.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Formatação de moedas
 * <p>
 * - Com o método 'getMaximumFractionDigits()' é possível verificar a quantidade máxima de retorno
 * de um número fracionário (quantas casas depois da ',' ele vai retornar). Já com o 'setMaximumFractionDigits()' é
 * possível alterar o valor da quantidade de decimais depois da ',';
 * <p>
 * - Ao tentar fazer parse com o 'NumberFormat.getCurrencyInstance()' o mesmo pode ter um problema com a String por
 * causa do NBSP, ou espaço não quebrável, é um caractere especial que representa um espaço em branco, no caso do
 * exemplo foi adicionado a linha o código Unicode: '\u00A0';
 */
public class Aula117NumberFormatMoedas {

	public static void main(String[] args) {
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALIAN;

		NumberFormat[] nf = new NumberFormat[4];

		nf[0] = NumberFormat.getCurrencyInstance();
		nf[1] = NumberFormat.getCurrencyInstance(localeJP);
		nf[2] = NumberFormat.getCurrencyInstance(localeBR);
		nf[3] = NumberFormat.getCurrencyInstance(localeIT);

		double valor = 10_000_000.2130;

		for (NumberFormat numberFormat : nf) {
			System.out.println(numberFormat.getMaximumFractionDigits());

			numberFormat.setMaximumFractionDigits(1);

			System.out.println(numberFormat.format(valor));
		}

		//Precisou utilizar o N
		String valorString = "R$\u00A01.000,21";

		// Executa um parse de um string para um número;
		try {
			System.out.println(nf[0].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
