package nl.youngcapital.webmain;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import nl.youngcapital.webwagen.WinkelWagen;
import nl.youngcapital.webwinkel.Bezorging;
import nl.youngcapital.webwinkel.Bezorging.IBezorgbaar;
import nl.youngcapital.webwinkel.DefaultProduct;
import nl.youngcapital.webwinkel.KwantumKorting;
import nl.youngcapital.webwinkel.Product;
import nl.youngcapital.webwinkel.Voedsel;

public class WebMain {

	public static void main(String[] args) {

		ArrayList<Product> winkel = new ArrayList<>();
		WinkelWagen ww = new WinkelWagen();
		winkel.add(new KwantumKorting("Vork", 45, 70, Product.pak));
		winkel.add(new DefaultProduct("Pan", 34, 50));
		winkel.add(new Voedsel("Sushi", 11, 100, Product.kilo));
		boolean busy = true;
		Scanner s = new Scanner(System.in);
		
		while(busy) {
			boolean wijzigbusy = true;
			System.out.println("Inhoud winkel: \n-----------------------------------------------------------------");
			System.out.println(winkel.get(0));
			System.out.println(winkel.get(1));
			System.out.println(winkel.get(2));
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Welk product wil je bestellen?:");
			
			String str = s.next();
			for(int i = 0; i < winkel.size(); i++) {
				if(winkel.get(i).getNaam().equals(str)) {
					System.out.println("Hoeveel van " + str + " wil je bestellen?:");
					try {
						int hoeveelheid = s.nextInt();
						ww.bestel(winkel.get(i), hoeveelheid);
						if (ww.getList().get(ww.getList().size() - 1).getProduct() instanceof IBezorgbaar) {
							IBezorgbaar dp = (IBezorgbaar) ww.getList().get(ww.getList().size() - 1).getProduct();
							System.out.println("Hoe wil je dit product bezorgd hebben?\n1: Internationaal, 2: Lokaal.");
							int bz = s.nextInt();
							
							if (bz == 1) {
								dp.setBezorging(new Bezorging("Internationale bezorging", 100, 1));
							}
							else if (bz == 2) {
								dp.setBezorging(new Bezorging("Lokale bezorging", 50, 1));
							}
							ww.bestel(dp.getBezorging(), 1);
						}
						System.out.println(ww);
					}
					catch (InputMismatchException e) {
						System.out.println("Dit is geen aantal.");
						//s.next();
					}
				}
			}
			while (wijzigbusy) {
				System.out.println("Wil je doorgaan? [J/N] of wil je je bon wijzigen? [W]:");
				String str2 = s.next();
				if (str2.equals("N")) {
					busy = false;
					wijzigbusy = false;
					System.out.println("Tot ziens!");
				}
				else if (str2.equals("J")) {
					System.out.println("Veel plezier met verder winkelen!");
					wijzigbusy = false;
				}
				else if (str2.equals("W")){
					System.out.println("Voer het product op je bon in dat je wil wijzigen:");
					String str3 = s.next();
					System.out.println("Voer het aantal in waarmee je het product wil wijzigen (positief getal voor toevoegen, negatief getal voor verwijderen).");
					int wijziging = s.nextInt();
					ww.wijzig(str3, wijziging);
					System.out.println(ww);
				}
			}
		}
		s.close();
	}
}
