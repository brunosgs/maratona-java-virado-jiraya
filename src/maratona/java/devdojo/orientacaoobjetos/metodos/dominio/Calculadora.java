package maratona.java.devdojo.orientacaoobjetos.metodos.dominio;

// Tipo de retorno do método é void, significa que ele não retorna nada.
public class Calculadora {
	public void somaDoisNumeros() {
		System.out.println(10 + 10);
	}

	public void subtraiDoisNumeros() {
		System.out.println(10 - 5);
	}

	public void multiplicaDoisNumeros(int numero1, int numero2) {
		System.out.println(numero1 * numero2);
	}

	public double divideDoisNumeros(double numero1, double numero2) {
		if (numero2 == 0) {
			return 0;
		}

		return numero1 / numero2;
	}

	public void imprimeDivisaoDeDoisNumeros(double numero1, double numero2) {
		if (numero2 == 0) {
			System.out.println("Não existe divisão por zero!");

			return; // Em um método void o return pode ser utilizado dessa forma
		}

		System.out.println(numero1 / numero2);
	}
}
