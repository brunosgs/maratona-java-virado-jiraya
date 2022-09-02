package maratona.java.devdojo.introducao.arrays;

/* Padrão de inicialização de um tipo primitivo que não esteja em um escopo local:
 	-> byte, short, int, long, float e double = 0
 	-> char = '\u0000' que é igual a valor vazio
 	-> boolean = false
 	-> String = null
*/
public class Aula33Arrays02 {

	public static void main(String[] args) {
		String[] nomes = new String[3];

		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
	}

}
