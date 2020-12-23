package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.world.World;

public class gridworld {
	
	World world = new World();
	Bug bug = new Bug();
	Flower flower = new Flower();
	
	world.show();
	bug.turn();
}
