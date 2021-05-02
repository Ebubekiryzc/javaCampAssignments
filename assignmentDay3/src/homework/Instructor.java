package homework;

public class Instructor extends User {
	private String firstName;
	private String lastName;
	private String[] ownedCourses;
	private String profession;

	public Instructor(int userId, String userMail, String firstName, String lastName, String[] ownedCourses,
			String profession) {
		super(userId, userMail);
		this.firstName = firstName;
		this.lastName = lastName;
		this.ownedCourses = ownedCourses;
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String[] getOwnedCourses() {
		return ownedCourses;
	}

	public void setOwnedCourses(String[] ownedCourses) {
		this.ownedCourses = ownedCourses;
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
