package maratona.java.devdojo.orientacaoobjetos.interfases.dominio;

/*
	- Interface é um contrato, para que classes que implementem a interface	tenham que
	criar no seu escopo o método proposto;
	- Todos métodos de uma interface implicitamente são definidos como 'public abstract'
	por isso é redundante definir isso no método;
	- É possível implementar um 'default methods'. Um método de interface que possui
	uma implementação e pode ser usado em outras classes que estendem a interface e não
	o implentaram;
	- É possível adicionar atributos a interface e todos os atributos são definidos como
	constantes;
	- Métodos estaticos nunca vão ser sobrescritos porque eles pertencem a interface.
*/
public interface DataLoader {
	public static final int MAX_DATA_SIZE = 10;

	void load();

	default void checkPermission() {
		System.out.println("Fazendo checagem de permissões...");
	}

	public static void retrieveMaxDateSize() {
		System.out.println("Método retrieveMaxDateSize estático na interface DataLoader...");
	}
}
