package googleAuthorization;

public class GoogleAccount {
	private String firstName;
	private String lastName;
	private String gmail;
	private String password;

	public GoogleAccount() {
	}

	public GoogleAccount(String firstName, String lastName, String gmail, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gmail = gmail;
		this.password = password;
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

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
