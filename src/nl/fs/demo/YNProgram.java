package nl.fs.demo;

import java.util.Scanner;

public class YNProgram{
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String... args){
		
		String input;
		System.out.println( "Are you sure you want to quit [Y, N]?");
		input = String.valueOf(s.next());
		char ch = input.charAt(0);
		if(ch == 'Y'){
			System.out.println("Program terminated");
		}else if(ch == 'N'){
			System.out.println("Program is still running.");
		}else{
			System.out.println("You have not put in a valid character, please restart program.");
		}
	}
	
}