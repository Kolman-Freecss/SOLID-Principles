package org.solid.entities;

import java.util.List;

import org.solid.entities.enemys.Enemy;
import org.solid.entities.player.Player;

public class Game {

	private Player player;
	private List<Enemy> enemies;
	private Difficulty difficulty;
	
	//Dependency Inversion that the Enemy it's a abstract class of Skeleton, Wizard...
	public Game(Player player, List<Enemy> enemies, Difficulty difficulty) {
		super();
		this.player = player;
		this.enemies = enemies;
		this.difficulty = difficulty;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public List<Enemy> getEnemies() {
		return enemies;
	}
	
	public void setEnemies(List<Enemy> enemies) {
		this.enemies = enemies;
	}
	
	public Difficulty getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
	
}
