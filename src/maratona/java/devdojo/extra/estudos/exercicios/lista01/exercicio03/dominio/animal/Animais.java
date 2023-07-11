package maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.dominio.animal;

import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.interfaces.Animal;

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
