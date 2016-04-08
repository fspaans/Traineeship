package nl.fs.demo;

import java.util.Scanner;

public class Scores{ 
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args){
		int counter = 0;
		int input;
		
		for(int i=0; i<5;i++){
			System.out.println("Voer een getal in:");
			input = Integer.valueOf(s.next());
			if(input > 7){
				counter++;
			}
		}
		System.out.println("Aantal scores hoger dan 7:"+counter);
	}
	
}