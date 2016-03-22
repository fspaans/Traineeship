package nl.youngcapital.webwinkel;

public class DefaultProduct extends Product {
	
	private String naam;
	private int prijs;
	private int voorraad;
	private int eenheid;
	
	public DefaultProduct(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
	}
	
	public DefaultProduct(String naam, int prijs, int voorraad, int eenheid) {
		super(naam, prijs, voorraad, eenheid);
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
		this.eenheid = eenheid;
	}

	@Override
	int getBTWPercentage() {
		return 21;
	}

	@Override
	public int getPrijs(int hoeveelheid, boolean inclusief) {
		if (!inclusief) {
			return hoeveelheid*getPrijsPerEenheid();
		}
		else {
			return (hoeveelheid*getPrijsPerEenheid()*(100 + getBTWPercentage()))/100;
		}
	}
	
}
