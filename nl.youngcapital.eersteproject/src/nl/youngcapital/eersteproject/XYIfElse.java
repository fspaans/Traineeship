package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class XYIfElse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een geheel getal x in:");
		int x = Integer.valueOf(s.next());
		System.out.println("Voer een geheel getal y in:");
		int y = Integer.valueOf(s.next());
		s.close();
		
		x = (x*y == 8) ? 1 : 2;
		x = (x < y) ? 2*x : x + 1;
		
		if (x > y) { 
			x++;
			y++;
		}
		else {
			x--;
			y--;
		}
		System.out.println("x = " + x + ", y = " + y);
			
	}
	
}
