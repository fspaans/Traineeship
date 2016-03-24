package nl.youngcapital.mobiles;

import java.util.ArrayList;

public class MobileMain {

	public static void main(String[] args) {
		ArrayList<MobilePhone> mp = new ArrayList<>();
		mp.add(new Samsung());
		mp.add(new Apple());
		
		for(MobilePhone m : mp) {
			System.out.print(m.getOS() + ": ");
			if(m instanceof USBCharger) {
				((USBCharger) m).charge();
			}
			else {
				System.out.println("Ik laad niet op.");
			}
		}
	}

}