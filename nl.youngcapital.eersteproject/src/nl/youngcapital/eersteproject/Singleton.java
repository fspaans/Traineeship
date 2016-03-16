package nl.youngcapital.eersteproject;

public class Singleton {
	
	private static Singleton s;
	
	private Singleton() {
		s = this;
	}
	
	public static Singleton getS() {
		if(s == null)
			new Singleton();
		return s;
	}
}
