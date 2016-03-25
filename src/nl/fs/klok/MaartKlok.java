package nl.fs.klok;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class MaartKlok{
	
	
	public static void main(String[] args) {
		LocalDate startDag = LocalDate.of(1976, 3, 1).minusDays(1);
		LocalDate nuTijd = LocalDate.now();

		System.out.println(ChronoUnit.DAYS.between(startDag, nuTijd));
		System.out.println("1000 Maart was op: "+startDag.plusDays(1000));
		
	}
	
}