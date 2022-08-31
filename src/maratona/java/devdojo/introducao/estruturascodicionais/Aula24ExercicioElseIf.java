package maratona.java.devdojo.introducao.estruturascodicionais;

public class Aula24ExercicioElseIf {

	public static void main(String[] args) {
		double salarioAnual = 70000;
		double aliquota1 = 9.70 / 100;
		double aliquota2 = 37.35 / 100;
		double aliquota3 = 49.50 / 100;
		double valorImposto;

		if (salarioAnual <= 34712) {
			valorImposto = salarioAnual * aliquota1;
		} else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
			valorImposto = salarioAnual * aliquota2;
		} else {
			valorImposto = salarioAnual * aliquota3;
		}

		System.out.println("O valor do imposto cobrado é R$" + valorImposto);
	}

}
