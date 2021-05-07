package gameProject.entities;

import gameProject.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private int yearOfRelease;
	private String name;
	private String gameType;
	private String properties;
	private double price;

	public Game(String name, String gameType, String properties, int yearOfRelease, double price) {
		this.name = name;
		this.gameType = gameType;
		this.properties = properties;
		this.yearOfRelease = yearOfRelease;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
