package nl.youngcapital.mobiles;

public class Samsung extends MobilePhone implements USBCharger {

	private String OS = "Android";
	
	@Override
	public String getOS () {
		return this.OS;
	}
}
