package maratona.java.devdojo.Ejdbc.dominio;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
	Long id;
	String name;
	LocalDateTime dateTo;
}
