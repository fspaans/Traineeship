package nl.youngcapital.eersteproject;

import java.util.HashMap;
import java.util.Scanner;

public class PriceOfVeggies {

	public static void main(String[] args) {

		HashMap<String, String> list = new HashMap<>();
		list.put("Andijvie", "0.89");
		list.put("Wortel", "0.59");
		list.put("Kool", "0.20");
		list.put("Spinazie", "1.11");
		list.put("Pastinaak", "1.93");
		list.put("Tomaat", "0.25");
		list.put("Ui", "0.12");
		list.put("Knoflook", "0.73");

		Scanner s = new Scanner(System.in);
		System.out.println("Voer de groente in waarvan je de prijs wil weten:");
		String gr = s.next();
		s.close();
		if(list.containsKey(gr)){
			System.out.println("De prijs van " + gr + " is " + list.get(gr));
		}
		else {
			System.out.println("Deze groente verkopen wij niet.");
		}
	}
}
