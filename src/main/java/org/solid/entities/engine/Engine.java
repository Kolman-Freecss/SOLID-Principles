package org.solid.entities.engine;

import java.util.Date;

import org.solid.entities.Difficulty;

public class Engine {

	private String name;
	private Difficulty difficulty;  
	private Date producedYear;
	private Character player;
	
	/* 		Dependency Inversion decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.		*/
	
	public Engine(String name, Difficulty difficulty, Date producedYear, Character player) {
		super();
		this.name = name;
		this.difficulty = difficulty;
		this.producedYear = producedYear;
		this.player = player;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Difficulty getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
	
	public Date getProducedYear() {
		return producedYear;
	}
	
	public void setProducedYear(Date producedYear) {
		this.producedYear = producedYear;
	}

}
