package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class XYIf {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een geheel getal x in:");
		int x = Integer.valueOf(s.next());
		System.out.println("Voer een geheel getal y in:");
		int y = Integer.valueOf(s.next());
		s.close();
		if(x/y == 5)
			x = 100;
		if(x*y == 5)
			x = 1;
		if(x < y)
			x *= 2;
		if(x > y)
			x += 1;
		
		System.out.println("x = " + x + ", y = " + y);
	}
}
