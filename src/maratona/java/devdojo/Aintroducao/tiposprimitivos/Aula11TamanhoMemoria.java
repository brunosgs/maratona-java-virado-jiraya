package maratona.java.devdojo.Aintroducao.tiposprimitivos;

//Tipos primitivos: int, double, float, char, byte, short, long e boolean
public class Aula11TamanhoMemoria {

	public static void main(String[] args) {
		// Os tipos primitivos tem seus tamanhos definidos em bytes e bits;
		int idade = 10;
		long numeroGrande = 100000;
		double salarioDouble = 2000;
		float salarioFloat = 2500;
		byte idadeByte = 127;
		short idadeShort = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractererASCII = 87; // ASCII TABLE
		char caractererUNICODE = '\u0040'; // UNICODE

		System.out.println("A idade é " + idade + " anos");
		System.out.println(numeroGrande);
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
