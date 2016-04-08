package nl.fs.webwinkel;

public class Winkelwagen{
	
	private static String naam;
	private static int hoeveelheid;
	private static int totaal;
	private static int btw;
	private static int inclusief;
	
	
	
	static int getTotaalPrijs(){
		int t = btw + totaal;		
		return t;
	}
	
	static void bestel(Product p, int prijs, int h){
		ProductBestelling pb = new ProductBestelling(p.pNaam, prijs, h);
		naam = pb.getPNaam();
		totaal = pb.getTotaalPrijs();
		hoeveelheid = h;
		DefaultProduct dp = new DefaultProduct(p.pNaam, p.pPrijs);
		btw = dp.getBTW();
		inclusief = getTotaalPrijs();
	}
	
	String toText(){
		int t = totaal / 100;
		int tm = totaal %100;
		int i = inclusief / 100;
		int im = inclusief %100;
		String x;
		String y;
		
		if(tm > 1 || im > 1){
			x = (t + ","+ totaal %100);
			y = (i + ","+ inclusief %100);
		}else{
			x = (t + ",00");
			y = (i + ",00");
		}
		
		String s = "U heeft " + naam +" besteld en "+ hoeveelheid+
				" stuks, de totaalprijs is: €"+ x+ " BTW:"+btw+ " Totaal incl. €"+ y;
		return s;
	}
	
	
}