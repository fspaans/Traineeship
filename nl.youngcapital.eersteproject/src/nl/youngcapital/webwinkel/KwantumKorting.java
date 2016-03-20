package nl.youngcapital.webwinkel;

public class KwantumKorting extends Product {

	public KwantumKorting(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
	}
	
	public KwantumKorting(String naam, int prijs, int voorraad, int eenheid) {
		super(naam, prijs, voorraad, eenheid);
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
