package nl.youngcapital.webwinkel;

public class KwantumKorting extends Product {

	KwantumKorting(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
		// TODO Auto-generated constructor stub
	}
	
	KwantumKorting(String naam, int prijs, int voorraad, int eenheid) {
		super(naam, prijs, voorraad, eenheid);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getPrijs(int hoeveelheid, boolean inclusief) {
		if (!inclusief) {
			return ((3+hoeveelheid)/(2*(1+hoeveelheid)))*getPrijsPerEenheid();
		}
		else {
			return (((3+hoeveelheid)/(2*(1+hoeveelheid)))*getPrijsPerEenheid()*(100 + getBTWPercentage()))/100;
		}
	}

	@Override
	int getBTWPercentage() {
		return 21;
	}
} 
