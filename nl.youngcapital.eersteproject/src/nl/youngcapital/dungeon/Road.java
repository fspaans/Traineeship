package nl.youngcapital.dungeon;

public class Road extends Square {

private String description;
	
	@Override
	String getDescription() {
		return this.description;
	}

	@Override
	void setDescription(String description) {
		this.description = description;
	}
	
	public Road(String desciption) {
		super(desciption);
	}
	
	public Road() {
		super(ROAD);
	}
}
