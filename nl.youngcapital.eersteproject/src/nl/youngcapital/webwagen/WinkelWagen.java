package nl.youngcapital.webwagen;

import java.util.ArrayList;
import nl.youngcapital.webwagen.ProductBestelling;
import nl.youngcapital.webwinkel.Product;

public class WinkelWagen {

	ArrayList<ProductBestelling> list = new ArrayList<>();
	
	public WinkelWagen () {	}
	
	public void bestel(Product p, int hoeveelheid) {
		this.list.add(new ProductBestelling(p, hoeveelheid));
	}
	
	public int getTotaalPrijs(boolean inclusief) {
		int sum = 0;
		for(int i = 0; i < this.list.size(); i++) {
			sum += this.list.get(i).getPrijs(inclusief);
		}
		return sum;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i < this.list.size(); i++) {
			s += this.list.get(i).getProduct().getNaam() + ", " + this.list.get(i).getHoeveelheid() + " " + this.list.get(i).getProduct().getEenheidNaam() + "(s), kosten ex-BTW: " + this.list.get(i).getProduct().getPrijs(this.list.get(i).getHoeveelheid(), false) + "\n";
		} 
		return s;
	}
}