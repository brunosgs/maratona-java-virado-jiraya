package maratona.java.devdojo.Davancado.designpatterns.builder.test;

import maratona.java.devdojo.Davancado.designpatterns.builder.dominio.Person;

/**
 * O Builder é um padrão de projeto criacional que permite a você construir
 * objetos complexos passo a passo. O padrão permite que você produza diferentes
 * tipos e representações de um objeto usando o mesmo código de construção.
 */
public class Aula246Builder {

	public static void main(String[] args) {
		Person person = new Person.PersonBuilder().firstName("João")
				.lastName("da Silva")
				.username("viradonojiraya")
				.build();

		System.out.println(person);
	}

}
