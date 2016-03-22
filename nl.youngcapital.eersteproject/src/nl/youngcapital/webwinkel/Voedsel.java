package nl.youngcapital.webwinkel;

public class Voedsel extends Product {

	public Voedsel(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
	}

	public Voedsel(String naam, int prijs, int voorraad, int eenheid) {
		super(naam, prijs, voorraad, eenheid);
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

	@Override
	int getBTWPercentage() {
		return 6;
	}

}
