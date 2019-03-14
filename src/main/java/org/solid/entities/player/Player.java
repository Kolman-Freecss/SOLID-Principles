package org.solid.entities.player;

import java.util.List;

import org.solid.entities.character.Character;
import org.solid.entities.interfaces.Attack;

//Interface Segregation
public class Player extends Character implements Attack{

	/*	Open Closed Principle that the classes should be open for extension, but closed for modification. */
	
	private List<Object> inventory;
	
	public Player(String name, int damage, int health, int shield, List<Object> inventory) {
		super(name, damage, health, shield);
		this.inventory = inventory;
	}

	public List<Object> getInventory() {
		return inventory;
	}

	public void setInventory(List<Object> inventory) {
		this.inventory = inventory;
	}

	@Override
	public float distanceAttack() {
		
		float doDamage = 0f;
		
		doDamage += this.getDamage();
		
		return doDamage;
		
	}

	@Override
	public float shortAttack() {
		
		float doDamage = 0f;

		doDamage += this.getDamage();
		
		return doDamage;
		
	}
	
}
