package maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio01.interfaces.util;

import maratona.java.devdojo.Gextra.estudos.exercicios.lista01.exercicio01.interfaces.Animal;

public interface Ferramentas {
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);

	public String[] classificaEspecies(Animal[] completo);
}
