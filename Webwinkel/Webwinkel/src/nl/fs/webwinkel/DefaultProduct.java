package nl.fs.webwinkel;


public class DefaultProduct extends Product{

	private final int btwVoedsel = 6;
	private int btwPrijs;
	
	protected DefaultProduct(String naam, int prijs) {
		super(naam, prijs);
		// TODO Auto-generated constructor stub
		this.btwPrijs = prijs * btwVoedsel/100;
	}
	
	protected int getBTW(){
		return this.btwPrijs;
	}
	
}