package nl.youngcapital.eersteproject;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class KalenderTabel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een jaar in:");
		int jaar = s.nextInt();
		System.out.println("Voer een maand in [1 t/m 12]:");
		int maand = s.nextInt();
		Month m = Month.of(maand);
		
		System.out.println(m.toString() + " " + jaar);
		System.out.println("Su Mo Tu We Th Fr Sa");
		
		LocalDate d = LocalDate.of(jaar, maand, 1);
		String str = "";
		switch(d.getDayOfWeek().toString()) {
		case "SUNDAY": str = " 1 "; break;
		case "MONDAY": str = "    1 "; break;
		case "TUESDAY": str = "       1 "; break;
		case "WEDNESDAY": str = "          1 "; break;
		case "THURSDAY": str = "             1 "; break;
		case "FRIDAY": str = "                1 "; break;
		case "SATURDAY": str = "                   1\n"; break;
		}
		
		int length = m.length(d.isLeapYear());
		for (int i = 2; i <= 9; i++) {
			str += " " + i + " ";
			if (LocalDate.of(jaar, maand, i).getDayOfWeek().toString().equals("SATURDAY")) {
				str += "\n";
			}
		}
		for (int i = 10; i <= length; i++) {
			str += i + " ";
			if (LocalDate.of(jaar, maand, i).getDayOfWeek().toString().equals("SATURDAY")) {
				str += "\n";
			}
		}
		System.out.println(str);
		
	}
	
}
