package homework;

public class CourseManager {

	public Course[] addCourse(Course[] courseArray, Course course) {
		Course[] recentCourseArray = new Course[courseArray.length + 1];
		for (int i = 0; i < courseArray.length; i++) {
			// Normalde ArrayList biliyor olsaydık onunla yapmak daha mantıklıydı, tekrar
			// kopyalama işlemleri saçmalık!
			recentCourseArray[i] = courseArray[i];
		}
		recentCourseArray[recentCourseArray.length - 1] = course;
		System.out.println(course.name + "kursu, " + course.courseCategory.name + " kategorisine eklendi!");
		return recentCourseArray;
	}

	public Course[] deleteCourse(Course[] courseArray, Course course) {
//		Kurs silinmiş mi diye kontrol etmek için gerekli değişken tanımı:
		int oldCourseCount = course.courseCategory.getOwnedCourseCount();
//		Silme Döngüsü:
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
			System.out.println("Bu id değerine sahip bir kurs bulunamadı!");
//			Bir değişiklik olmayacağı için yollanan dizi aynı şekilde geri döndürülür:
			return courseArray;
		} else {
//			Bir eleman çıkarılmış dizinin tutulması için yeni bir dizi oluşturulur:
			Course[] recentCourseArray = new Course[courseArray.length - 1];
//			recentCourseArray için gerekli indisçi:
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