package homework;

public class InstructorManager extends UserManager {

	@Override
	public User[] add(User[] userArray, User user) {
		if (user instanceof Instructor) {
			userArray = super.add(userArray, user);
			System.out.println("E�itmenin verece�i kurslar i�in veritaban�nda yer ayr�ld�!");
		} else {
			System.out.println("Parametre olarak belirtilen kullan�c� bir e�itmen �rneklemi de�il!");
		}
		return userArray;
	}

	@Override
	public User[] delete(User[] userArray, User user) {
		if (!(user instanceof Instructor)) {
			System.out.println("B�yle bir e�itmen bulunamad�!");
		} else {
//		E�itmen dizide yoksa silinmeyecektir, bu y�zden silinme durumunu kontrol etmek i�in dizinin eski uzunlu�unu kontrol ediyoruz.
			int arrayLength = userArray.length;
//		Dizinin silme i�lemine tabii tutulduktan sonraki halini referans�na e�itliyoruz ki dizinin yeni hali elimizde bir nesne olarak bulunsun.
			userArray = super.delete(userArray, user);
			if (arrayLength != userArray.length) {
				System.out.println("E�itmene ait b�t�n bilgiler veritaban�ndan kald�r�ld�!");
			} else {
				System.out.println("B�yle bir ��renci bulunamad�!");
			}
		}
		return userArray;
	}

	@Override
	public void showAllMembers(User[] users) {
		System.out.println("Sadece e�itmenlerin ID de�erleri g�steriliyor...");
		for (User user : users) {
			if (user instanceof Instructor) {
				System.out.println("Kullan�c� ID: " + user.getUserId());
			}
		}
	}

}
