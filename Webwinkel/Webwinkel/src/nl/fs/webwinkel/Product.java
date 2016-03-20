package nl.fs.webwinkel;


public class Product{
	
	protected String pNaam;
	protected int pPrijs;
	protected int pVoorraad;
	protected int pEenheid;
	
	protected String toText(){
		
		return "Hallo";
		
	}
	
	protected void setVoorraad(){
		
		
		
	}
	
	protected void haalUitVoorraad(){
		
		
		
	}
	
	protected int getPrijs(){
		//DefaultProduct.class. btwBerekening();
		return this.pPrijs; 
		
		
	}
	
	///Constructors
	protected Product(String naam, int prijs, int voorraad, int eenheid){
		
		
		
	}
	
	protected Product(String naam, int prijs){
		this.pNaam = naam;
		this.pPrijs = prijs;
		
	}
	
}


