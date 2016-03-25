package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class twoExceptions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Voer iets in:");
		String str = s.next();
		try {
			System.out.println(twoExceptions(str));
		}
		catch (NumberFormatException e) {
			System.out.println("Kan niet geconverteerd worden.");
		}
		catch (NullPointerException e) {
			System.out.println("Dit is een null.");
		}
		s.close();
	}
	
	static int twoExceptions(String getal) {
		return Integer.valueOf(getal.trim());
	}
}
