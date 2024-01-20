package maratona.java.devdojo.Aintroducao.estruturascodicionais;

/*
	-> idade < 15 categoria infantil
	-> idade >= 15 && idade < 18 categoria juvenil
	-> idade >= 18 categoria adulto
*/
public class Aula21ElseIf02 {

	public static void main(String[] args) {
		int idade = 14;
		String categoria;

		if (idade < 15) {
			categoria = "Categoria Infantil";
		} else if (idade >= 15 && idade < 18) {
			categoria = "Categoria Juvenil";
		} else {
			categoria = "Categoria Juvenil";
		}

		System.out.println(categoria);
	}

}
