package nl.fs.webwinkel;

import nl.fs.webwinkel.*;

public class Main{
	
	private static Product[] pObj = new Product[2];
	private static String[] bestelling = new String[2];
	private static Winkelwagen ww = new Winkelwagen();
	
	public static void maakProducten(){
		
		pObj[0] = new Product("advocado", 50);
		pObj[1] = new Product("tomaat", 25);
		
		for(int i = 0; i < pObj.length; i++){			
			//System.out.println(pObj[i].pNaam);
			Winkelwagen.bestel(pObj[i], pObj[i].pPrijs,2);
			bestelling[i] = ww.toText(); 
			//System.out.println(pObj[i].pPrijs / 100 + ","+ pObj[i].pPrijs %100);
		}
	}
	
	public static void main(String[] args){
		maakProducten();
		for(int i = 0; i < pObj.length; i++){			
			System.out.println(bestelling[i]);	
		}
		
		
		
	}
	
}