package nl.fs.demo;

import java.util.Scanner;

public class CalculateRanged{
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int a;
		int b;
		int c;
		
		System.out.println("Voer getal A in:");
		a = Integer.valueOf(s.next());
		System.out.println("Voer getal B in:");
		b = Integer.valueOf(s.next());
		c = a+b;
		if(c > 0 && c < 21){
			System.out.println(c+ " :Getal A en B opgesomd valt tussen 0 en 20");
		}else{
			System.out.println(c+ " :Getal A en B opgesomd valt buiten het bereik");
		}

		
	}
	
}