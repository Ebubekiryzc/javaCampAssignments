package eCommerceProject.entity.concretes;

import eCommerceProject.entity.abstracts.Entity;

public class User implements Entity {
	private int userId;
	private String firstName;
	private String lastName;
	private String userMail;
	private String password;

	public User() {
	}

	public User(int userId, String firstName, String lastName, String userMail, String password) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userMail = userMail;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
