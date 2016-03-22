package nl.youngcapital.eersteproject;

import java.util.Scanner;

public class rot13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = s.nextLine();
		System.out.println(rot13(str));
		s.close();
	}
	
	public static String rot13 (String str) {
		char[] ca = str.toCharArray();
		char[] code = new char[ca.length];
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == ' ') {
				code[i] = ' ';
			}
			else if ((int) ca[i] > 96) {
				code[i] =  (char) (((((int) ca[i] - (int)'a') + 13) % 26) + (int)'a');
			}
			else {
				code[i] =  (char) (((((int) ca[i] - (int)'A') + 13) % 26) + (int)'A');
			}
		}
		return new String(code);
	}
}
