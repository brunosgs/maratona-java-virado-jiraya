package maratona.java.devdojo.Cintermediario.excecoes.exception.dominio;

public class Funcionario extends Pessoa {

	@Override
	public void salvar() {
		System.out.println("Salvando Funcionario");
	}
}
