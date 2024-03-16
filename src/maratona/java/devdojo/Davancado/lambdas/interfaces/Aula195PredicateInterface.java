package maratona.java.devdojo.Davancado.lambdas.interfaces;

import maratona.java.devdojo.Davancado.comportamento.dominio.Car;

/**
 * - Para que as lambdas funcionem ela precisa que obrigatoriamente a interface
 * seja funcional, que seria a anotação '@FunctionalInterface';
 * <p>
 * - Ela permite um único método, caso tente criar outro não sera possível;
 * <p>
 * - O método que existe na interface diz tudo como a lambda deve se comportar;
 * <p>
 * - Lambdas são anonimas, funções e o objetivo é deixar o código mais conciso;
 */

@FunctionalInterface
public interface Aula195PredicateInterface {
	// functional descriptor
	boolean test(Car car);
}
