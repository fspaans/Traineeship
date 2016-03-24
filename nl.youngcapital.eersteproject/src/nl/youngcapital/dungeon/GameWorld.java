package nl.youngcapital.dungeon;

public class GameWorld {

	private Square[][] world;
	
	public Square getSquare(int x, int y) {
		return world[y][x];
	}
	
	public void setWorld(Square[][] world) {
		this.world = world;
	}
	
	public Square getPlayerPos(Player p) {
		return getSquare(p.getX(),p.getY());
	}
	
	public String toString(Player p) {
		String s = "";
		String s1 = "";
		String s2 = "";
		for(int j = 0; j < world.length; j++) {
			for(int i = 0; i < world[j].length - 1; i++) {
				s1 += (getPlayerPos(p).equals(world[j][i])) ? "P-" : "o-";
				s2 += (j < world.length - 1 && i <= world[j+1].length-1) ? "| " : " ";
			}
			s1 += (getPlayerPos(p).equals(world[j][world[j].length-1])) ? "P" : "o";
			s2 += (j < world.length - 1 && world[j].length - 1 <= world[j+1].length-1) ? "| " : "  ";
			s += s1 + "\n" + s2 + "\n";
			s1 = "";
			s2 = "";
		}
		return s;
	}
}
