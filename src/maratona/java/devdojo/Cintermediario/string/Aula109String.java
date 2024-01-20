package maratona.java.devdojo.Cintermediario.string;

/**
 * - O método 'charAt', retorna o char baseado no indice;
 * <p>
 * - O método 'length()' verifica o tamanho da string, sendo ela uma array de char [0...n];
 * <p>
 * - O método 'replace("a", "b")', faz o match da string "a" e substitui pela string "b";
 * <p>
 * - O método 'substring', ele recebe dois valores, o índice inicial e final ou só o
 * inicial, o único porem é que o índice que termina é sempre 1 a menos do que esta sendo
 * passado, assim excluido não incluido o ultimo valor, exemplo a string "012345", se usado substring(0, 2) o
 * retorno será "01";
 * <p>
 * - O método 'trim' remove os espaços que são vazios no inicio e no final da string;
 */
public class Aula109String {

	public static void main(String[] args) {
		String nome = "Pedro";
		String numeros = "012345";
		String nomeEspaco = "  Capitulina   ";

		System.out.println(nome.charAt(0));
		System.out.println(nome.length());
		System.out.println(nome.replace("P", "C"));
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());

		System.out.println(numeros.length());
		System.out.println(numeros.substring(0, 2));
		System.out.println(numeros.substring(3, numeros.length()));
		System.out.println(numeros.length());

		System.out.println(nomeEspaco);
		System.out.println(nomeEspaco.trim());
	}
}
