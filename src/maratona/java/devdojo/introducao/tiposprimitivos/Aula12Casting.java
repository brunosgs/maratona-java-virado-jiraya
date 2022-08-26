package maratona.java.devdojo.introducao.tiposprimitivos;

//Tipos primitivos: int, double, float, char, byte, short, long e boolean
public class Aula12Casting {

	public static void main(String[] args) {

		/*
		 * - Os tipos primitivos tem seus tamanhos definidos em bytes e bits;
		 * - Tipos flaot deve se usar o 'F' depois do número, exemplo: flaot numero = 3000F;
		 * - Tipos long pode se usar depois o 'L', exemplo: long numero = 1200L;
		 */

		int idadeCasting = (int) 1000000000000L; // Para esse casting ele corta os bits
		long numeroGrandeCasting = (long) 155.36;
		double salarioDouble = 2000.0;
		float salarioFloat = 2500.0F;
		byte idadeByte = 127;
		short idadeShort = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractererASCII = 87; // ASCII TABLE
		char caractererUNICODE = '\u0040'; // UNICODE

		System.out.println("A idade é " + idadeCasting + " anos");
		System.out.println(numeroGrandeCasting);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println(idadeByte);
		System.out.println(idadeShort);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println("ASCII: " + caractererASCII);
		System.out.println("UNICODE: " + caractererUNICODE);
	}

}
