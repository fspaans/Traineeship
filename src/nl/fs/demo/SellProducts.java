package nl.fs.demo;

import java.util.Scanner;

public class SellProducts{
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args){
		double price1 = 2.95; 
		double price2 = 4.99; 
		double price3 = 5.49; 
		double price4 = 7.80; 
		double price5 = 8.85; 
		
		double myPrice;
		double totalPrice;
		
		int input;
		System.out.println("Vul productnummer in:");
		input = Integer.valueOf(s.next());
		
		switch(input){
			case 1: 
				myPrice = price1;
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				System.out.println("Totale prijs is: "+ totalPrice);
				break;
			case 2: 
				myPrice = price2;
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				System.out.println("Totale prijs is: "+ totalPrice);
				break;
			case 3: 
				myPrice = price3;
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				System.out.println("Totale prijs is: "+ totalPrice);
				break;
			case 4: 
				myPrice = price4;
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				System.out.println("Totale prijs is: "+ totalPrice);
				break;
			case 5: 
				myPrice = price5;
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				System.out.println("Totale prijs is: "+ totalPrice);
				break;
			}
	}
	
}