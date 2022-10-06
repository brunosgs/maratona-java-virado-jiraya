package extra.estudos.exercicios.lista01.exercicio01.interfaces.util;

import extra.estudos.exercicios.lista01.exercicio01.interfaces.Animal;

public interface Ferramentas {
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);

	public String[] classificaEspecies(Animal[] completo);
}
