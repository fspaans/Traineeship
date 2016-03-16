package nl.youngcapital.eersteproject;

public class AantalBytes {

	private int size;
	
	public AantalBytes(boolean b) throws Exception { throw new IllegalArgumentException("Booleans zijn niet duidelijk."); }
	
	public AantalBytes(byte b) { this.size = 1; }
	
	public AantalBytes(short s) { this.size = 2; }
	public AantalBytes(char c) { this.size = 2; }
	
	public AantalBytes(int i) { this.size = 4; }
	public AantalBytes(float f) { this.size = 4; }
	
	public AantalBytes(long l) { this.size = 8; }
	public AantalBytes(double d) { this.size = 8; }
	
	public int getSize() {
		return this.size;
	}
}
