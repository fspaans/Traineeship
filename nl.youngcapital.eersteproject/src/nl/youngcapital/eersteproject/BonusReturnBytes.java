package nl.youngcapital.eersteproject;

public class BonusReturnBytes {
	public static void main(String[] args) throws Exception {
		char c = 'c';
		boolean b = true;
		System.out.println(aantalbytes(b));
	}

	public static int aantalbytes(boolean b) throws Exception { throw new IllegalArgumentException("Booleans zijn niet duidelijk."); }
	public static int aantalbytes(Object o) throws Exception { throw new IllegalArgumentException("Objecten mogen niet."); }
	
	public static int aantalbytes(byte b) { return 1; }
	
	public static int aantalbytes(short s) { return 2; }
	public static int aantalbytes(char c) { return 2; }
	
	public static int aantalbytes(int i) { return 4; }
	public static int aantalbytes(float f) { return 4; }
	
	public static int aantalbytes(long l) { return 8; }
	public static int aantalbytes(double d) { return 8; }
}
