package maratona.java.devdojo.orientacaoobjetos.interfases.dominio;

/*
	- Uma classe pode implementar mais de uma interface.
*/
public class DatabaseLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("Carregando dados do banco de dados...");
	}

	@Override
	public void remove() {
		System.out.println("Removendo do banco de dados...");
	}

	@Override
	public void checkPermission() {
		System.out.println("Checando permissões no banco de dados...");
	}


	public static void retrieveMaxDateSize() {
		System.out.println("Método retrieveMaxDateSize estático na classe DatabaseLoader...");
	}
}
