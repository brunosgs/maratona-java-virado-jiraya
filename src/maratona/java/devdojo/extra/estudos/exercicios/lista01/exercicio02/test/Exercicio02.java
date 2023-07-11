package maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio02.test;

import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio02.dominio.ItemOrcamento;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio02.dominio.ItemOrcamentoComplexo;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio02.interfaces.Orcamento;

public class Exercicio02 {

	public static void main(String[] args) {

		Orcamento[] itens = { new ItemOrcamento("Item", 22), new ItemOrcamentoComplexo("Item Complexo", 10),
				new ItemOrcamento("Item 2", 236.36f) };

		ItemOrcamentoComplexo itemOrcamentoComplexo = new ItemOrcamentoComplexo(itens);

		System.out.println(itemOrcamentoComplexo.getValor());
		System.out.println(itemOrcamentoComplexo.encontraItem("Item"));
	}

}
