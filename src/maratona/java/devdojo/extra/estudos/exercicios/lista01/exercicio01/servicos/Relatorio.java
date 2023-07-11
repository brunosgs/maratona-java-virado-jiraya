package maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.servicos;

import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.dominio.Resultado;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.interfaces.Animal;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.interfaces.util.Ferramentas;

public class Relatorio {
	public static Resultado[] quantidadeEspecies(Animal[] animais, Ferramentas ferramenta) {
		Resultado[] resultados;
		String[] classificaEspecies = ferramenta.classificaEspecies(animais);

		resultados = new Resultado[classificaEspecies.length];

		for (int i = 0; i < classificaEspecies.length; i++) {
			Animal[] filtraEspecie = ferramenta.filtraEspecie(animais, classificaEspecies[i]);

			resultados[i] = new Resultado(filtraEspecie[0].getNomeEspecie(), filtraEspecie.length);
		}

		return resultados;
	}
}
