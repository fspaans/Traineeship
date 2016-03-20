package nl.fs.webwinkel;


public class DefaultProduct extends Product{

	private final int btwVoedsel = 6;
	
	protected DefaultProduct(String naam, int prijs) {
		super(naam, prijs);
		// TODO Auto-generated constructor stub
		int btwPrijs;
	}
	
	protected void btwBerekening(){
		super.pPrijs += super.pPrijs / 100 * btwVoedsel;

	}
	

	
}