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
	public int getPrijs(int hoeveelheid, boolean inclusief) {
		if (!inclusief) {
			return ((3+hoeveelheid)*getPrijsPerEenheid()) / (2*(hoeveelheid+1));
		}
		else {
			return ((3+hoeveelheid)*hoeveelheid*getPrijsPerEenheid()*(100 + getBTWPercentage()))/(100 * (2*(hoeveelheid+1)));
		}
	}
} 
