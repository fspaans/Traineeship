package nl.fs.klok;

import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class BabyLeeftijden {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LocalDate gebJaar = null;
		LocalDate dateNow = LocalDate.now();
		int jaar;
		int maand;
		int dag;
		System.out.println("Wat is het geboorte jaar?");
		jaar = Integer.valueOf(s.next());
		System.out.println("Wat is het geboorte maand?");
		maand = Integer.valueOf(s.next());
		System.out.println("Wat is het geboorte dag?");
		dag = Integer.valueOf(s.next());
		gebJaar = gebJaar.of(jaar,maand,dag);
		System.out.println(gebJaar.plusDays(1000));
		
	}
}
