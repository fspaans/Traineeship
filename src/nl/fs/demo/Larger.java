package nl.fs.demo;

import java.util.Scanner;

public class Larger{
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int input;
		int largestNumber=0;
		for(int i=0; i<3;i++){
			System.out.println("Vul een getal in:");
			input = Integer.valueOf(s.next());
			if(input > largestNumber){
				largestNumber = input;
			}

		}		
		System.out.println("Het grootste getal is: "+ largestNumber);

	}
}