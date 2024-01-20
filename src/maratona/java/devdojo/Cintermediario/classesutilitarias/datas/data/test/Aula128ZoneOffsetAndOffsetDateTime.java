package maratona.java.devdojo.Cintermediario.classesutilitarias.datas.data.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * - Para situações onde se possui o horário mas não existe a Zona, existe o
 * 'ZoneOffset', com ele é possível setar uma a quantidade mas não a Zona em si;
 * <p>
 * - Com a java.time é possível trabalhar com outros calendários, como por
 * exemplo o calendário japonês;
 */
public class Aula128ZoneOffsetAndOffsetDateTime {

	public static void main(String[] args) {
		ZoneOffset min = ZoneOffset.MIN;
		ZoneOffset max = ZoneOffset.MAX;
		ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");

		LocalDateTime now = LocalDateTime.now();

		OffsetDateTime atOffsetManaus = now.atOffset(zoneOffsetManaus);
		OffsetDateTime ofOffsetManaus = OffsetDateTime.of(now, zoneOffsetManaus);

		Instant instantNowZoneOffset = now.atOffset(zoneOffsetManaus).toInstant();
		LocalDateTime localDateTimeNowZoneOffset = now.atOffset(zoneOffsetManaus).toLocalDateTime();

		System.out.println("Zonas mínimas e máximas: " + min + " / " + max);
		System.out.println("Aplicado offset sem a Zona com 'at': " + atOffsetManaus);
		System.out.println("Aplicado offset sem a Zona com 'of': " + ofOffsetManaus);
		System.out.println("Instant já aplicado o offset ao horário: " + instantNowZoneOffset);
		System.out.println("LocalDateTime com o offset mas não aplicado a horário: " + localDateTimeNowZoneOffset);

	}

}
