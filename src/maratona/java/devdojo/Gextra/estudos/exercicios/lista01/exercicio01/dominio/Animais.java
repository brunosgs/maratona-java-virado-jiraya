package maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio01.dominio;

import maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio01.interfaces.Animal;

public abstract class Animais implements Animal {
	private String nome;
	private String especie;

	public Animais(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
	}

	@Override
	public String getNomeEspecie() {
		return this.especie;
	}

	@Override
	public String getNomeAnimal() {
		return this.nome;
	}

}
