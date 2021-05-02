package homework;

public class Student extends User {
	private String firstName;
	private String lastName;
	// Normalde Course diye bir class da açabilirdim, ancak hoca sadece
	// Student, Instructor, User classlarý olsun dedi.
	private String[] attendedCourses;

	public Student(int userId, String userMail, String firstName, String lastName, String[] attendedCourses) {
		super(userId, userMail);
		this.firstName = firstName;
		this.lastName = lastName;
		this.attendedCourses = attendedCourses;
	}

	public String[] getAttendedCourses() {
		return attendedCourses;
	}

	public void setAttendedCourses(String[] attendedCourses) {
		this.attendedCourses = attendedCourses;
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
