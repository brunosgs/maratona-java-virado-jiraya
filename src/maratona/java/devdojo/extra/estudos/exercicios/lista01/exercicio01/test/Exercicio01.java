package maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.test;

import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.dominio.Cachorro;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.dominio.Cavalo;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.dominio.Gato;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.dominio.Resultado;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.interfaces.Animal;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.servicos.ConsultaAnimais;
import maratona.java.devdojo.extra.estudos.exercicios.lista01.exercicio01.servicos.Relatorio;

public class Exercicio01 {

	public static void main(String[] args) {
		Animal[] animais = { new Cachorro("Akita", "C. l. familiaris"), new Gato("Siamês", "Felis catus"),
				new Cachorro("Akita", "C. l. familiaris"), new Cavalo("Mangalarga", "Equus ferus"),
				new Gato("Siamês", "Felis catus"), new Cachorro("Akita", "C. l. familiaris"),
				new Gato("Angorá", "Felis catus"), new Gato("Angorá", "Felis catus"),
				new Cachorro("Pug", "C. l. familiaris"), new Gato("Sphynx", "Felis catus") };

		Resultado[] quantidadeEspecies = Relatorio.quantidadeEspecies(animais, new ConsultaAnimais());

		System.out.println("Espécie / Quantidade");

		for (Resultado resultado : quantidadeEspecies) {
			System.out.println(resultado.getNomeEspecie() + " / " + resultado.getQuantidade());
		}
	}

}
