package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
	public static void main(String[] args) {
		
	World world = new World();

	world.show();
	
	Bug bug = new Bug();
	
	Location location = new Location(0, 0);
	
	world.add(location, bug);
	
	Random rand = new Random();
	int numX = rand.nextInt(10);
	int numY = rand.nextInt(10);
	
	Bug bug2 = new Bug();
	
	Location location2 = new Location(numX, numY);
	
	world.add(location2, bug2);
	
	bug2.setColor(Color.BLUE);
	bug2.turn();
	bug2.turn();
	
	Flower flower = new Flower();
	
	Location location3 = new Location(numX-1, numY);
	Location location4 = new Location(numX+1, numY);
	
	world.add(location3, flower);
	world.add(location4, flower);
	
	int locX = 0;
	int locY = 0;
	
	
	
	for (int i = 0; i < 100; i++) {
		Location loc = new Location(locX, locY);
		if (locX != numX && locY != numY) {
			world.add(loc, flower);
			locX = locX + 1;
			if (locX == 10) {
				locX = 0;
				locY += 1;
			}
		}
	}
	}
}
