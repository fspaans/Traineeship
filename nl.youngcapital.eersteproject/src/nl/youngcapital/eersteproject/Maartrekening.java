package nl.youngcapital.eersteproject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Maartrekening {

	public static void main (String[] args) {
		LocalDate tm = LocalDate.of(1976, 3, 1).plusDays(999);
		System.out.println(tm + ": 1976-03-1000"); //duizend maart 1976
		
		long diff = ChronoUnit.DAYS.between(LocalDate.of(1976, 3, 1), LocalDate.now());
		System.out.println(LocalDate.now() + ": 1976-03-" + (diff+1));
	}
}
