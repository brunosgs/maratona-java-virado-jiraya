package maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.dominio.animal;

import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.dominio.orcamento.ItemOrcamentoComplexo;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.interfaces.AnimalOrcamento;

public abstract class Animais implements AnimalOrcamento {
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

	@Override
	public ItemOrcamentoComplexo orcamentoGastosAnimal() {
		return null;
	}

}
