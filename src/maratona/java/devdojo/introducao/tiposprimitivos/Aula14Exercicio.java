package maratona.java.devdojo.introducao.tiposprimitivos;

/*
 	Exercício de tipos primitivos:

 	Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem: "Eu <nome>, morando
 	no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>"
 */
public class Aula14Exercicio {

	public static void main(String[] args) {
		String nome = "Bruno Gomes";
		String endereco = "Rua logo ali";
		double salario = 2000.02D;
		String dataRecebimentoSalario = "26/08/2022";

		System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de "
				+ salario + ", na data " + dataRecebimentoSalario);
	}

}
