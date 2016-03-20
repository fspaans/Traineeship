package nl.fs.webwinkel;

public class Winkelwagen{
	
	private String naam;
	private int hoeveelheid;
	
	
	
	int getTotaalPrijs(){
		
		
		return 1;
	}
	
	static void bestel(Product p, int prijs, int hoeveelheid){
		ProductBestelling pb = new ProductBestelling(p.pNaam, prijs, hoeveelheid);
		
		
	}
	
	void toText(){
		
		
		
	}
	
	
}