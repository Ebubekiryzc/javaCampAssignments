package homework;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
// 		Bunlar için bir manager yazmadým ancak yazýlabilir
//		Eðitmenler:
		Lecturer enginDemirog = new Lecturer("Engin Demiroð", 35, "Yazýlým Mühendisliði");
		Lecturer ebubekirYazici = new Lecturer("Ebubekir Yazýcý", 21, "Bilgisayar Mühendisliði");
//		Kategoriler:
		@SuppressWarnings("deprecation")
		Category programming = new Category("Programlama", new Date(2021, 4, 28), enginDemirog, 0);
		@SuppressWarnings("deprecation")
		Category forgotten = new Category("Unutulmuþ", new Date(2021, 5, 14), ebubekirYazici, 0);
		Category empty = new Category("Boþ Kategori");

//		Manager nesnesi:
		CourseManager courseManager = new CourseManager();
//		Kurs dizisi:
		Course[] courses = {};
//		Kurslar:
		Course programmingIntro = new Course(1, programming, enginDemirog, "Programlamaya Giriþ için Temel Kurs", 10);
		Course javaCamp = new Course(2, programming, enginDemirog,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", 16);
		Course cSharpCamp = new Course(3, programming, enginDemirog,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", 21);
		Course differentConstructor = new Course(4, forgotten, ebubekirYazici);
		Course unCategorized = new Course(5, empty, ebubekirYazici);

//		Ekleme iþlemleri:
		courses = courseManager.addCourse(courses, programmingIntro);
		courses = courseManager.addCourse(courses, javaCamp);
		courses = courseManager.addCourse(courses, cSharpCamp);
		courses = courseManager.addCourse(courses, differentConstructor);
		courses = courseManager.addCourse(courses, unCategorized);

//		Yazdýrma iþlemleri:
		printCourses(courses);

//		Silme iþlemleri:
		courses = courseManager.deleteCourse(courses, javaCamp);

//		Silme iþleminden sonra yazdýrma:
		printCourses(courses);
	}

	public static void printCourses(Course[] courses) {
		System.out.println("\nKurs Bilgileri Veriliyor...");
		System.out.println("----------------------------");
		for (Course course : courses) {
			System.out.print("Kurs id deðeri: " + course.id);
			System.out.print("\nKurs adý: " + course.name);
			System.out.print("\nKurs kategorisi: " + course.courseCategory.name);
			System.out.print("\nKurs eðitmeni: " + course.courseLecturer.name);
			System.out.println("\nKurs bölüm sayýsý: " + course.episodeCount);
			System.out.println("----------------------------");
		}
		System.out.println();
	}
}
