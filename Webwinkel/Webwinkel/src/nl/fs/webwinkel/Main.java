package nl.fs.webwinkel;

import nl.fs.webwinkel.ProductGegevens;

public class Main{
	
	public static void maakProducten(){
		
		ProductGegevens[] pObj = new ProductGegevens[2];
		
		pObj[0] = new ProductGegevens("advocado", 50);
		pObj[1] = new ProductGegevens("tomaat", 25);
		
		for(int i = 0; i < pObj.length; i++){			
			System.out.println(pObj[i].pNaam);			
		}
	}
	
	public static void main(String[] args){
		maakProducten();
		
		
		
	}
	
}