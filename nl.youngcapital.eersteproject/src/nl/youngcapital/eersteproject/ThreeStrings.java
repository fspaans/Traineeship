package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class ThreeStrings {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an article:");
		String art = s.next();
		System.out.println("Enter a noun:");
		String nn = s.next();
		System.out.println("Enter a verb:");
		String vb = s.next();
		s.close();
		
		System.out.println("You entered: " + art + " " + nn + " " + vb);
	}
}
