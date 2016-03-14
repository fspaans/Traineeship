package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class VolSurfBox {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Voer de gehele lengte in van de doos:");
		int l = Integer.valueOf(s.next());
		System.out.println("Voer de gehele breedte in van de doos:");
		int b = Integer.valueOf(s.next());
		System.out.println("Voer de gehele hoogte in van de doos:");
		int h = Integer.valueOf(s.next());
		s.close();
		System.out.println("Het volume van de doos is: " + l*b*h);
		System.out.println("De oppervlakte van de doos is: " + 2*((l*b) + (l*h) + (b*h)));
	}
}
