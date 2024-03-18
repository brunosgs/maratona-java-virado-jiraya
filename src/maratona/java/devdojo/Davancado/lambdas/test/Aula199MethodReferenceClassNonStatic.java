package maratona.java.devdojo.Davancado.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * - Utilizando a classe para referenciar o método não estático ou estático;
 */
public class Aula199MethodReferenceClassNonStatic {

	public static void main(String[] args) {
		List<String> listName = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));

		listName.sort(String::compareTo);
		System.out.println(listName);

		Function<String, Integer> numStringToInteger = Integer::parseInt;
		Integer apply = numStringToInteger.apply("15");

		System.out.println(apply);

		BiPredicate<List<String>, String> checkName = List::contains;
		System.out.println(checkName.test(listName, "Rimuru"));
	}

}
