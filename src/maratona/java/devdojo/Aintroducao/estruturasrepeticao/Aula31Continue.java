package maratona.java.devdojo.Aintroducao.estruturasrepeticao;

public class Aula31Continue {

	public static void main(String[] args) {
		double valorCarro = 30000;
		double parcelaMin = 1000;
		double valorParcela = 0;

		for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
			valorParcela = valorCarro / parcela;

			if (valorParcela < parcelaMin) {
				continue;
			}

			System.out.println("Parcela " + parcela + " no valor de R$" + valorParcela);
		}

	}

}
