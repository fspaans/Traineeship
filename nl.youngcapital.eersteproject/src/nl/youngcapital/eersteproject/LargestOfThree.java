package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		Scanner s = new Scanner(System.in);
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Voer het " + (i+1) + "e getal in:");
			numbers[i] = Integer.valueOf(s.next());
		}
		s.close();
		
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i])
				max = numbers[i];
		}
		System.out.println("De grootste van de drie nummers is: " + max);
	}
		
	
}
