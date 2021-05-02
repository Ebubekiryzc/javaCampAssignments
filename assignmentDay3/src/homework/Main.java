package homework;

public class Main {

	public static void main(String[] args) {
		// Var olan kullanıcılar için bir dizi:
		User[] users = {};
		// Kullanıcı tanımı:
		User user = new User(1, "kullanici@gmail.com");
		// Eğitmen tanımı:
		Instructor instructor = new Instructor(2, "engindemirog@gmail.com", "Engin", "Demiroğ", new String[] {},
				"Yazılım Mühendisliği");
		// Öğrenci tanımı:
		Student student = new Student(3, "Ebubekir", "YAZICI", "ebubekiryazi@gmail.com", new String[] {});

		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();

		ServiceManager manager = new ServiceManager();

		System.out.println("--Ekleme İşlemleri--");
		users = manager.add(userManager, users, user);
		users = manager.add(instructorManager, users, instructor);
		users = manager.add(studentManager, users, student);

		System.out.println("--Gösterim--");
		manager.showAllMembers(userManager, users);
		manager.showAllMembers(studentManager, users);
		manager.showAllMembers(instructorManager, users);

		System.out.println("--Silme İşlemleri--");
		// StudentManager ile silme işlemi yapılmak istendiğinde parametre olarak
		// gönderilen kullanıcı eğer student değilse silmez. Bu diğer bütün classlarda
		// da geçerlidir.
		users = manager.delete(studentManager, users, user);
		manager.showAllMembers(userManager, users);
		users = manager.delete(studentManager, users, student);
		manager.showAllMembers(userManager, users);

	}
}
