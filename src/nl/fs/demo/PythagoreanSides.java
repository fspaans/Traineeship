package nl.fs.demo;

import java.util.Scanner;

public class PythagoreanSides{
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("We gaan kijken welk getal de Hypotenuse moet zijn;");
		System.out.println("Voer getal A in:");
		a = Double.valueOf(s.next());
		System.out.println("Voer getal B in:");
		b = Double.valueOf(s.next());
		System.out.println("Voer getal C in:");
		c = Double.valueOf(s.next());
		
		if(a+b == c){
			System.out.println("Hypotenuse is getal C");
		}else if(b+c == a){
			System.out.println("Hypotenuse is getal A");
		} else if(c+a == b){
			System.out.println("Hypotenuse is getal B");
		}else{
			System.out.println("Er is geen Hypotenuse");
		}		
	}
	
}