package homework;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
// 		Bunlar i�in bir manager yazmad�m ancak yaz�labilir
//		E�itmenler:
		Lecturer enginDemirog = new Lecturer("Engin Demiro�", 35, "Yaz�l�m M�hendisli�i");
		Lecturer ebubekirYazici = new Lecturer("Ebubekir Yaz�c�", 21, "Bilgisayar M�hendisli�i");
//		Kategoriler:
		@SuppressWarnings("deprecation")
		Category programming = new Category("Programlama", new Date(2021, 4, 28), enginDemirog, 0);
		@SuppressWarnings("deprecation")
		Category forgotten = new Category("Unutulmu�", new Date(2021, 5, 14), ebubekirYazici, 0);
		Category empty = new Category("Bo� Kategori");

//		Manager nesnesi:
		CourseManager courseManager = new CourseManager();
//		Kurs dizisi:
		Course[] courses = {};
//		Kurslar:
		Course programmingIntro = new Course(1, programming, enginDemirog, "Programlamaya Giri� i�in Temel Kurs", 10);
		Course javaCamp = new Course(2, programming, enginDemirog,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", 16);
		Course cSharpCamp = new Course(3, programming, enginDemirog,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", 21);
		Course differentConstructor = new Course(4, forgotten, ebubekirYazici);
		Course unCategorized = new Course(5, empty, ebubekirYazici);

//		Ekleme i�lemleri:
		courses = courseManager.addCourse(courses, programmingIntro);
		courses = courseManager.addCourse(courses, javaCamp);
		courses = courseManager.addCourse(courses, cSharpCamp);
		courses = courseManager.addCourse(courses, differentConstructor);
		courses = courseManager.addCourse(courses, unCategorized);

//		Yazd�rma i�lemleri:
		printCourses(courses);

//		Silme i�lemleri:
		courses = courseManager.deleteCourse(courses, javaCamp);

//		Silme i�leminden sonra yazd�rma:
		printCourses(courses);
	}

	public static void printCourses(Course[] courses) {
		System.out.println("\nKurs Bilgileri Veriliyor...");
		System.out.println("----------------------------");
		for (Course course : courses) {
			System.out.print("Kurs id de�eri: " + course.id);
			System.out.print("\nKurs ad�: " + course.name);
			System.out.print("\nKurs kategorisi: " + course.courseCategory.name);
			System.out.print("\nKurs e�itmeni: " + course.courseLecturer.name);
			System.out.println("\nKurs b�l�m say�s�: " + course.episodeCount);
			System.out.println("----------------------------");
		}
		System.out.println();
	}
}
