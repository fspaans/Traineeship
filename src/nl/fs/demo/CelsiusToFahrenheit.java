package nl.fs.demo;

import java.util.Scanner;

public class CelsiusToFahrenheit{
	
	public static void main(String args[]){
		System.out.println("Vul een heel getal in: ");
		
		Scanner s = new Scanner(System.in);
		int input = Integer.valueOf(s.next());
		
		double fahrenheit = input * 1.8 + 32;
		System.out.println("Uw getal is omgerekend naar Fahrenheit: "+ fahrenheit);
	}
	
}