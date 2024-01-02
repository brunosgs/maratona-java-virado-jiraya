package maratona.java.devdojo.intermediario.excecoes.test;

/**
 * ERRORS<br>
 * - Erro acontece na JVM e não é recuperavel em tempo de execução;<br>
 * - Métodos recursivos deve sempre ter um limitador, chamadas infinitas podem ocasionar
 * erros e a JVM não consegue limpar a stack;
 */
public class Aula95StackOverflow {

	public static void main(String[] args) {
		recursividade();

	}

	public static void recursividade() {
		recursividade();
	}
}
