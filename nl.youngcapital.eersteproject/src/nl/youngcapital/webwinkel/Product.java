package nl.youngcapital.webwinkel;

public abstract class Product {
	
	public final static int gram = 1;
	public final static int kilo = 2;
	public final static int liter = 3;
	public final static int stuk = 4;
	public final static int pak = 5;
	
	Product(String naam, int prijs, int voorraad, int eenheid) { }	
	
	Product(String naam, int prijs, int voorraad) {	}
	
	public abstract String getNaam();
	public abstract int getPrijsPerEenheid();
	public abstract int getVoorraad();
	public abstract int getEenheid();
	public abstract int getBTWPercentage();
	public abstract void setVoorraad2(int voorraad);
	
	@Override
	public String toString() {
		return "Product: " + getNaam() + ", prijs per " + getEenheidNaam() + ": " + getPrijsPerEenheid() + ", voorraad: " + getVoorraad() + ".";
	}
	
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
	
	public int getPrijs(int hoeveelheid, boolean inclusief) {
		if (!inclusief) {
			return hoeveelheid*getPrijsPerEenheid();
		}
		else {
			return (hoeveelheid*getPrijsPerEenheid()*(100 + getBTWPercentage()))/100;
		}
	}
	
	public final void setVoorraad(int voorraad) throws IllegalArgumentException {
		if (voorraad < 0) {		
			throw new IllegalArgumentException("No negative voorraad allowed.");
		}
		else {
			setVoorraad2(voorraad);
		}
	}
	
	public void haalUitVoorraad(int aantal) throws IllegalArgumentException {
		if (aantal <= getVoorraad()) {
			setVoorraad(getVoorraad() - aantal);
		}
		else {
			throw new IllegalArgumentException("Not that much voorraad available.");
		}
	}
}