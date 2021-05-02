package homework;

import java.util.Date;

public class Category {
	String name;
	Date creationDate;
	Lecturer creater;
	private int ownedCourseCount;

	public Category(String name) {
		this.name = name;
		this.creationDate = null;
		this.creater = new Lecturer("Engin Demiroð", 30, "Software Engineer");
		this.setOwnedCourseCount(0);
	}

	public Category(String name, Date creationDate, Lecturer creater, int ownedCourseCount) {
		this.name = name;
		this.creationDate = creationDate;
		this.creater = creater;
		this.setOwnedCourseCount(ownedCourseCount);
	}

	public int getOwnedCourseCount() {
		return ownedCourseCount;
	}

	public void setOwnedCourseCount(int ownedCourseCount) {
		this.ownedCourseCount = ownedCourseCount;
	}

}
