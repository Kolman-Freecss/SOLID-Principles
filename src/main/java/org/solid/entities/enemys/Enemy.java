package org.solid.entities.enemys;

import org.solid.entities.character.Character;

//Open for Extension, Closed for Modification
public class Enemy extends Character{
	
	private float probabilityLoot;

	public Enemy(String name, int damage, int health, int shield, float probabilityLoot) {
		super(name, damage, health, shield);
		this.probabilityLoot = probabilityLoot;
	}

	public float getProbabilityLoot() {
		return probabilityLoot;
	}

	public void setProbabilityLoot(float probabilityLoot) {
		this.probabilityLoot = probabilityLoot;
	}
	
}
