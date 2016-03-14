package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class FahrenheitCelcius {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een geheel graden Celcuis in:");
		int input = Integer.valueOf(s.next());
		s.close();
		System.out.println(input + " graden Celcius is " + (1.8*input + 32) + " graden Fahrenheit.");
	}
}
