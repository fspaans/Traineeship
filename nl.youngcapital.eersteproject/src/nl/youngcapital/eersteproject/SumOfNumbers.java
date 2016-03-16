package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long val = 0;
		while(val <= 0) {
			try {
				System.out.println("Voer een positief getal in:");
				val = Long.valueOf(s.next());
				
			}
			catch (NumberFormatException e) {
				System.out.println("Dit is geen (geldig) getal.");
			}
		}
		s.close();
		int sum = 0;
		String str = Long.toString(val);
		for(int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println("De optelsom van de getallen van het getal " + str + " is " + sum); 
			
	}
}
