package maratona.java.devdojo.orientacaoobjetos.modificadorfinal.dominio;

/*
	- Quando denifido uma classe como final, a mesma não pode ser
	herdada (estendida)	por outra classe.

	OBS: Ficara redundante caso tente denifir um método como 'final' em uma classe 'final',
	pois se a classe é 'final' indica que não será estendida por nenhuma outra classe e assim
	não podendo sobrescrever nenhum método.
*/
public final class Carro02 {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
