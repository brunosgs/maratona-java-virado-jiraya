package maratona.java.devdojo.intermediario.string;

/**
 * - Strings são imutáveis;
 * <p>
 * - Java trabalha com o String constant pool, onde existe um pool de Strings e essas são
 * retornadas caso já exista, se não existe no pool o Java se encarrega de criar.
 * <p>
 * - Strings no pool não tem possibilidade de alterar, cada variável criada vira uma referencia
 * para uma String que já existe no pool;
 * <p>
 * - Quando se fala em referencia, se fala em um local na mémoria heap e sua posição dentro da stack;
 * <p>
 * - No exemplo de comparação de nome == nome2, antes da coparação foi feito uma concatenação,
 * quando ao comparar ainda é 'true', porque? Ela continua verdadeiro porque agora no pool de strings
 * existe refencias para: "João", " Silva" e "João Silva", assim a comparação ainda é válida,
 * pois as variaveis 'nome' e 'nome2' estão referenciando a String "João";
 * <p>
 * - Quando criado um objeto do tipo new String("João"), ai é criado no heap um novo objeto então se
 * igualado nome == nome3 o retorno seria 'false', porque suas referencias são diferentes;
 */
public class Aula108String {

	public static void main(String[] args) {
		// String constant pool
		String nome = "João"; // String literal
		String nome2 = "João";

		// 1 - Cria uma variável de referencia, 2 - Cria um objeto, 3 - Uma string no pool
		String nome3 = new String("João");

		nome.concat(" Silva");
		// nome = nome.concat(" Silva"); Para esse situação mudaria a referencia da string para: "João Silva"

		// Resultados:
		System.out.println(nome == nome2);
		System.out.println(nome == nome3);

		/* Para esse caso, o nome3 chama o método intern() que verificou
		 * no pool de strings se exite uma String que se iguala a ele, se encontra
		 * referencia.
		 * */
		System.out.println(nome == nome3.intern());
	}

}
