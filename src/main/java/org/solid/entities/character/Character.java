package org.solid.entities.character;

public class Character {

	/*	Open Closed Principle that the classes should be open for extension, but closed for modification. */
	
	private String name;
	private int damage;
	public int health;
	public int shield;
	
	public Character(String name, int damage, int health, int shield) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.shield = shield;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void attack(int damage) 
	{
		this.health -= damage;
	}
	
}
