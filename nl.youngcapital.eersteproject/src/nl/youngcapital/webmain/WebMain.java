package nl.youngcapital.webmain;

import java.util.ArrayList;
import java.util.Scanner;

import nl.youngcapital.webwagen.WinkelWagen;
import nl.youngcapital.webwinkel.DefaultProduct;
import nl.youngcapital.webwinkel.KwantumKorting;
import nl.youngcapital.webwinkel.Product;
import nl.youngcapital.webwinkel.Voedsel;

public class WebMain {

	public static void main(String[] args) {
		ArrayList<Product> winkel = new ArrayList<>();
		WinkelWagen ww = new WinkelWagen();
		winkel.add(new KwantumKorting("Vork", 45, 70, 5));
		winkel.add(new DefaultProduct("Pan", 34, 50));
		winkel.add(new Voedsel("Sushi", 11, 100, 2));
		
		boolean busy = true;
		Scanner s = new Scanner(System.in);
		
		while(busy) {
			System.out.println("Inhoud winkel: \n----------------------------------------------------");
			System.out.println(winkel.get(0));
			System.out.println(winkel.get(1));
			System.out.println(winkel.get(2));
			System.out.println("----------------------------------------------------");
			System.out.println("Welk product wil je bestellen?:");
			
			String str = s.next();
			for(int i = 0; i < winkel.size(); i++) {
				if(winkel.get(i).getNaam().equals(str)) {
					System.out.println("Hoeveel van " + str + " wil je bestellen?:");
					int hoeveelheid = s.nextInt();
					ww.bestel(winkel.get(i), hoeveelheid);
					System.out.println(ww);
					System.out.println("Totale kosten ex-BTW: " + ww.getTotaalPrijs(false));
					System.out.println("Totale kosten incl-BTW: " + ww.getTotaalPrijs(true));
				}
			}
			System.out.println("Wil je doorgaan? [J/N]:");
			String str2 = s.next();
			if (str2.equals("N")) {
				busy = false;
				System.out.println("Tot ziens!");
			}
			else if (str2.equals("J")) {
				System.out.println("Veel plezier met verder winkelen!");
			}
			else {
				System.out.println("Wat wil je nou?");
			}
		}
		s.close();
	}
}
