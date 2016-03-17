package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class LowHighTemp {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] laag = new int[12];
		int[] hoog = new int[12];
		boolean check = false;
		for(int i = 0; i < 12; i++) {
			while(!check) {
				try {
					System.out.println("Voer de laagste temperatuur in van maand " + (i+1));
					laag[i] = Integer.valueOf(s.next());
					System.out.println("Voer de hoogste temperatuur in van maand " + (i+1));
					hoog[i] = Integer.valueOf(s.next());
					check = true;
				}
				catch (NumberFormatException e) {
					System.out.println("Dit is geen geldige temperatuur.");
				}
			}
			check = false;
		}
		s.close();
		System.out.print("Lage temperaturen: ");
		for(int i = 0; i < 11; i++) {
			System.out.print(laag[i] + ", ");
		}
		System.out.println(laag[11] + ".");
		System.out.print("Hoge temperaturen: ");
		for(int i = 0; i < 11; i++) {
			System.out.print(hoog[i] + ", ");
		}
		System.out.println(hoog[11] + ".");
	}
}
