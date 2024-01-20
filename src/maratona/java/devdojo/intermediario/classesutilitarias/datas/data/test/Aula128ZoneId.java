package maratona.java.devdojo.intermediario.classesutilitarias.datas.data.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Map.Entry;

/**
 * - Existe duas diferenças ao se trabalhar com 'LocalDateTime' e 'Instant', a
 * LocalDateTime traz a zona no final da data mas não aplicada ao horário. Já a
 * Instant aplica a zona ao horário;
 */
public class Aula128ZoneId {

	public static void main(String[] args) {
		Map<String, String> shortIds = ZoneId.SHORT_IDS;
		ZoneId zoneIdOfTokyo = ZoneId.of("Asia/Tokyo");

		LocalDateTime now = LocalDateTime.now();
		ZonedDateTime atZoneLocalDateTime = now.atZone(zoneIdOfTokyo);

		Instant instantNow = Instant.now();
		ZonedDateTime atZoneInstant = instantNow.atZone(zoneIdOfTokyo);

		System.out.println("ZonaId padrão do sistema: " + ZoneId.systemDefault());
		System.out.println("ZonaId Tokyo: " + zoneIdOfTokyo);
		System.out.println("Horário com ZonaId em uma LocalDateTime: " + atZoneLocalDateTime);
		System.out.println("Horário com ZonaId em uma Instant: " + atZoneInstant);
		System.out.print("\n");

		for (Entry<String, String> id : shortIds.entrySet()) {
			System.out.println(id.getKey() + " / " + id.getValue());
		}
	}

}
