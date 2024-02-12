package maratona.java.devdojo.Cintermediario.serialization.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

/**
 * - Um atributo 'transient' significa que ele não será serializado ou
 * desserializado juntamente com os demais atributos de um determinado objeto.
 * <p>
 * - Atibutos estáticos não são serializados, eles pertecem a classe não ao
 * objeto;
 * <p>
 * - Em caso onde não se tem acesso ao código de terceiros e precisa se
 * serializar algo ou desserializar, se utiliza o 'transient' e depois os
 * métodos de exemplo para read e write;
 */
public class Aluno implements Serializable {
	private static final long serialVersionUID = -139617710664368947L;
	private Long id;
	private String nome;
	private transient String password;
	private transient Turma turma;
	private static final String NOME_ESCOLA = "DevDojo";

	public Aluno(Long id, String nome, String password) {
		System.out.println("Contrutor Aluno");
		this.id = id;
		this.nome = nome;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Turma getTuma() {
		return turma;
	}

	public void setTuma(Turma turma) {
		this.turma = turma;
	}

	@Serial
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeUTF(turma.getNome());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Serial
	private void readObject(ObjectInputStream ois) {
		try {
			// Para que seja feita a leitura, deve ser na mesma ordem que foi escrito.
			ois.defaultReadObject();

			String nomeTurma = ois.readUTF();
			turma = new Turma(nomeTurma);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", password=" + password + ", NOME_ESCOLA=" + NOME_ESCOLA
				+ ", turma=" + turma + "]";
	}

}
