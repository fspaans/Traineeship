package nl.fs.demo;

import java.util.Scanner;

public class Validation{
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int input;
		
		do{
			System.out.println("Vul een getal in ONDER 11:");
			input = Integer.valueOf(s.next());
			
			
		}while(input < 11);
		System.out.println("Je hebt hoger dan 10 ingevuld, EINDE PROGRAMMA");
	}
	
}