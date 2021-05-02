package homework;

public class Main {

	public static void main(String[] args) {
		// Var olan kullan�c�lar i�in bir dizi:
		User[] users = {};
		// Kullan�c� tan�m�:
		User user = new User(1, "kullanici@gmail.com");
		// E�itmen tan�m�:
		Instructor instructor = new Instructor(2, "engindemirog@gmail.com", "Engin", "Demiro�", new String[] {},
				"Yaz�l�m M�hendisli�i");
		// ��renci tan�m�:
		Student student = new Student(3, "Ebubekir", "YAZICI", "ebubekiryazi@gmail.com", new String[] {});

		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();

		ServiceManager manager = new ServiceManager();

		System.out.println("--Ekleme ��lemleri--");
		users = manager.add(userManager, users, user);
		users = manager.add(instructorManager, users, instructor);
		users = manager.add(studentManager, users, student);

		System.out.println("--G�sterim--");
		manager.showAllMembers(userManager, users);
		manager.showAllMembers(studentManager, users);
		manager.showAllMembers(instructorManager, users);

		System.out.println("--Silme ��lemleri--");
		// StudentManager ile silme i�lemi yap�lmak istendi�inde parametre olarak
		// g�nderilen kullan�c� e�er student de�ilse silmez. Bu di�er b�t�n classlarda
		// da ge�erlidir.
		users = manager.delete(studentManager, users, user);
		manager.showAllMembers(userManager, users);
		users = manager.delete(studentManager, users, student);
		manager.showAllMembers(userManager, users);

	}
}
