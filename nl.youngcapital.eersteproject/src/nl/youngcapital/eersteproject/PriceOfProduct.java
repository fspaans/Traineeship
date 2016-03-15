package nl.youngcapital.eersteproject;

import java.util.HashMap;
import java.util.Scanner;

public class PriceOfProduct {

	public static void main(String[] args) {
		HashMap<Integer, Double> h = new HashMap<Integer, Double>();
		
		h.put(1, 2.95);
		h.put(2, 4.99);
		h.put(3, 5.49);
		h.put(4, 7.80);
		h.put(5, 8.85);
		
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
		System.out.println("Winst: " + h.get(prod)*sold);
		
	}
}
