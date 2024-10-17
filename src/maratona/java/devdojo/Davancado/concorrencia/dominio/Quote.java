package maratona.java.devdojo.Davancado.concorrencia.dominio;

import maratona.java.devdojo.Davancado.concorrencia.dominio.Discount.Code;

public final class Quote {
	private final String store;
	private final double price;
	private final Discount.Code dicountCode;

	private Quote(String store, double price, Code dicountCode) {
		this.store = store;
		this.price = price;
		this.dicountCode = dicountCode;
	}

	public String getStore() {
		return store;
	}

	public double getPrice() {
		return price;
	}

	public Discount.Code getDicountCode() {
		return dicountCode;
	}

	/**
	 * Creates new Quote object from the value following tha pattern
	 * storeName:price:discountCode
	 *
	 * @param value containing storeName:price:discountCode
	 * @return new Quote with values from @param value
	 */
	public static Quote newQuote(String value) {
		String[] values = value.split(":");

		return new Quote(values[0], Double.parseDouble(values[1].replace(',', '.')), Discount.Code.valueOf(values[2]));
	}

	@Override
	public String toString() {
		return "Quote [store=" + store + ", price=" + price + ", dicountCode=" + dicountCode + "]";
	}

}
