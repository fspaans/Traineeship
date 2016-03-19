package nl.youngcapital.webwinkel;

public class DefaultProduct extends Product {
	
	
	public DefaultProduct(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
	}
	
	public DefaultProduct(String naam, int prijs, int voorraad, int eenheid) {
		super(naam, prijs, voorraad, eenheid);
	}

	@Override
	int getBTWPercentage() {
		return 21;
	}

	@Override
	int getPrijs(int hoeveelheid, boolean inclusief) {
		return (!inclusief) ? hoeveelheid*getPrijsPerEenheid() : (hoeveelheid*getPrijsPerEenheid()*(100 + getBTWPercentage()))/100;
	}
	
}
