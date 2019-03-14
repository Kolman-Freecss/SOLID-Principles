package org.solid.entities.player;

import java.util.List;

public class PlayerSecond extends Player{
	
	/*	Open Closed Principle that the classes should be open for extension, but closed for modification. */
	
	private int timeToDead;
	
	public PlayerSecond(String name, int damage, int health, int shield, List<Object> inventory, int timeToDead) {
		super(name, damage, health, shield, inventory);
		this.timeToDead = timeToDead;
	}

	public int getTimeToDead() {
		return timeToDead;
	}

	public void setTimeToDead(int timeToDead) {
		this.timeToDead = timeToDead;
	}
	
}
