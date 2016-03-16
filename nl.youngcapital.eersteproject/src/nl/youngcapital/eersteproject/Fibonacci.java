package nl.youngcapital.eersteproject;

public class Fibonacci {
	
	public static void main(String[] args) {

		int n = 10;
		System.out.println("Het " + n + "e getal in de reeks van Fibonacci is " + Fibonacci(n)); 
	}

	//returns the n-th Fibonacci number, n >= 1.
	public static int Fibonacci(int n) {
		return (n > 2) ? Fibonacci(n - 2) + Fibonacci(n - 1) : ((n == 2) ? 1 : 0);
	}
}
