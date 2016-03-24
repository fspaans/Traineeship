package nl.youngcapital.dungeon;

public class Forest extends Square {

	private String description;
	
	@Override
	String getDescription() {
		return this.description;
	}

	@Override
	void setDescription(String description) {
		this.description = description;
	}
	
	public Forest(String desciption) {
		super(desciption);
	}
	
	public Forest() {
		super(FOREST);
	}
}
