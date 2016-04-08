package nl.fs.demo;

import java.util.Scanner;

public class Box{
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Vul de lengte van de doos in: ");
		int length = Integer.valueOf(s.next());
		System.out.println("Vul de breedte van de doos in:");
		int width = Integer.valueOf(s.next());
		System.out.println("Vul de hoogte van de doos in: ");
		int height = Integer.valueOf(s.next());
		double volume = length * width * height;
		double surface = 2*(length*width+length*height+height*width);
		
		System.out.println("Volume is: "+ volume +"m3");
		System.out.println("Oppervlakte is: "+ surface +"m2");
	}
	
}