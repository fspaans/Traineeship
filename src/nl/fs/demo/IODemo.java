package nl.fs.demo;

import java.util.Scanner;

public class IODemo{
	
	public static void main(String args[]){
		System.out.println("Enter a article:");
		
		Scanner s = new Scanner(System.in);
		String inputArticle = s.next();
		
		System.out.println("Enter a noun");
		String inputNoun = s.next();
		
		System.out.println("Enter a verb:");
		String inputVerb = s.next();
		
		System.out.println("uw invoer was: " + inputArticle+ " "+inputNoun+ " "+ inputVerb);
	}
}