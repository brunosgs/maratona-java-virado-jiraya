package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.internacionalizacao.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * - Para que a tradução tem seu funcionamento, as chaves dentro do arquivo
 * .properties devem ser iguais;
 * <p>
 * - Uma regra que ele toma relacionado a tradução seria que ao tentar localizar
 * o arquivo, exemplo: messages_fr_CA.properties, ele não localize, ai começa
 * uma cascata até achar o último arquivo de exemplo: messages.properties
 */
public class Aula130ResourceBundle {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());

		ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		// ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en",
		// "US"));

		String stringHello = bundle.getString("hello");
		String stringGoodMorning = bundle.getString("good.morning");

		System.out.println(stringHello);
		System.out.println(stringGoodMorning);

		/*
		 * Mesmo o bundle estar setado com o Locale("pt", "BR") ou Locale("en", "US")) e
		 * não possua a tradução adequada ele começa a tentativa de localizar o arquivo
		 * que possua a tradução.
		 */
		System.out.println(bundle.getString("hi"));
	}

}
