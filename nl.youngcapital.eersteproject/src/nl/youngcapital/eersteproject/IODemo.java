package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) {
		System.out.println("Voer iets in:");
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine(); //next leest eerste woord, nextLine leest eerste regel.
		
		System.out.println("Uw invoer was: " + input);
		s.close();
	}

}
