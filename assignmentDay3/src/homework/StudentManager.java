package homework;

public class StudentManager extends UserManager {

	@Override
	public User[] add(User[] userArray, User user) {
		if (user instanceof Student) {
			userArray = super.add(userArray, user);
			System.out.println("��rencinin kurslar� i�in veritaban�nda yer ayr�ld�!");
		} else {
			System.out.println("Parametre olarak belirtilen kullan�c� bir ��renci �rneklemi de�il!");
		}
		return userArray;
	}

	@Override
	public User[] delete(User[] userArray, User user) {
		if (!(user instanceof Student)) {
			System.out.println("B�yle bir ��renci bulunamad�!");
		} else {
//		��renci dizide yoksa silinmeyecektir, bu y�zden silinme durumunu kontrol etmek i�in dizinin eski uzunlu�unu kontrol ediyoruz.
			int arrayLength = userArray.length;
//		Dizinin silme i�lemine tabii tutulduktan sonraki halini referans�na e�itliyoruz ki dizinin yeni hali elimizde bir nesne olarak bulunsun.
			userArray = super.delete(userArray, user);
			if (arrayLength != userArray.length) {
				System.out.println("��renciye ait b�t�n bilgiler veritaban�ndan kald�r�ld�!");
			} else {
				System.out.println("B�yle bir ��renci bulunamad�!");
			}
		}
		return userArray;
	}

	@Override
	public void showAllMembers(User[] users) {
		System.out.println("Sadece ��rencilerin ID de�erleri g�steriliyor...");
		for (User user : users) {
			if (user instanceof Student) {
				System.out.println("Kullan�c� ID: " + user.getUserId());
			}
		}
	}

}
