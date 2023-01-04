package extra.estudos.exercicios.lista01.exercicio02.dominio;

import extra.estudos.exercicios.lista01.exercicio02.interfaces.Orcamento;

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
