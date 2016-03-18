package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class LowHighTemp {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] laag = new int[12];
		int[] hoog = new int[12];
		boolean checkl = false;
		boolean checkh = false;
		boolean check = false;
		for(int i = 0; i < 12; i++) {
			while(!check) {
				try {
					if (!checkl) {
						System.out.println("Voer de laagste temperatuur in van maand " + (i+1));
						laag[i] = Integer.valueOf(s.next());
						checkl = true;
					}
					if (!checkh) {
						System.out.println("Voer de hoogste temperatuur in van maand " + (i+1));
						hoog[i] = Integer.valueOf(s.next());
						checkh = true;
					}
					if(laag[i] <= hoog[i]) {
						check = true;
					}
					else {
						System.out.println("De laagste temperatuur is niet lager dan de hoogste temperatuur");
						checkl = false;
						checkh = false;
					}
				}
				catch (NumberFormatException e) {
					System.out.println("Dit is geen geldige temperatuur.");
				}
			}
			checkl = false;
			checkh = false;
			check = false;
		}
		s.close();
		System.out.print("Laagste temperaturen: ");
		for(int i = 0; i < 11; i++) {
			System.out.print(laag[i] + ", ");
		}
		System.out.println(laag[11] + ".");
		System.out.print("Hoogste temperaturen: ");
		for(int i = 0; i < 11; i++) {
			System.out.print(hoog[i] + ", ");
		}
		System.out.println(hoog[11] + ".");
	}
}