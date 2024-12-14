package maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio03.dominio.orcamento;

import maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio03.interfaces.Orcamento;

public class ItemOrcamentoComplexo extends ItemOrcamento {
	private Orcamento[] itensOrcamento;

	public ItemOrcamentoComplexo() {
	}

	public ItemOrcamentoComplexo(String historico, float valor) {
		super(historico, valor);
	}

	public ItemOrcamentoComplexo(Orcamento[] itensOrcamento) {
		this.itensOrcamento = itensOrcamento;
	}

	@Override
	public float getValor() {
		float sum = 0f;

		for (Orcamento orcamento : itensOrcamento) {
			sum += ((ItemOrcamento) orcamento).valor;
		}

		return sum;
	}

	@Override
	public Orcamento encontraItem(String historicoFiltrar) {
		if (this.itensOrcamento == null && this.itensOrcamento.length < 0) {
			return null;
		}

		for (Orcamento item : itensOrcamento) {
			if (item.getHistorico().equals(historicoFiltrar)) {
				return item;
			}
		}

		return null;
	}

	@Override
	public String toString() {
		return "ItemOrcamentoComplexo [getHistorico()=" + getHistorico() + "]";
	}

}
