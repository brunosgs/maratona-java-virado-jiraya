package maratona.java.devdojo.Davancado.colecoes.dominio;

public class Carro {
	private String serialNumber;
	private String marca;

	public Carro(String serialNumber, String marca) {
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [serialNumber=" + serialNumber + ", marca=" + marca + "]";
	}

	/**
	 * Regras para implementação:
	 * <p>
	 * - Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de
	 * null;
	 * <p>
	 * - Simétrico: para x e y diferente de null, se x.equals(y) == true logo,
	 * y.equals(x) == true;
	 * <p>
	 * - Transitividade: para x, y e z diferentes de null, se x.equals(y) == true e
	 * x.equals(z) == true, logo y.equals(z) == true;
	 * <p>
	 * - Consistente: x.equals(x) sempre retorna true se x for diferente de null;
	 * <p>
	 * - Para x diferente de null, x.equals(null) tem que retornar false.
	 *
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		Carro carro = (Carro) obj;

		return serialNumber != null && serialNumber.equals(carro.serialNumber);
	}

	/**
	 * Regras para hashCode
	 * <p>
	 * - Se x.equals(y) == true, o y.hashCode() == x.hashCode() tem que ser iguais;
	 * <p>
	 * - y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x)
	 * tem que ser true;
	 * <p>
	 * - x.equals(y) == false o hashCode tem que ser diferente;
	 * <p>
	 * - Se y.hashCode() != x.hashCode(), y.equals(x) deverá ser false;
	 */
	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}

}
