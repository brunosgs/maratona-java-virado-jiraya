package maratona.java.devdojo.Cintermediario.wrapper.test;

/**
 * - Wrapper são objetos que encapsulam os tipos primitivos;
 * <p>
 * -  Foram criados para ser utilizado como passagem de parâmetros por referência e,
 * porque as estruturas de dados, ArrayList, List, Collections não trabalham com tipos
 * primitivos, exemplo: List<'int'>ou ArrayList<'double'>;
 */
public class Aula106Wrapper {

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

		// Classes wrapper
		Byte byteW = 1;
		Short shortW = 1;
		Integer intW = 1;
		Long longW = 10L;
		Float floatW = 10F;
		Double doubleW = 10D;
		Character charW = 'B';
		Boolean booleanW = true;
	}

}
