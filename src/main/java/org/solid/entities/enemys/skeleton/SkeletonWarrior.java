package org.solid.entities.enemys.skeleton;

//Open for Extension, Closed for Modification
public class SkeletonWarrior extends Skeleton{

	public SkeletonWarrior(String name, int damage, int health, int shield, float probabilityLoot, int numBones) {
		super(name, damage, health, shield, probabilityLoot, numBones);
	}

}
