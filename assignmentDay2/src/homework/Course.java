package homework;

public class Course {
	int id;
	Category courseCategory;
	Lecturer courseLecturer;
	String name;
	int episodeCount;

	public Course(int id, Category courseCategory, Lecturer courseLecturer, String name, int episodeCount) {
		this.id = id;
		this.courseCategory = courseCategory;
		this.courseLecturer = courseLecturer;
		this.name = name;
		this.episodeCount = episodeCount;
	}

	public Course(int id, Category courseCategory, Lecturer courseLecturer) {
		this.id = id;
		this.courseCategory = courseCategory;
		this.courseLecturer = courseLecturer;
		this.name = "Unutulmuþ";
		this.episodeCount = 10;
	}
}
