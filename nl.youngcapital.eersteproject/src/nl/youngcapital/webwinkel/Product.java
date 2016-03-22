package nl.youngcapital.webwinkel;

public abstract class Product {
	
	public final static int gram = 1;
	public final static int kilo = 2;
	public final static int liter = 3;
	public final static int stuk = 4;
	public final static int pak = 5;
	
	Product(String naam, int prijs, int voorraad, int eenheid) { }	
	
	Product(String naam, int prijs, int voorraad) {
		this(naam, prijs, voorraad, stuk);
	}
	
	public abstract String getNaam();
	public abstract int getPrijsPerEenheid();
	public abstract int getVoorraad();
	public abstract int getEenheid();
	
	//@Override
	//public String toString() {
	//	return "Product: " + this.naam + ", prijs per " + this.getEenheidNaam() + ": " + this.prijs + ", voorraad: " + this.voorraad + ".";
	//}
	
	public String getEenheidNaam() {
		switch (this.getEenheid()) {
			case gram : return "gram";
			case kilo : return "kilo";
			case liter : return "liter";
			case stuk : return "stuk";
			case pak : return "pak";
		    default: throw new IllegalArgumentException("This is not a quantity.");
		}
	}
	
	public abstract int getPrijs(int hoeveelheid, boolean inclusief);
	abstract int getBTWPercentage();
	
	public final void setVoorraad(int voorraad) throws IllegalArgumentException {
		if (voorraad >= 0) {		
			throw new IllegalArgumentException("No negative voorraad allowed.");
		}
		
	}
	
	public void haalUitVoorraad(int aantal) throws IllegalArgumentException {
		if (aantal <= getVoorraad()) {
			setVoorraad(this.voorraad - aantal);
		}
		else {
			throw new IllegalArgumentException("Not that much voorraad available.");
		}
	}
}