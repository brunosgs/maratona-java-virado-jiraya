package maratona.java.devdojo.introducao.estruturascodicionais;

public class Aula22OperadorTernario {

	public static void main(String[] args) {
		double salario = 6000;
		String resultado = salario > 5000 ? "Doação para a institução realizada com sucesso!"
				: "Não é possível fazer a doação";

		// Não aconselhado agrupar ternários
		int idade = 18;
		String categoria = idade < 15 ? "Categoria Infantil"
				: idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Juvenil";

		System.out.println(resultado);
		System.out.println(categoria);
	}

}
