package nl.youngcapital.eersteproject;

public class PastIn {
	int a;
	int b;
	public static void main(String[] args) throws Exception {
		char c = 'c';
		int i = 9;
		long l = 4;
		boolean b = true;
		System.out.println(pastIn(new AantalBytes(l),new AantalBytes(c)));
	}
	
	public static boolean pastIn(AantalBytes a, AantalBytes b){
		return a.getSize() <= b.getSize();
	}
	
}
