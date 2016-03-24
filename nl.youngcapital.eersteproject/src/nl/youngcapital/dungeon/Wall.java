package nl.youngcapital.dungeon;

public class Wall extends Square {

private String description;
	
	@Override
	String getDescription() {
		return this.description;
	}

	@Override
	void setDescription(String description) {
		this.description = description;
	}
	
	public Wall(String desciption) {
		super(desciption);
	}
	
	public Wall() {
		super(WALL);
	}
}
