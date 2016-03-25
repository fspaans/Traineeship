package nl.fs.klok;

import java.time.*;

public class Verjaardag {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate verjaardag = LocalDate.of(2016,2,19);
		int maandOver = verjaardag.getMonthValue() - date.getMonthValue();
		int dagOver = verjaardag.getDayOfYear() - date.getDayOfYear();
		if (dagOver > 0){
		System.out.println("Nog "+dagOver + " aantal nachtjes slapen");
		}else{
			System.out.println("Helaas ben je al jarig geweest dit jaar");
			System.out.println("Nog even " +(dagOver + 365) +" Nachtjes slapen");

			
		}
		System.out.println("De verjaardag valt op een "+ verjaardag.getDayOfWeek());
	}
}
