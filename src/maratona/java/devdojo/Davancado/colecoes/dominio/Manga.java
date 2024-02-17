package maratona.java.devdojo.Davancado.colecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
	private Long id;
	private String nome;
	private double preco;

	public Manga(Long id, String nome, double preco) {
		Objects.requireNonNull(id, "Id não pode ser nulo");
		Objects.requireNonNull(nome, "Nome não pode ser nulo");
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Manga other = (Manga) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}

	/**
	 * - Retorna negativo se o 'this' for menor que o 'other';
	 * <p>
	 * - Se 'this' == 'other', retorna 0;
	 * <p>
	 * - Se 'this' > 'other' retorna 1;
	 * <p>
	 * - As classe Wrappers possuem um compareTo(), esse código pode ser diminuido
	 * chamanda o campareTo de id. Só não é possível fazer com valores primitivos,
	 * para vales primitivos tem que usar ternicas para alcançar o objetivo;
	 */
	@Override
	public int compareTo(Manga other) {
		/**
		 * - Exemplo de como seria sem utilizar o campareTo das classes
		 * <p>
		 * if (this.id < other.getId()) { return -1; } if
		 * (this.id.equals(other.getId())) { return 0; }
		 *
		 * return 1;
		 */

		/**
		 * - Formas de se comparar o preço que é um atributo primitivo:
		 * <p>
		 * 1: return Double.valueOf(preco).compareTo(other.getPreco()); esse exemplo, o
		 * compareTo chama compare.
		 * <p>
		 * 2: return Double.compare(preco, other.getPreco());
		 */
		//return Double.compare(preco, other.getPreco());
		return this.id.compareTo(other.getId());
	}

}
