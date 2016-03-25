package nl.youngcapital.eersteproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NaamVanWeekdag {
	
	static String naamVanWeekdag(int dag) throws DatIsGeenWeekDag {
			switch(dag) {
				case 1: return "maandag";
				case 2: return "dinsdag";
				case 3: return "woensdag";
				case 4: return "donderdag";
				case 5: return "vrijdag";
				case 6: return "zaterdag";
				case 7: return "zondag";
				default: throw new DatIsGeenWeekDag();
			}
	}
	
	static class DatIsGeenWeekDag extends Exception {}
	
	public static void main (String[] args) throws DatIsGeenWeekDag {
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een getal van 1 t/m 7 in.");
		try {
			int dag = s.nextInt();
			System.out.println(naamVanWeekdag(dag));
		}
		catch (InputMismatchException e) {
			System.out.println("Dit is geen integer.");
		}
		catch (DatIsGeenWeekDag e) {
			System.out.println("Dit is geen geldig nummer.");
		}
		finally {
			s.close();
		}
		
	}
}
