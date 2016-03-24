package nl.youngcapital.dungeon;

public abstract class Square {

	protected static final String WALL = "This is a wall. You can't go here.";
	protected static final String ROOM = "You are in a room.";
	protected static final String FOREST = "You are in a forest.";
	protected static final String ROAD = "You are on a road.";
	protected static final String HALL = "You are in a hallway.";
	
	abstract String getDescription();
	abstract void setDescription(String description);
	
	public Square(String description) {
		this.setDescription(description);
	}
}