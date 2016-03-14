package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class InputValLoop {
	
	public static void main(String[] args) {
		boolean accept = false;
		Scanner s = new Scanner(System.in);
		int getal = 0;
		
		while(!accept) {
			System.out.println("Voer een geheel getal tussen de 1 en de 10 in:");
			try {
				getal = Integer.valueOf(s.next());
				if(getal >= 1 && getal <= 10)
					accept = true;
				else
					System.out.print("Incorrect getal. ");
			}
			catch (NumberFormatException e) {
				System.out.println("Voer een geheel getal in!");
			}			
		}
		s.close();
		System.out.println("Het ingevoerde getal is: " + getal);
	}
}
