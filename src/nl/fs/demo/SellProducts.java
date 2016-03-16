package nl.fs.demo;

import java.util.Scanner;

public class SellProducts{
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[] prices;
		prices = new int[5];
		
		prices[0] = 295;
		prices[1] = 499;
		prices[2] = 549;
		prices[3] = 780;
		prices[4] = 885;
		
		int myPrice;
		int totalPrice;
		int wholePrice;
		int decimalPrice;
		
		int input;
		System.out.println("Vul productnummer in:");
		input = Integer.valueOf(s.next());
		
		switch(input){
			case 1: 
				myPrice = prices[0];
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				wholePrice =totalPrice / 100;
				decimalPrice = totalPrice %100;
				System.out.println("Totale prijs is: "+ wholePrice + ","+ decimalPrice);
				break;
			case 2: 
				myPrice = prices[1];
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				wholePrice =totalPrice / 100;
				decimalPrice = totalPrice %100;
				System.out.println("Totale prijs is: "+ wholePrice + ","+ decimalPrice);
				break;
			case 3: 
				myPrice = prices[2];
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				wholePrice =totalPrice / 100;
				decimalPrice = totalPrice %100;
				System.out.println("Totale prijs is: "+ wholePrice + ","+ decimalPrice);
				break;
			case 4: 
				myPrice = prices[3];
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				wholePrice =totalPrice / 100;
				decimalPrice = totalPrice %100;
				System.out.println("Totale prijs is: "+ wholePrice + ","+ decimalPrice);
				break;
			case 5: 
				myPrice = prices[4];
				System.out.println("Vul totaal producten in:");
				input = Integer.valueOf(s.next());
				totalPrice = input * myPrice;
				wholePrice =totalPrice / 100;
				decimalPrice = totalPrice %100;
				System.out.println("Totale prijs is: "+ wholePrice + ","+ decimalPrice);
				break;
			default:
				System.out.println("Kan het productnummer niet vinden.");
				break;
			}
	}
	
}