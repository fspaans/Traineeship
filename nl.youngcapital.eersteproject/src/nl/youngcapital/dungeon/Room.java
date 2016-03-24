package nl.youngcapital.dungeon;

public class Room extends Square {

	private String description;
	
	@Override
	String getDescription() {
		return this.description;
	}

	@Override
	void setDescription(String description) {
		this.description = description;
	}
	
	public Room(String desciption) {
		super(desciption);
	}
	
	public Room() {
		super(ROOM);
	}
}
