package nl.youngcapital.webmain;

import nl.youngcapital.webwinkel.DefaultProduct;
import nl.youngcapital.webwinkel.KwantumKorting;
import nl.youngcapital.webwinkel.Product;

public class WebMain {

	public static void main(String[] args) {
		Product p1 = new KwantumKorting("Vork", 45, 2, 5);
		p1.setVoorraad(4);
		Product p2 = new DefaultProduct("Pan", 34, 9);
		
		p2.setVoorraad(10);
		System.out.println(p2);
		System.out.println(p2.getPrijs(10, false));
		System.out.println(p2.getPrijs(10, true));
		

		System.out.println(p1.getPrijs(30, false));
		System.out.println(p1.getPrijs(3, true));
		

		System.out.println(p1.getPrijs(1, false));
		System.out.println(p1.getPrijs(1, true));
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
