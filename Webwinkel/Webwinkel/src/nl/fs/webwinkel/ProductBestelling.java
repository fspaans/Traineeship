package nl.fs.webwinkel;

public class ProductBestelling{
	
	private String naam;
	private int hoeveelheid;
	
	///Constructors
	protected ProductBestelling(String naam, int prijs, int voorraad, int eenheid){
		
		this.naam = naam;
		this.hoeveelheid = voorraad;
		
	}
	
	protected ProductBestelling(String naam){
		
		this.naam = naam;
		
		
	}
	
}