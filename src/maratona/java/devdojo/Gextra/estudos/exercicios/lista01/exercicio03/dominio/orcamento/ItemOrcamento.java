package maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio03.dominio.orcamento;

import maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio03.interfaces.Orcamento;

public class ItemOrcamento implements Orcamento {
	private String historico;
	protected float valor;

	public ItemOrcamento() {
	}

	public ItemOrcamento(String historico, float valor) {
		this.historico = historico;
		this.valor = valor;
	}

	@Override
	public String getHistorico() {
		return historico;
	}

	public float getValor() {
		return valor;
	}

	@Override
	public Orcamento encontraItem(String historicoFiltrar) {
		return null;
	}

	@Override
	public String toString() {
		return "ItemOrcamento [historico=" + historico + "]";
	}


}
