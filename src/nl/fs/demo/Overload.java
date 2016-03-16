package nl.fs.demo;

import java.util.Scanner;

public class Overload{
	
	static Scanner s = new Scanner(System.in);
	
	public static int aantalBytes(int x){		
		return 4;
	}
	public static int aantalBytes(long x){		
		return 8;
	}
	public static int aantalBytes(float x){		
		return 4;
	}
	public static int aantalBytes(char x){		
		return 2;
	}
	public static int aantalBytes(boolean x){		
		return 4;
	}
	
	public static boolean pastIn(int a, int b){
		if(a<=b){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main (String[] args){
		System.out.println("Vul waarde a in:");
		int a = aantalBytes(1000L);
		System.out.println("Vul waarde b in:");
		int b = aantalBytes(88.0f);
		System.out.println("a past in b is:" + pastIn(a,b));
	}
	
}