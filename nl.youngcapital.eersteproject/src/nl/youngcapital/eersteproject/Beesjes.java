package nl.youngcapital.eersteproject;

public class Beesjes {

	class Dier {
	    private String naam;
	    public Dier(String n) {naam=n;}
	    public String getNaam() { return this.naam; }
	}
	class Vogel extends Dier{
	    public Vogel(String n){
	        super(n);
	    }
	    @Override
	    public String getNaam() { return "Vogel: " + super.getNaam(); }
	}
	
	class Dierenwinkel {
		private Dier[] dl;
		public Dier[] getVoorraad() {
			return dl;
		}
		
		public void setDierList(Dier[] dl) {
			this.dl = dl;
		}
	}
	
	class Vogelspeciaalzaak extends Dierenwinkel {
		@Override
		public Vogel[] getVoorraad() {
			return (Vogel[]) super.getVoorraad();
		}
		
		@Override
		public void setDierList(Dier[] dl) {
			super.setDierList(dl);
		}
	}
	
	public static void main(String[] args) {
		Beesjes b = new Beesjes();
		Dierenwinkel v = b.new Vogelspeciaalzaak();
		v.setDierList(new Vogel[]{b.new Vogel("Zwaluw"), b.new Vogel("Mus")});
		for(Dier vogel : v.getVoorraad())
			System.out.println(vogel.getNaam());
	}
}
