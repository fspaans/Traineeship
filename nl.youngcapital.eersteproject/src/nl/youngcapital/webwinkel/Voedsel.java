package nl.youngcapital.webwinkel;

public class Voedsel extends Product {

	private String naam;
	private int prijs;
	private int voorraad;
	private int eenheid;
	
	public Voedsel(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
	}

	public Voedsel(String naam, int prijs, int voorraad, int eenheid) {
		super(naam, prijs, voorraad, eenheid);
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
		this.eenheid = eenheid;
	}
	
	@Override
	public int getBTWPercentage() {
		return 21;
	}

	@Override
	public String getNaam() {
		return this.naam;
	}

	@Override
	public int getPrijsPerEenheid() {
		return this.prijs;
	}

	@Override
	public int getVoorraad() {
		return this.voorraad;
	}

	@Override
	public int getEenheid() {
		return this.eenheid;
	}

	@Override
	public void setVoorraad2(int voorraad) {
		this.voorraad = voorraad;
	}
}
