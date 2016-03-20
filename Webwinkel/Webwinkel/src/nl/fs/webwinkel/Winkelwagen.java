package nl.fs.webwinkel;

public class Winkelwagen{
	
	private static String naam;
	private static int hoeveelheid;
	private static int totaal;
	private static int btw;
	
	
	
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
		DefaultProduct dp = new DefaultProduct(p.pNaam, p.pPrijs);
		btw = dp.getBTW();
	}
	
	String toText(){
		int t = totaal / 100;
		int tm = totaal %100;
		String x;
		
		if(tm > 1){
			x = (t + ","+ totaal %100);
		}else{
			x = (t + ",00");
		}

		String s = "U heeft " + naam +" besteld en "+ hoeveelheid+" stuks, de totaalprijs is: €"+ x;
		return s;
	}
	
	
}