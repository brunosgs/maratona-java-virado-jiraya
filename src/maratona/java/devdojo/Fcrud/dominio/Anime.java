package maratona.java.devdojo.Fcrud.dominio;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Anime {
	Long id;
	String name;
	int episodeos;
	LocalDateTime dateTo;
	Producer producer;
}
