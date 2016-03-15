package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class PythThm {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] sides = new int[3];
		while(sides[2] == 0) {
			try {
				for(int i = 0; i < sides.length; i++) {
					System.out.println("Voer de " + (i+1) + "e gehele zijde van de driehoek in.");
					sides[i] = Integer.valueOf(s.next());
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Dit is geen geldig getal");
			}
		}
		s.close();
		if((sides[0]*sides[0] + sides[1]*sides[1] == sides[2]*sides[2]) || 
			(sides[0]*sides[0] + sides[2]*sides[2] == sides[1]*sides[1]) || 
			(sides[2]*sides[2] + sides[1]*sides[1] == sides[0]*sides[0]))
			System.out.println("Dit is een rechthoekige driehoek.");
		else
			System.out.println("Dit is geen rechthoekige driehoek.");
	}
}
