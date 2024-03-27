package maratona.java.devdojo.Davancado.streams.test;

import java.util.ArrayList;
import java.util.List;

import maratona.java.devdojo.Davancado.streams.dominio.LightNovel;

/**
 * - A lista e o stream possuem o método forEach() mas é uma prática ruim
 * utilizar a chamada de stream e depois a chamada de um forEach(), seria um uso
 * de recurso desnecessário para fazer uma ação igual, caso queira fazer uma
 * ação simples como o imprimir, utilizar a chamada direto da lista;
 * <p>
 * - O distinct pode haver problemas caso o equals e o hashCode não estejam
 * declarados no objeto, ele pode não funcionar corretamente;
 */
public class Aula205Streams {
	private static List<LightNovel> listLightNovel = new ArrayList<>(
			List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 3.99),
					new LightNovel("Violet Evergarden", 5.99), new LightNovel("No Game no life", 2.99),
					new LightNovel("Fullmetal Alchemist", 5.99), new LightNovel("Kugo desuga", 1.99),
					new LightNovel("Kugo desuga", 1.99), new LightNovel("Monogatari", 4.99)));

	public static void main(String[] args) {
		listLightNovel.forEach(System.out::println);

		long count = listLightNovel.stream()
				.distinct()
				.filter(ln -> ln.getPrice() <= 4)
				.count();

		System.out.println(count);
	}

}
