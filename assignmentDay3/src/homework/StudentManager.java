package homework;

public class StudentManager extends UserManager {

	@Override
	public User[] add(User[] userArray, User user) {
		if (user instanceof Student) {
			userArray = super.add(userArray, user);
			System.out.println("Öðrencinin kurslarý için veritabanýnda yer ayrýldý!");
		} else {
			System.out.println("Parametre olarak belirtilen kullanýcý bir öðrenci örneklemi deðil!");
		}
		return userArray;
	}

	@Override
	public User[] delete(User[] userArray, User user) {
		if (!(user instanceof Student)) {
			System.out.println("Böyle bir öðrenci bulunamadý!");
		} else {
//		Öðrenci dizide yoksa silinmeyecektir, bu yüzden silinme durumunu kontrol etmek için dizinin eski uzunluðunu kontrol ediyoruz.
			int arrayLength = userArray.length;
//		Dizinin silme iþlemine tabii tutulduktan sonraki halini referansýna eþitliyoruz ki dizinin yeni hali elimizde bir nesne olarak bulunsun.
			userArray = super.delete(userArray, user);
			if (arrayLength != userArray.length) {
				System.out.println("Öðrenciye ait bütün bilgiler veritabanýndan kaldýrýldý!");
			} else {
				System.out.println("Böyle bir öðrenci bulunamadý!");
			}
		}
		return userArray;
	}

	@Override
	public void showAllMembers(User[] users) {
		System.out.println("Sadece öðrencilerin ID deðerleri gösteriliyor...");
		for (User user : users) {
			if (user instanceof Student) {
				System.out.println("Kullanýcý ID: " + user.getUserId());
			}
		}
	}

}
