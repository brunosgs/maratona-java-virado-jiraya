package maratona.java.devdojo.Aintroducao.estruturascodicionais;

public class Aula20If {

	public static void main(String[] args) {
		int idade = 15;
		boolean isAutorizadoComprarBebida = idade >= 18;

		if (isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcólica!");
		}

		// A forma de leitura disso seria, "Se não é autorizado a comprar bebida então faça" que é igual a "!isAutorizadoComprarBebida"
		if (!isAutorizadoComprarBebida) {
			System.out.println("Não autorizado a comprar bebida alcólica!");
		}
	}

}