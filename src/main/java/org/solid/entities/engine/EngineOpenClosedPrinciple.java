package org.solid.entities.engine;

import java.util.Date;

import org.solid.entities.Difficulty;

public class EngineOpenClosedPrinciple extends Engine{

	/*	Open Closed Principle that the classes should be open for extension, but closed for modification. */
	
	private String newTechnology;

	public EngineOpenClosedPrinciple(String name, Difficulty difficulty, Date producedYear, Character player,
			String newTechnology) {
		super(name, difficulty, producedYear, player);
		this.newTechnology = newTechnology;
	}
	
}
