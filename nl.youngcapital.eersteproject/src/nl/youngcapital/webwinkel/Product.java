package nl.youngcapital.webwinkel;

public abstract class Product {
	
	private final static int gram = 1;
	private final static int kilo = 2;
	private final static int liter = 3;
	private final static int stuk = 4;
	private final static int pak = 5;
	
	private String naam;
	private int prijs;
	private int voorraad;
	private int eenheid;
	
	Product(String naam, int prijs, int voorraad,int eenheid) {
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
		this.eenheid = eenheid;
	}	
	
	Product(String naam, int prijs, int voorraad) {
		this(naam, prijs, voorraad, stuk);
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public int getPrijsPerEenheid() {
		return this.prijs;
	}
	
	public final int getVoorraad() throws IllegalArgumentException {
		if (this.voorraad >= 0) {
			return this.voorraad;
		}
		else {
			throw new IllegalArgumentException("Your voorraad can't be negative.");
		}
	}
	
	public int getEenheid() {
		return this.eenheid;
	}
	
	@Override
	public String toString() {
		return "Naam: " + this.getNaam() + ", eenheid: " + this.getEenheidNaam() + ", voorraad: " + this.getVoorraad() + ".";
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
	
	abstract int getPrijs(int hoeveelheid, boolean inclusief);
	abstract int getBTWPercentage();
	
	public void setVoorraad(int voorraad) throws IllegalArgumentException {
		if (voorraad >= 0) {
			this.voorraad = voorraad;
		}
		else {
			throw new IllegalArgumentException("No negative voorraad allowed.");
		}
	}
	
	void haalUitVoorraad(int aantal) throws IllegalArgumentException {
		if (aantal <= getVoorraad()) {
			setVoorraad(getVoorraad() - aantal);
		}
		else {
			throw new IllegalArgumentException("Not that much voorraad available.");
		}
	}
}