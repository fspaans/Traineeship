package nl.youngcapital.eersteproject;

import java.util.HashMap;
import java.util.Scanner;

public class PriceOfProduct {

	public static void main(String[] args) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		h.put(1, 295);
		h.put(2, 499);
		h.put(3, 549);
		h.put(4, 780);
		h.put(5, 885);
		
		Scanner s = new Scanner(System.in);
		
		int prod = 0;
		int sold = 0;
		while(!((prod >= 1 && prod <= 5) && sold > 0)) {
			try {
				System.out.println("Voer een productnummer tussen de 1 en 5 in:");
				prod = Integer.valueOf(s.next());
				if(prod >= 1 && prod <= 5) {
					System.out.println("Voer het aantal verkochte producten in:");
					sold = Integer.valueOf(s.next());
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Dit is geen getal.");
			}
		}
		s.close();
		System.out.println("Winst: " + h.get(prod)*sold/100.0);
		
	}
}
