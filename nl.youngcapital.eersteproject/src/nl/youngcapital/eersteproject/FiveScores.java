package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class FiveScores {

	public static void main(String[] args) { 
		int[] scores = new int[5];
		Scanner s = new Scanner(System.in);
		int bts = 0;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("Voer de " + (i+1) + "e score in:");
			scores[i] = Integer.valueOf(s.next());
		}
		s.close();
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > 7)
				bts++;
		}
		System.out.println("Er zijn " + bts + " scores hoger dan 7.");
		
	}
}
