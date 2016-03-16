package nl.youngcapital.eersteproject;

class DecimalPrinter implements Runnable {
	private double number;
	private int currentDecimal;
	private int maxDigits;
	
	private int nthDecimal(int n){
		return (int)((number * Math.pow(10,n)) % 10);
	}
	
	private String digit2String(int x){
		switch(x){
		case 1:
			return "een";
		case 2:
			return "twee";
		case 3:
			return "drie";
		case 4:
			return "vier";
		case 5:
			return "vijf";
		case 6:
			return "zes";
		case 7:
			return "zeven";
		case 8:
			return "acht";
		case 9:
			return "negen";
		case 0:
			return "nul";
		default:
			throw new IllegalArgumentException(x + " ligt niet tussen nul en negen");
		}
	}
	
	public DecimalPrinter(double number, int maxDigits) {
		this.number = number;
		this.maxDigits = maxDigits;
	}

	@Override
	public void run() {
		while(this.currentDecimal < this.maxDigits){
		    System.out.println(digit2String(nthDecimal(this.currentDecimal++)));
		}
	}

}