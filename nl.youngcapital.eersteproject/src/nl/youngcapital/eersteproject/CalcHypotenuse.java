package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class CalcHypotenuse {

	public static void main(String[] args) { 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Voer de gehele lengte van de eerste rechte zijde in:");
		int a = Integer.valueOf(s.next());
		System.out.println("Voer de gehele lengte van de tweede rechte zijde in:");
		int b = Integer.valueOf(s.next());
		s.close();
		System.out.println("De lengte van de schuine zijde is: " + Math.sqrt(a*a + b*b));
	}
}
