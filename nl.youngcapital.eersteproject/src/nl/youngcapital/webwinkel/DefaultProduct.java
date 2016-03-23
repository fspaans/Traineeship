package nl.youngcapital.webwinkel;

import nl.youngcapital.webwinkel.Bezorging.IBezorgbaar;

public class DefaultProduct extends Product implements IBezorgbaar {
	
	private String naam;
	private int prijs;
	private int voorraad;
	private int eenheid;
	private Bezorging bezorging;
	
	public DefaultProduct(String naam, int prijs, int voorraad) {
		this(naam, prijs, voorraad, stuk);
	}
	
	public DefaultProduct(String naam, int prijs, int voorraad, int eenheid) {
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

	@Override
	public void setBezorging(Bezorging b) {
		this.bezorging = b;
	}

	@Override
	public Bezorging getBezorging() {
		return this.bezorging;
	}	
}
