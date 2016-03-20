package nl.youngcapital.webwagen;

import nl.youngcapital.webwinkel.Product;

public class ProductBestelling {

	private Product product;
	private int hoeveelheid;
	
	ProductBestelling(Product product, int hoeveelheid) {
		this.product = product;
		this.hoeveelheid = hoeveelheid;
	}
	
	int getPrijs(boolean inclusief) {
		return product.getPrijs(this.hoeveelheid, inclusief);
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	@Override
	public String toString() {
		return product.getNaam() + ", " + getHoeveelheid() + " " + product.getEenheidNaam() + "(s).";
	}
	
	public int getHoeveelheid() {
		return this.hoeveelheid;
	}
	
	public void setHoeveelheid(int hoeveelheid) {
		this.hoeveelheid = hoeveelheid;
	}
}