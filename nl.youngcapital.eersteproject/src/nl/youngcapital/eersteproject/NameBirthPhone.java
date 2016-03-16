package nl.youngcapital.eersteproject;

import java.util.HashMap;
import java.util.Scanner;

public class NameBirthPhone {
	
	public static void main(String[] args) {
		HashMap<String, String[]> list = new HashMap<>();
		list.put("Henk", new String[]{"26-01-1954", "06-21256782"});
		list.put("Klaas", new String[]{"17-05-1995", "06-98436534"});
		list.put("Jaap", new String[]{"26-03-1932", "06-44566284"});
		list.put("Eva", new String[]{"26-02-1966", "06-13235884"});
		list.put("Joop", new String[]{"26-11-1974", "06-88796535"});
		
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een naam in:");
		String name = s.next();
		s.close();
		if(list.containsKey(name)) {
			System.out.println(name + " is geboren op " + list.get(name)[0] + " en heeft " + list.get(name)[1] + " als telefoonnummer.");
		}
		else {
			System.out.println(name + " staat niet in de lijst.");
		}
		
	}
}
