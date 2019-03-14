package org.solid.entities.enemys.skeleton;

import org.solid.entities.enemys.Enemy;

//Open for Extension, Closed for Modification
public class Skeleton extends Enemy{
	
	private int numBones;

	public Skeleton(String name, int damage, int health, int shield, float probabilityLoot, int numBones) {
		super(name, damage, health, shield, probabilityLoot);
		this.numBones = numBones;
	}

	public int getNumBones() {
		return numBones;
	}

	public void setNumBones(int numBones) {
		this.numBones = numBones;
	}

}
