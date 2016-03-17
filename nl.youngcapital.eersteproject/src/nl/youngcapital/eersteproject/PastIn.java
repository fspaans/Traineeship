package nl.youngcapital.eersteproject;

public class PastIn {
	int a;
	int b;
	public static void main(String[] args) throws Exception {
		char c = 'c';
		int i = 9;
		long l = 4;
		boolean b = true;
		boolean t = pastIn(c,l);
		System.out.println(t);
	}
	
	public static boolean pastIn(Object a, Object b) throws Exception{
		return aantalbytes(a.getClass().cast(a)) <= aantalbytes(b.getClass().cast(b));
	}
	
	public static int aantalbytes(Object o) throws Exception {
		if (o instanceof Byte) {
			return 1;
		}
		else if (o instanceof Character || o instanceof Short) {
			return 2;
		}
		else if (o instanceof Integer || o instanceof Float) {
			return 4;
		}
		else if (o instanceof Long || o instanceof Double) {
			return 8;
		}
		else if (o instanceof Boolean) {
			throw new IllegalArgumentException("Booleans zijn niet duidelijk.");
		}
		else {
			throw new IllegalArgumentException("Objecten mogen niet."); 
		}
	}
}
