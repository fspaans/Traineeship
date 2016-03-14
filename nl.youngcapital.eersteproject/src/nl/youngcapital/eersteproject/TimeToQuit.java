package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class TimeToQuit {

	public static void main(String[] args) {
		boolean accept = false;
		Scanner s = new Scanner(System.in);
		
		while(!accept) {
			System.out.println("Are you sure you want to quit? [Y, N]");
			String str = s.next();
			if(str.equals("Y")) {
				accept = true;
				System.out.println("Goodbye!");
			}
			else if(str.equals("N")) 
				System.out.println("Then stay!");
			else
				System.out.print("Try again. ");
		}
		s.close();
	}
}
