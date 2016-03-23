package nl.fs.webwinkel;


public class Product extends ProductI{
	
	
	
	protected String toText(){
		
		return "Hallo";
		
	}
	
	protected void setVoorraad(){
		
		
		
	}
	
	protected void haalUitVoorraad(){
		
		
		
	}
	
	protected int getPrijs(){
		//DefaultProduct.class. btwBerekening();
		return pPrijs; 
		
		
	}
	
	///Constructors
	protected Product(String naam, int prijs, int voorraad, int eenheid){
		
		
		
	}
	
	protected Product(String naam, int prijs){
		pNaam = naam;
		pPrijs = prijs;
		
	}
	
}


