package nl.youngcapital.webmain;

import nl.youngcapital.webwinkel.DefaultProduct;
import nl.youngcapital.webwinkel.Product;

public class WebMain {

	public static void main(String[] args) {
		Product p1 = new DefaultProduct("Vork", 45, 2, 5);
		p1.setVoorraad(4);
		Product p2 = new DefaultProduct("Pan", 34, 9);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
