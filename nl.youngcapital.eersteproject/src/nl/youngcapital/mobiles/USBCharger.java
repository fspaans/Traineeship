package nl.youngcapital.mobiles;

public interface USBCharger {
	default void charge() { System.out.println("Ik laad op."); }
}
