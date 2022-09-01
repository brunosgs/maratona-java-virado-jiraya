package maratona.java.devdojo.introducao.estruturasrepeticao;

/* Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado,
sendo que o valor minimo da parcela seja R$1000,00.
*/
public class Aula30ExercicioBreak {

	public static void main(String[] args) {
		double valorCarro = 30000;
		double parcelaMin = 1000;
		double valorParcela = 0;

		for (int parcela = 1; parcela <= valorCarro; parcela++) {
			valorParcela = valorCarro / parcela;

			if (valorParcela < parcelaMin) {
				break;
			}

			System.out.println("Parcela " + parcela + " no valor de R$" + valorParcela);
		}
	}

}
