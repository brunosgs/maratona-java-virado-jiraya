package maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.servicos;

import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.interfaces.Animal;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.interfaces.util.Ferramentas;

public class ConsultaAnimais implements Ferramentas {

	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		Animal[] animais;
		int totalLocalizado = 0;

		for (Animal animal : completo) {
			if (animal.getNomeEspecie().equals(especieFiltrar)) {
				totalLocalizado++;
			}
		}

		if (totalLocalizado == 0) {
			return new Animal[] {};
		}

		animais = new Animal[totalLocalizado];
		totalLocalizado = 0;

		for (int i = 0; i < completo.length; i++) {
			if (completo[i].getNomeEspecie().equals(especieFiltrar)) {
				animais[totalLocalizado] = completo[i];

				totalLocalizado++;
			}
		}

		return animais;
	}

	@Override
	public String[] classificaEspecies(Animal[] completo) {
		if (completo.length == 0 || completo == null) {
			return new String[] {};
		}

		String[] nomeEspecies = new String[completo.length];
		String[] nomeEspeciesResult;
		int totalNomeEspecies = 0;
		int ocorrencias = 0;

		nomeEspecies[0] = completo[0].getNomeEspecie();

		for (int i = 0; i < completo.length; i++) {
			ocorrencias = 0;

			for (int j = 0; j < nomeEspecies.length; j++) {
				if (nomeEspecies[j] == null) {
					continue;
				}

				if (nomeEspecies[j].equals(completo[i].getNomeEspecie())) {
					ocorrencias++;
				}
			}

			if (ocorrencias < 1) {
				nomeEspecies[i] = completo[i].getNomeEspecie();
			}
		}

		for (String nomeEspecie : nomeEspecies) {
			if (nomeEspecie != null) {
				totalNomeEspecies++;
			}
		}

		if (totalNomeEspecies == 0) {
			return new String[] {};
		}

		nomeEspeciesResult = new String[totalNomeEspecies];
		totalNomeEspecies = 0;

		for (String nome : nomeEspecies) {
			if (nome != null) {
				nomeEspeciesResult[totalNomeEspecies] = nome;

				totalNomeEspecies++;
			}
		}

		return nomeEspeciesResult;
	}

}
