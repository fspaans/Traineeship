package nl.fs.webwinkel;

public class ProductBestelling{
	
	private String naam;
	private int hoeveelheid;
	private int prijs;
	
	int getTotaalPrijs(){
		this.prijs *= this.hoeveelheid ;
		return this.prijs;
	}
	
	String getPNaam(){		
		return naam;
	}
	
	protected ProductBestelling(String naam, int prijs, int hoeveelheid){
		this.naam = naam;
		this.hoeveelheid = hoeveelheid;
		this.prijs = prijs;
	}
	
}