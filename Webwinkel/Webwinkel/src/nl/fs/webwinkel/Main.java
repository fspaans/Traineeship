package nl.fs.webwinkel;

import nl.fs.webwinkel.*;

public class Main{
	
	public static void maakProducten(){
		
		Product[] pObj = new Product[2];
		Winkelwagen ww = new Winkelwagen();
		
		pObj[0] = new Product("advocado", 50);
		pObj[1] = new Product("tomaat", 25);
		
		for(int i = 0; i < pObj.length; i++){			
			System.out.println(pObj[i].pNaam);
			Winkelwagen.bestel(pObj[i], pObj[i].pPrijs,2);
			//DefaultProduct sp = new DefaultProduct().btwBerekening();
			System.out.println(pObj[i].pPrijs / 100 + ","+ pObj[i].pPrijs %100);
		}
	}
	
	public static void main(String[] args){
		maakProducten();
		
		
		
		
	}
	
}