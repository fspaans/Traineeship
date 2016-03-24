package nl.youngcapital.dungeon;

public class Player {

	private int x;
	private int y;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void moveUp() {
		--y;
	}
	
	public void moveDown() {
		++y;
	}
	
	public void moveLeft() {
		--x;
	}
	
	public void moveRight() {
		++x;
	}
}
