package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class CountAInword {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		System.out.println("Voer een woord in:");
		String str = s.next();
		s.close();
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == 'a')
				a++;
		System.out.println("Er zit " + a + " keer de letter a in het woord " + str + ".");
	}
}
