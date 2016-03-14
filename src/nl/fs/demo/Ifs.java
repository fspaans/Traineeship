package nl.fs.demo;

import java.util.Scanner;

public class Ifs{
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Vul waarde in voor x:");
		int x = Integer.valueOf(s.next());
		System.out.println("Vul waarde in voor y:");
		int y = Integer.valueOf(s.next());
		
		if(x/y == 5){
			x = 100;
			System.out.println("(A) x is nu: " + x);			
		}
		if(x*y == 5){
			x=1;
			System.out.println("(B) x is nu: " + x);			
		}
		if(x<y){
			x *= 2;
			System.out.println("x is nu verdubbeld: " + x);			
		}
		if( x>y ){
			x++;
			System.out.println("x is nu : " + x);			
		}
		
	}
}