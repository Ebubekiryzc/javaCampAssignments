package homework;

public class CourseManager {

	public Course[] addCourse(Course[] courseArray, Course course) {
		Course[] recentCourseArray = new Course[courseArray.length + 1];
		for (int i = 0; i < courseArray.length; i++) {
			// Normalde ArrayList biliyor olsayd�k onunla yapmak daha mant�kl�yd�, tekrar
			// kopyalama i�lemleri sa�mal�k!
			recentCourseArray[i] = courseArray[i];
		}
		recentCourseArray[recentCourseArray.length - 1] = course;
		System.out.println(course.name + "kursu, " + course.courseCategory.name + " kategorisine eklendi!");
		return recentCourseArray;
	}

	public Course[] deleteCourse(Course[] courseArray, Course course) {
//		Kurs silinmi� mi diye kontrol etmek i�in gerekli de�i�ken tan�m�:
		int oldCourseCount = course.courseCategory.getOwnedCourseCount();
//		Silme D�ng�s�:
		for (int i = 0; i < courseArray.length; i++) {
			if (courseArray[i].id == course.id) {
				courseArray[i] = null;
				course.courseCategory.setOwnedCourseCount(course.courseCategory.getOwnedCourseCount() - 1);
				System.out.println(course.name + " kursu, " + course.courseCategory.name + " kategorisinden silindi!");
			} else {
				continue;
			}
		}
		if (course.courseCategory.getOwnedCourseCount() == oldCourseCount) {
			System.out.println("Bu id de�erine sahip bir kurs bulunamad�!");
//			Bir de�i�iklik olmayaca�� i�in yollanan dizi ayn� �ekilde geri d�nd�r�l�r:
			return courseArray;
		} else {
//			Bir eleman ��kar�lm�� dizinin tutulmas� i�in yeni bir dizi olu�turulur:
			Course[] recentCourseArray = new Course[courseArray.length - 1];
//			recentCourseArray i�in gerekli indis�i:
			int index = 0;
			for (Course copyCourse : courseArray) {
				if (copyCourse == null) {
					continue;
				} else {
					recentCourseArray[index] = copyCourse;
					index++;
				}
			}
			return recentCourseArray;
		}
	}

}