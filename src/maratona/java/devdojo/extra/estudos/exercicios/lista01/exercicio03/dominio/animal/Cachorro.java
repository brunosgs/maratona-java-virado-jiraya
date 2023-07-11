package maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.dominio.animal;

import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.dominio.orcamento.ItemOrcamentoComplexo;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio03.interfaces.AnimalOrcamento;

public class Cachorro extends Animais implements AnimalOrcamento {

	public Cachorro(String nome, String especie) {
		super(nome, especie);
	}

	@Override
	public ItemOrcamentoComplexo orcamentoGastosAnimal() {
		// TODO Auto-generated method stub
		return null;
	}
}




