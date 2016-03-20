package nl.fs.webwinkel;

public class Winkelwagen{
	
	private static String naam;
	private static int hoeveelheid;
	private static int totaal;
	
	
	
	int getTotaalPrijs(){
		//DefaultProduct dp = new DefaultProduct();
		//totaal *= 
		
		return 3;
	}
	
	static void bestel(Product p, int prijs, int h){
		ProductBestelling pb = new ProductBestelling(p.pNaam, prijs, h);
		naam = pb.getPNaam();
		totaal = pb.getTotaalPrijs();
		hoeveelheid = h;
	}
	
	String toText(){
		String t = (totaal / 100 + ","+ totaal %100);

		String s = "U heeft " + naam +" besteld en "+ hoeveelheid+" stuks, de totaalprijs is: €"+ t;
		return s;
	}
	
	
}