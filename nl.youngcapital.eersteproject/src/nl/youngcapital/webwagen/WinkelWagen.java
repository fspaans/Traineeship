package nl.youngcapital.webwagen;

import java.util.ArrayList;
import nl.youngcapital.webwagen.ProductBestelling;
import nl.youngcapital.webwinkel.Bezorging.IBezorgbaar;
import nl.youngcapital.webwinkel.Product;

public class WinkelWagen {

	ArrayList<ProductBestelling> list = new ArrayList<>();
	
	public WinkelWagen () {	}
	
	public void bestel(Product p, int hoeveelheid) throws IllegalArgumentException {
		if (hoeveelheid >= 0) {
			boolean has = false;
			for(ProductBestelling pb: this.list) {
				if(pb.getProduct().equals(p)) {
					has = true;
				}
			}
			p.haalUitVoorraad(hoeveelheid);
			if(!has) {
				this.list.add(new ProductBestelling(p, hoeveelheid));
			}
			else {
				this.list.get(indexProduct(p.getNaam())).setHoeveelheid(this.list.get(indexProduct(p.getNaam())).getHoeveelheid() + hoeveelheid);
			}
		}
		else {
			throw new IllegalArgumentException("You can't order a negative amount of products.");
		}
	}
	
	public int indexProduct(String str) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getProduct().getNaam().equals(str)) {
				return i;
			}
		}
		return -1;
	}
	
	public void wijzig(String naam, int hoeveelheid) {
		if (indexProduct(naam) != -1) {
			if (list.get(indexProduct(naam)).getProduct().getVoorraad() >= list.get(indexProduct(naam)).getHoeveelheid() + hoeveelheid && list.get(indexProduct(naam)).getHoeveelheid() >= -hoeveelheid) {
				list.get(indexProduct(naam)).getProduct().setVoorraad(list.get(indexProduct(naam)).getProduct().getVoorraad() - hoeveelheid);
				list.get(indexProduct(naam)).setHoeveelheid(list.get(indexProduct(naam)).getHoeveelheid() + hoeveelheid);
			}
			else {
				System.out.println("Wijziging mislukt, niet genoeg op voorraad of te weinig in winkelwagen.");
			}
			
			if (list.get(indexProduct(naam)).getHoeveelheid() == 0) {
				if (list.get(indexProduct(naam)).getProduct() instanceof IBezorgbaar) {
					IBezorgbaar dp = (IBezorgbaar) list.get(indexProduct(naam)).getProduct();
					list.remove(indexProduct(dp.getBezorging().getNaam()));		
				}
				list.remove(indexProduct(naam));
			}
		}
		else {
			System.out.println("Wijziging mislukt, product niet gevonden.");
		}
	}
	
	int getTotaalPrijs(boolean inclusief) {
		int sum = 0;
		for(int i = 0; i < this.list.size(); i++) {
			sum += this.list.get(i).getPrijs(inclusief);
		}
		return sum;
	}
	
	public ArrayList<ProductBestelling> getList () {
		return this.list;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "Inhoud Winkelwagen:\n-----------------------------------------------------------------\n";
		for(int i = 0; i < this.list.size(); i++) {
			s += this.list.get(i).getProduct().getNaam() + ", " + this.list.get(i).getHoeveelheid() + " " + this.list.get(i).getProduct().getEenheidNaam() + "(s), kosten ex-BTW: " + this.list.get(i).getProduct().getPrijs(this.list.get(i).getHoeveelheid(), false) + "\n";
		}
		s += "\n";
		s += "Totale kosten ex-BTW: " + getTotaalPrijs(false) + "\n";
		s += "Totale kosten incl-BTW: " + getTotaalPrijs(true) + "\n";
		s += "-----------------------------------------------------------------\n";
		return s;
	}
}