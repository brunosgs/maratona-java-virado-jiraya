package maratona.java.devdojo.Ejdbc.dominio;

import java.util.Objects;

public class Producer {
	Long id;
	String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private Producer(ProducerBuilder producerBuilder) {
		this.id = producerBuilder.id;
		this.name = producerBuilder.name;
	}

	public static ProducerBuilder builder() {
		return new ProducerBuilder();
	}

	public static final class ProducerBuilder {
		private Long id;
		private String name;

		private ProducerBuilder() {
		}

		private ProducerBuilder(Producer producer) {
			this.id = producer.id;
			this.name = producer.name;
		}

		public ProducerBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public ProducerBuilder name(String name) {
			this.name = name;
			return this;
		}

		public Producer build() {
			return new Producer(this);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
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
		Producer other = (Producer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Producer [id=" + id + ", name=" + name + "]";
	}

}
