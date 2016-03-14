package nl.fs.demo;

import java.util.Scanner;

public class Hypotenuse{
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Vul lengte a in: ");
		double lengthA = Double.valueOf(s.next());
		System.out.println("Vul lengte b in: ");
		double lengthB = Double.valueOf(s.next());
		
		double ASqrt = lengthA * lengthA;
		double BSqrt = lengthB * lengthB;
		double HSqrt = ASqrt + BSqrt;
		double Hypotenuse = Math.sqrt(HSqrt);
		System.out.println("Hypotenuse is: "+ Hypotenuse);

		
	}
	
}