package nl.fs.webwinkel;

import java.util.Scanner;

public class Main{
	
	private static Product[] pObj = new Product[2];
	private static String[] bestelling = new String[2];
	private static Winkelwagen ww = new Winkelwagen();
	private static String emptySpace = "                     ";
	private static String dashes = "--------------------------------------------------------------";
	private static Scanner sc = new Scanner(System.in);
	
	//Maak productenlijst
	public static void maakProducten(){
		
		pObj[0] = new Product("advocado", 50);
		pObj[1] = new Product("tomaat", 25);
		
		
	}
	
	//Print producten
	public static void printProducten(){
		System.out.println("Product"+emptySpace+"Prijs"+emptySpace+"Voorraad");
		System.out.println(dashes);
		for(int i = 0; i < pObj.length; i++){			
			System.out.println(pObj[i].pNaam + emptySpace + pObj[i].pPrijs / 100 + ","+ pObj[i].pPrijs %100);
		}	
		System.out.println(dashes);
	}
	
	//Stuur bestelling naar array
	public static void stuurBestelling(){
			int input;
			int h;//hoeveelheid
			
			System.out.println("Voer uw product nummer in:");
			input = Integer.valueOf(sc.next());
			System.out.println("Voer aantal in:");
			h = Integer.valueOf(sc.next());
			Winkelwagen.bestel(pObj[input], pObj[input].pPrijs,h);
			bestelling[input] = ww.toText();
	}
	
	public static void btwTotaal(String n, int p){
		DefaultProduct dp = new DefaultProduct(n, p);
		
	}
	
	//Main
	public static void main(String[] args){
		maakProducten();
		printProducten();
		stuurBestelling();
		for(int i = 0; i < bestelling.length; i++){		
			if(bestelling[i]!= null){
				System.out.println(bestelling[i]);	
			}
		}
		
		
		
	}
	
}