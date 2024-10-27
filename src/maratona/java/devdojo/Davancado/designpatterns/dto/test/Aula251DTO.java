package maratona.java.devdojo.Davancado.designpatterns.dto.test;

import maratona.java.devdojo.Davancado.designpatterns.builder.dominio.Person;
import maratona.java.devdojo.Davancado.designpatterns.dto.ReportDTO;
import maratona.java.devdojo.Davancado.designpatterns.factory.dominio.CurrencyFactory;
import maratona.java.devdojo.Davancado.designpatterns.factory.enums.Country;
import maratona.java.devdojo.Davancado.designpatterns.factory.interfaces.Currency;
import maratona.java.devdojo.Davancado.designpatterns.singleton.domain.Aircraft;

public class Aula251DTO {

	public static void main(String[] args) {
		Aircraft aircraft = new Aircraft("777");
		Country country = Country.BRAZIL;
		Currency newCurrency = CurrencyFactory.newCurrency(country);
		Person person = new Person.PersonBuilder().firstName("João")
				.lastName(" da silva")
				.build();

		ReportDTO reportDTO = ReportDTO.ReportDTOBuilder.builder()
				.aircraftName(aircraft.getName())
				.country(country)
				.currency(newCurrency)
				.personName(person.getFirstName())
				.build();

		System.out.println(reportDTO);
	}

}
