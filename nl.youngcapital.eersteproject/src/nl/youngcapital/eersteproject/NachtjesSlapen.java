package nl.youngcapital.eersteproject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NachtjesSlapen {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welke maand ben je jarig? [1 t/m 12]:");
		int maand = s.nextInt();
		System.out.println("Welke dag ben je jarig? [1 t/m 31]:");
		int dag = s.nextInt();
		LocalDate date = LocalDate.of(LocalDate.now().getYear(), maand, dag);
		
		long days = ChronoUnit.DAYS.between(LocalDate.now(), date);
		
		System.out.println("Nog " + ((days < 0) ? (days+365) : days) + " nachtje(s) slapen!");
		System.out.println("Uw verjaardag valt op een: " + ((days < 0) ? LocalDate.of(LocalDate.now().getYear()+1, maand, dag).getDayOfWeek() : date.getDayOfWeek()));
		s.close();
	}
}
