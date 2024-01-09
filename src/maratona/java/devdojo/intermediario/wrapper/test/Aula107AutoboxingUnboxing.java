package maratona.java.devdojo.intermediario.wrapper.test;

/**
 * - Autoboxing: é quando tem um tipo primitivo e atribuindo a um tipo wrapper o Java se
 * encarrega de converter;
 * <p>
 * - Unboxing: é o inverso do autoboxing, ele atribui um tipo wrapper para um tipo primitivo;
 * <p>
 * - Com o unboxing, agora é possível acessar métodos utilitários, assim existindo
 * algumas possibilidades de extrair alguns tipos de dados de um wrapper;
 */
public class Aula107AutoboxingUnboxing {

	public static void main(String[] args) {
		// Tipos primitivos
		byte byteP = 1;
		short shortP = 1;
		int intP = 1;
		long longP = 10L;
		float floatP = 10F;
		double doubleP = 10D;
		char charP = 'B';
		boolean booleanP = true;

		// Classes wrapper / Autoboxing
		Byte byteW = 1;
		Short shortW = 1;
		Integer intW = 1;
		Long longW = 10L;
		Float floatW = 10F;
		Double doubleW = 10D;
		Character charW = 'B';
		Boolean booleanW = true;

		// Unboxing
		int numero = intW;
		int numero2 = intW.byteValue();

		Integer intW2 = Integer.parseInt("1");
		boolean verdadeiro = Boolean.parseBoolean("true");

		System.out.println("------ Wrapper 'Character' ---------\n");
		System.out.println("É um caracter 'A': " + Character.isDigit('A'));
		System.out.println("É um digito '9': " + Character.isDigit('9'));
		System.out.println("É uma letra ou número '!': " + Character.isLetterOrDigit('!'));
		System.out.println("É um upperCase 'a' : " + Character.isUpperCase('a'));
		System.out.println("É um lowerCase 'a' : " + Character.isLowerCase('a'));
		System.out.println("Trasforma para upperCase 'a' : " + Character.toUpperCase('a'));
		System.out.println("Trasforma para upperCase 'A' : " + Character.toLowerCase('a'));
	}

}
