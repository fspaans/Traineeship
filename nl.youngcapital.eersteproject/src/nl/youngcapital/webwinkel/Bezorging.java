package nl.youngcapital.webwinkel;

public class Bezorging extends Product {
	
	private String naam;
	private int prijs;
	
	
	public Bezorging(String naam, int prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = naam;
		this.prijs = prijs;
	}

	public interface IBezorgbaar {
		public void setBezorging(Bezorging b);
		public Bezorging getBezorging();
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
		return 1;
	}

	@Override
	public int getEenheid() {
		return 4;
	}

	@Override
	public int getBTWPercentage() {
		return 0;
	}

	@Override
	public void setVoorraad2(int voorraad) { }
}
