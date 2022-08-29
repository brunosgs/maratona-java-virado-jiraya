package maratona.java.devdojo.introducao.estruturascodicionais;

public class Aula21ElseIf01 {

	public static void main(String[] args) {
		int idade = 15;
		boolean isAutorizadoComprarBebida = idade >= 18;

		if (isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcólica!");
		} else {
			System.out.println("Não autorizado a comprar bebida alcólica!");
		}
	}

}
