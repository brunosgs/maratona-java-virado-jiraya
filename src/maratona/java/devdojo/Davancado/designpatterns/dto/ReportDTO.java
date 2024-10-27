package maratona.java.devdojo.Davancado.designpatterns.dto;

import maratona.java.devdojo.Davancado.designpatterns.factory.enums.Country;
import maratona.java.devdojo.Davancado.designpatterns.factory.interfaces.Currency;

public class ReportDTO {
	private String aircraftName;
	private Country country;
	private Currency currency;
	private String personName;

	private ReportDTO(ReportDTOBuilder reportDTOBuilder) {
		this.aircraftName = reportDTOBuilder.aircraftName;
		this.country = reportDTOBuilder.country;
		this.currency = reportDTOBuilder.currency;
		this.personName = reportDTOBuilder.personName;
	}

	@Override
	public String toString() {
		return "ReportDTO [aircraftName=" + aircraftName + ", country=" + country + ", currency=" + currency.getSymbol()
				+ ", personName=" + personName + "]";
	}

	public static final class ReportDTOBuilder {
		private String aircraftName;
		private Country country;
		private Currency currency;
		private String personName;

		private ReportDTOBuilder() {
		}

		public static ReportDTOBuilder builder() {
			return new ReportDTOBuilder();
		}

		public ReportDTOBuilder aircraftName(String aircraftName) {
			this.aircraftName = aircraftName;

			return this;
		}

		public ReportDTOBuilder country(Country country) {
			this.country = country;

			return this;
		}

		public ReportDTOBuilder currency(Currency currency) {
			this.currency = currency;

			return this;
		}

		public ReportDTOBuilder personName(String personName) {
			this.personName = personName;

			return this;
		}

		public ReportDTO build() {
			return new ReportDTO(this);
		}
	}

}
