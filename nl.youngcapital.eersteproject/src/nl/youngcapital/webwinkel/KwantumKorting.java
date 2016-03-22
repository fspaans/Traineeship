package nl.youngcapital.webwinkel;

public class KwantumKorting extends Product {

	private String naam;
	private int prijs;
	private int voorraad;
	private int eenheid;
	
	public KwantumKorting(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
	}
	
	public KwantumKorting(String naam, int prijs, int voorraad, int eenheid) {
		super(naam, prijs, voorraad, eenheid);
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad = voorraad;
		this.eenheid = eenheid;
	}

	@Override
	public int getPrijs(int hoeveelheid, boolean inclusief) {
		if (!inclusief) {
			return (hoeveelheid*(3+hoeveelheid)*getPrijsPerEenheid())/(2*(1+hoeveelheid));
		}
		else {
			return (hoeveelheid*(3+hoeveelheid)*getPrijsPerEenheid()*(100 + getBTWPercentage()))/(100*(2*(1+hoeveelheid)));
		}
	}

	@Override
	int getBTWPercentage() {
		return 21;
	}
} 
