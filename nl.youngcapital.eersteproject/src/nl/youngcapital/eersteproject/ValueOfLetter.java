package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class ValueOfLetter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een karakter in:");
		char c = s.next().charAt(0);
		s.close();
		int val = c - 64;
		val = (val > 26) ? val - 32 : val;
		System.out.println("De waarde van " + c + " is " + val + ".");
	}
}
