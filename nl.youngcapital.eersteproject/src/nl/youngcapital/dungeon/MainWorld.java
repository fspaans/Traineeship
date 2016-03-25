package nl.youngcapital.dungeon;

import java.util.Scanner;

public class MainWorld {

	public static void main(String[] args) {
		GameWorld world = new GameWorld();
		
		Square[][] create = {{new Road(), new Forest()},
							{new Room()},
							{new Room(), new Wall(), new Hallway()},
							{new Room(), new Room(), new Wall(), new Hallway()}};
		world.setWorld(create);
		
		Player player = new Player(0, 0);
		
		boolean game = true;
		Scanner s = new Scanner(System.in);
		
		while (game) {

			System.out.println(world.toString(player));
			System.out.println(world.getSquare(player.getX(), player.getY()).getDescription());
			System.out.println("Where are you going? [N/S/W/E]");
			String dir = s.next();
			switch (dir) {
				case "N": player.moveUp(); break;
				case "S": player.moveDown(); break;
				case "W": player.moveLeft(); break;
				case "E": player.moveRight(); break;
			}
		}
	}
}
