package maratona.java.devdojo.Fcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Anime {
	Long id;
	String name;
	int episodeos;
	Producer producer;
}
