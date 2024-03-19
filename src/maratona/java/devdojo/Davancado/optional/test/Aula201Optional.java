package maratona.java.devdojo.Davancado.optional.test;

import java.util.List;
import java.util.Optional;

/**
 * - A classe 'Optional' foi introduzida no Java 8. Ela serve para se tratar
 * retornos que possa existir ou não = null;
 */
public class Aula201Optional {

	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Teste de string"); // Caso não o retorno seja null retorna erro
		Optional<String> optionalNull = Optional.ofNullable(null); // Encapsula em uma Optional
		Optional<String> optionalEmpty = Optional.empty(); // Retorna um Optional null

		System.out.println(optional);
		System.out.println(optionalNull);
		System.out.println(optionalEmpty);
		System.out.println(" ------------ x ------------ ");

		Optional<String> name = findName("pedro");

		String orElse = name.orElse("Está null");
		System.out.println(orElse);

		name.ifPresent(s -> System.out.println(s.toUpperCase()));

	}

	private static Optional<String> findName(String name) {
		List<String> listName = List.of("Pedro", "DevDojo");

		int i = listName.indexOf(name);

		if (i != -1) {
			return Optional.of(listName.get(i));
		}

		return Optional.empty();
	}

}
