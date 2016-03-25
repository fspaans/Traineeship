package nl.youngcapital.eersteproject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Babyleeftijden {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("In welk jaar ben je geboren?:");
		int jaar = s.nextInt();
		System.out.println("In welke maand ben je geboren? [1 t/m 12]:");
		int maand = s.nextInt();
		System.out.println("Op welke dag ben je geboren? [1 t/m 31]:");
		int dag = s.nextInt();
		
		LocalDate date = LocalDate.of(jaar, maand, dag);
		long ageyear = ChronoUnit.YEARS.between(date, LocalDate.now());
		long realagemonth = ChronoUnit.MONTHS.between(date, LocalDate.now());
		long realageweeks = ChronoUnit.WEEKS.between(date, LocalDate.now());
		long realagedays = ChronoUnit.DAYS.between(date, LocalDate.now());
		
		if (ageyear >= 18) {
			System.out.println("U bent " + ageyear + " jaar oud.");
		}
		else if (ageyear < 18 && ageyear >= 12) {
			System.out.println("Jij bent " + ageyear + " jaar oud.");
		}
		else if (ageyear < 12 && ageyear >= 4) {
			System.out.println(realagemonth%12);
			System.out.println("Jij bent " + ageyear + (((realagemonth % 12) >= 6) ? " en een half " : " ") + "jaar oud." );
		}
		else if(ageyear < 4 && ageyear >= 2) {
			System.out.println("Uw peuter is " + ageyear + " jaar en " + (realagemonth%12) + " maand(en) oud.");
		}
		else if (ageyear < 2 && realagemonth >= 3) {
			System.out.println("Uw dreumes is " + realagemonth + " maanden oud.");
		}
		else if (realagemonth < 3 && realagemonth >= 1) {
			System.out.println("Uw baby is " + realageweeks + " weken oud.");
		}
		else {
			System.out.println("Uw baby is " + realagedays + " dagen oud.");
		}
	}
}
