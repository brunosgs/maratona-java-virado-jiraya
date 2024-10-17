package maratona.java.devdojo.Davancado.concorrencia.dominio;

public class Discount {

	public enum Code {
		NONE(0),
		SUPER_SAYAJIN(5),
		SUPER_SAYAJIN_2(10),
		SUPER_SAYAJIN_3(15);

		private final int percentage;

		private Code(int percentage) {
			this.percentage = percentage;
		}

		public int getPercentage() {
			return percentage;
		}

	}
}
