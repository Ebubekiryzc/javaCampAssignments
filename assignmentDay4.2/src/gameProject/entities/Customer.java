package gameProject.entities;

import gameProject.abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private int yearOfBirth;
	private String nationalId;
	private String firstName;
	private String lastName;

	public Customer(int yearOfBirth, String nationalId, String firstName, String lastName) {
		super();
		this.yearOfBirth = yearOfBirth;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
