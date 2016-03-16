package nl.youngcapital.eersteproject;

public class PastIn {
	int a;
	int b;
	public static void main(String[] args) throws Exception {
		char c = 'c';
		int i = 9;
		long l = 4;
		boolean b = true;
		boolean t = pastIn(l,c);
		System.out.println(t);
	}
	
	public static boolean pastIn(Object a, Object b) throws Exception{
		return aantalbytes(a.getClass().cast(a)) < aantalbytes(b.getClass().cast(b));
	}
	
	public static int aantalbytes(Object o) throws Exception { throw new IllegalArgumentException("Objecten mogen niet."); }
	
	public static int aantalbytes(Boolean b) throws Exception { throw new IllegalArgumentException("Booleans zijn niet duidelijk."); }
	
	public static int aantalbytes(Byte b) { return 1; }
	
	public static int aantalbytes(Short s) { return 2; }
	public static int aantalbytes(Character c) { return 2; }
	
	public static int aantalbytes(Integer i) { return 4; }
	public static int aantalbytes(Float f) { return 4; }
	
	public static int aantalbytes(Long l) { return 8; }
	public static int aantalbytes(Double d) { return 8; }
}
