package nl.youngcapital.dungeon;

public class Hallway extends Square {

private String description;
	
	@Override
	String getDescription() {
		return this.description;
	}

	@Override
	void setDescription(String description) {
		this.description = description;
	}
	
	public Hallway(String desciption) {
		super(desciption);
	}
	
	public Hallway() {
		super(HALL);
	}
}
