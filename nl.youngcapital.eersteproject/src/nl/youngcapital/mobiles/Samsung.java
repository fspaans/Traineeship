package nl.youngcapital.mobiles;

public class Samsung extends MobilePhone implements USBCharger {

	private String OS = "Android";
	
	public String getOS () {
		return this.OS;
	}
	
	public void charge() { System.out.println("Ik laad op.");}
}
