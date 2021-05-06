package reCapDemo.entities;

import reCapDemo.abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastname;
	private int dateOfBirth;
	private String nationalId;

	public Customer(String firstName, String lastname, int dateOfBirth, String nationalId) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}